package com.pluralsight.dao;

import com.pluralsight.model.Category;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class CategoryDAOImpl implements CategoryDAO{
    private final Map<Integer, Category> categories = new HashMap<>();

    public CategoryDAOImpl() {
        categories.put(1, new Category(1, "Meat"));
        categories.put(2, new Category(2, "Cheese"));
        categories.put(3, new Category(3, "Beverage"));
        categories.put(4, new Category(4, "Candy"));
        categories.put(5, new Category(5, "Fruit"));
        categories.put(6, new Category(6, "Vegetable"));
        categories.put(7, new Category(7, "Grain"));
        categories.put(8, new Category(8, "Spirits"));
    }

    @Override
    public List<Category> allCategories() {
        return new ArrayList<>(categories.values());
    }
}
