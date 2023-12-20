package com.pluralsight.service;

import com.pluralsight.dao.CategoryDAO;
import com.pluralsight.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategoryService {
    private final CategoryDAO categoryDAO;

    public CategoryService(CategoryDAO categoryDAOImpl) {
        this.categoryDAO = categoryDAOImpl;
    }

    public List<Category> allCategories(){
        return categoryDAO.allCategories();
    }
}
