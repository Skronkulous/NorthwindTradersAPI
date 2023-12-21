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
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ProductDAOImpl implements ProductDAO{

    private DataSource dataSource;
    private final DecimalFormat twoDP = new DecimalFormat("#.00");

    @Autowired
    public ProductDAOImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Product> allProducts() {
        List<Product> products = new ArrayList<>();
        String query = "SELECT * FROM products";
        try(Connection conn = dataSource.getConnection()) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            System.out.println("* CONNECTED *");
            while(rs.next()){
                Product product = new Product();
                product.setProductID(Integer.parseInt(rs.getString("ProductID")));
                product.setCategoryID(Integer.parseInt(rs.getString("CategoryID")));
                product.setProductName(rs.getString("ProductName"));
                product.setQpu(rs.getString("QuantityPerUnit"));
                product.setUnitPrice(Double.parseDouble(rs.getString("UnitPrice")));
                products.add(product);
            }
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return products;
    }

    @Override
    public Product findByProductId(int id) {
        String query = "SELECT * FROM products WHERE ProductID = " + id;
        Product product = new Product();
        try(Connection conn = dataSource.getConnection()) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                product.setProductID(Integer.parseInt(rs.getString("ProductID")));
                product.setCategoryID(Integer.parseInt(rs.getString("CategoryID")));
                product.setProductName(rs.getString("ProductName"));
                product.setQpu(rs.getString("QuantityPerUnit"));
                product.setUnitPrice(Double.parseDouble(rs.getString("UnitPrice")));
            }
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return product;
    }
}
