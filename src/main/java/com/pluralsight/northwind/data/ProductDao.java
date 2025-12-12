package com.pluralsight.northwind.data;

import com.pluralsight.northwind.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getAll();
    Product getById(int id);
    Product insert(Product product);
    void update(int productId, Product product);
}
