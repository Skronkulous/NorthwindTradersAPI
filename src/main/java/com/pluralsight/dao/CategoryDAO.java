package com.pluralsight.dao;

import com.pluralsight.model.Category;

import java.sql.SQLException;
import java.util.List;

public interface CategoryDAO {

    List<Category> allCategories() throws SQLException;

    Category findByCategoryId(int id);
}
