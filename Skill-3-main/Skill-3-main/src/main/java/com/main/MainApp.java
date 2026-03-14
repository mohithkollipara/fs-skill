package com.main;

import com.dao.ProductDAO;
import com.hibernate.entity.Product;


public class MainApp {

    public static void main(String[] args) {

        ProductDAO dao = new ProductDAO();

        Product p = new Product(
                "Laptop",
                "Gaming Laptop",
                75000.00,                5
        );

        dao.saveProduct(p);

        System.out.println("Product saved successfully");
    }
}
