package com.pluralsight.dao;

import com.pluralsight.model.Category;
import com.pluralsight.model.Product;
import org.springframework.stereotype.Component;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ProductDAOImpl implements ProductDAO{

    private final Map<Integer, Product> products = new HashMap<>();
    private final DecimalFormat twoDP = new DecimalFormat("#.00");

    public ProductDAOImpl() {
        products.put(1, new Product(1,3,"Hot Chocolate","Beverage", Double.parseDouble(twoDP.format(5.00))));
        products.put(2, new Product(2,3,"Mountain Dew","Beverage", Double.parseDouble(twoDP.format(3.00))));
        products.put(3, new Product(3,7,"Grits","Grain", Double.parseDouble(twoDP.format(2.00))));
        products.put(4, new Product(4,4,"Twizzlers","Candy", Double.parseDouble(twoDP.format(4.00))));
        products.put(5, new Product(5,4,"Snickers","Candy", Double.parseDouble(twoDP.format(2.00))));
        products.put(6, new Product(6,1,"Jamon Serrano","Meat", Double.parseDouble(twoDP.format(23.00))));
        products.put(7, new Product(7,5,"Apple","Fruit", Double.parseDouble(twoDP.format(1.00))));
        products.put(8, new Product(8,5,"Grapes","Fruit", Double.parseDouble(twoDP.format(3.00))));
        products.put(9, new Product(9,6,"Celery","Vegetable", Double.parseDouble(twoDP.format(2.00))));
        products.put(10, new Product(10,8,"Rice Wine","Spirits", Double.parseDouble(twoDP.format(10.00))));
        products.put(11, new Product(11,7,"Brown Rice","Grain", Double.parseDouble(twoDP.format(2.00))));
        products.put(12, new Product(12,2,"Pepperjack Cheese","Cheese", Double.parseDouble(twoDP.format(4.00))));
    }

    @Override
    public List<Product> allProducts() {
        return new ArrayList<>(products.values());
    }
}
