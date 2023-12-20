package com.pluralsight.controller;

import com.pluralsight.model.Category;
import com.pluralsight.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class CategoryController {

    private final CategoryService categoryService;


    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping(path="/category/cID/{cID}")
    public List<Category> getCategoryByCategoryId(@PathVariable int cID){
        List<Category> chosenCategory = new ArrayList<>();
        for(Category c: categoryService.allCategories()){
            if(c.getCategoryId() == cID){
                chosenCategory.add(c);
            }
        }
        return chosenCategory;
    }

    @GetMapping(path="/category/name/{name}")
    public List<Category> getCategoryByCategoryName(@PathVariable String name){
        List<Category> chosenCategory = new ArrayList<>();
        for(Category c: categoryService.allCategories()){
            if(c.getCategoryName().equalsIgnoreCase(name)){
                chosenCategory.add(c);
            }
        }
        return chosenCategory;
    }
}
