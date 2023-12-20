package com.pluralsight.service;

import com.pluralsight.dao.ProductDAO;
import com.pluralsight.model.Product;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;

@Component
public class ProductService {

    private final ProductDAO productDAO;

    public ProductService(ProductDAO productDAOImpl) {
        this.productDAO = productDAOImpl;
    }

    public List<Product> allProducts(){
        return productDAO.allProducts();
    }
}
