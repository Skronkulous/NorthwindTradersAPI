package com.pluralsight.controller;

import com.pluralsight.model.Category;
import com.pluralsight.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.*;

@RestController
public class CategoryController {

    private final CategoryService categoryService;


    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping(path="/category/cID/{cID}")
    public Category getCategoryByCategoryId(@PathVariable int cID) throws SQLException {
    return categoryService.categoryById(cID);
    }

    @GetMapping(path="/category/name/{name}")
    public List<Category> getCategoryByCategoryName(@PathVariable String name) throws SQLException {
        List<Category> chosenCategory = new ArrayList<>();
        for(Category c: categoryService.allCategories()){
            if(c.getCategoryName().equalsIgnoreCase(name)){
                chosenCategory.add(c);
            }
        }
        return chosenCategory;
    }
}
