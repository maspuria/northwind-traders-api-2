package com.pluralsight.northwind.controllers;


import com.pluralsight.northwind.data.ProductDao;
import com.pluralsight.northwind.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {
    ProductDao productDao;

    @Autowired
    public ProductController(ProductDao productDao) {
        this.productDao = productDao;
    }

    @RequestMapping(path = "products")
    public List<Product> getAll() {
        List<Product> products = productDao.getAll();

        return products;
    }

    @RequestMapping(path = "products/{id}")
    public Product findById(@PathVariable int id) {
        return productDao.getById(id);
    }

}
