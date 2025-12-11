package com.pluralsight.northwind.controllers;

import com.pluralsight.northwind.model.Category;
import com.pluralsight.northwind.model.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @RequestMapping(path = "products")
    public List<Product> getAll() {
        List<Product> products = getProducts();
        return products;
    }

    @RequestMapping(path = "products/{id}")
    public Product findById(@PathVariable int id) {

        List<Product> products = getProducts();

        Product foundProduct = products.stream()
                                        .filter(c -> c.getProductId() == id)
                                        .findFirst().orElse(null);
        return foundProduct;
    }


    private static List<Product> getProducts() {
        List<Product> products = new ArrayList<>();

        products.add(new Product(1, "Radiant Glow Vitamin C Serum", 1, 24.99));
        products.add(new Product(2, "HydraBoost Hyaluronic Acid Moisturizer", 1, 29.50));
        products.add(new Product(3, "Midnight Renewal Retinol Cream", 1, 34.75));
        products.add(new Product(4, "Soothing Aloe Vera Gel", 1, 12.99));
        products.add(new Product(5, "Rosewater Hydrating Face Mist", 1, 15.49));
        products.add(new Product(6, "Charcoal Detox Clay Mask", 1, 18.25));
        products.add(new Product(7, "Silky Smooth SPF 50 Sunscreen", 1, 22.99));
        products.add(new Product(8, "Lavender Dream Night Moisturizer", 1, 27.89));
        products.add(new Product(9, "Deep Clean Green Tea Cleanser", 1, 13.75));
        products.add(new Product(10, "Youthful Essence Collagen Serum", 1, 32.40));

        return products;
    }

}
