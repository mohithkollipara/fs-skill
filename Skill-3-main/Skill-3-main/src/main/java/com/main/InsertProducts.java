package com.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.entity.Product;
import com.hibernate.util.HibernateUtil;

public class InsertProducts {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Product p1 = new Product("Laptop", "Electronics", 55000, 5);
        Product p2 = new Product("Mobile", "Electronics", 25000, 10);
        Product p3 = new Product("Table", "Furniture", 7000, 3);
        Product p4 = new Product("Chair", "Furniture", 3000, 0);
        Product p5 = new Product("Pen", "Stationery", 20, 100);
        Product p6 = new Product("Notebook", "Stationery", 80, 50);

        session.save(p1);
        session.save(p2);
        session.save(p3);
        session.save(p4);
        session.save(p5);
        session.save(p6);

        tx.commit();
        session.close();

        System.out.println("Products inserted successfully");
    }
}
