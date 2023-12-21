package com.pluralsight.dao;

import com.pluralsight.model.Product;
import java.util.List;
public interface ProductDAO {

    List<Product> allProducts();

    Product findByProductId(int id);
}
