package com.pluralsight.controller;

import com.pluralsight.model.Category;
import com.pluralsight.model.Product;
import com.pluralsight.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(path="/product/pID/{pID}")
    public List<Product> getProductByProductId(@PathVariable int pID){
        List<Product> chosenProduct = new ArrayList<>();
        for(Product p: productService.allProducts()){
            if(p.getProductID() == pID){
                chosenProduct.add(p);
            }
        }
        return chosenProduct;
    }

    @GetMapping(path="/product/name/{name}")
    public List<Product> getProductByProductName(@PathVariable String name){
        List<Product> chosenProduct = new ArrayList<>();
        for(Product p: productService.allProducts()){
            if(p.getProductName().equalsIgnoreCase(name)){
                chosenProduct.add(p);
            }
        }
        return chosenProduct;
    }

    @GetMapping(path="/product/cID/{cID}")
    public List<Product> getProductByCategoryId(@PathVariable int cID){
        List<Product> chosenProduct = new ArrayList<>();
        for(Product p: productService.allProducts()){
            if(p.getCategoryID() == cID){
                chosenProduct.add(p);
            }
        }
        return chosenProduct;
    }

    @GetMapping(path="/product/price/{price}")
    public List<Product> getProductByUnitPrice(@PathVariable double price){
        List<Product> chosenProduct = new ArrayList<>();
        for(Product p: productService.allProducts()){
            if(p.getUnitPrice() == price){
                chosenProduct.add(p);
            }
        }
        return chosenProduct;
    }
}
