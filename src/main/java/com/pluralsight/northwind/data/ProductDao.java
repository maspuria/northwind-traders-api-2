package com.pluralsight.northwind.data;

import com.pluralsight.northwind.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getAll();
    Product getById(int id);

}
