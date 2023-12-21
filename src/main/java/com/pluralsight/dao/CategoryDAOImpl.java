package com.pluralsight.dao;

import com.pluralsight.model.Category;
import com.pluralsight.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class CategoryDAOImpl implements CategoryDAO{
    private DataSource dataSource;
    private final Map<Integer, Category> categories = new HashMap<>();

    @Autowired
    public CategoryDAOImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Category> allCategories(){
        List<Category> categories = new ArrayList<>();
        String query = "SELECT * FROM categories";
        try(Connection conn = dataSource.getConnection()){
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            System.out.println("* CONNECTED *");
            while(rs.next()){
                Category category = new Category();
                category.setCategoryId(Integer.parseInt(rs.getString("CategoryID")));
                category.setCategoryName(rs.getString("CategoryName"));
                category.setDescription(rs.getString("Description"));
                categories.add(category);
            }
        }
        catch(Exception e){
            throw new RuntimeException(e);
        }
        return categories;
    }

    @Override
    public Category findByCategoryId(int id) {
        String query = "SELECT * FROM categories WHERE CategoryID = " + id;
        Category category = new Category();
        try(Connection conn = dataSource.getConnection()) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                category.setCategoryId(Integer.parseInt(rs.getString("CategoryID")));
                category.setCategoryName((rs.getString("CategoryName")));
                category.setDescription(rs.getString("Description"));
            }
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return category;
    }
}
