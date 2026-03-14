package com.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.hibernate.entity.Product;
import com.hibernate.util.HibernateUtil;

public class HQLDemo {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        // 1️⃣ Fetch all products
        List<Object[]> list = session.createQuery(
                "SELECT p.description, COUNT(p) FROM Product p GROUP BY p.description"
        ).list();

        for (Object[] row : list) {
            System.out.println(
                "Description = " + row[0] +
                ", Count = " + row[1]
            );
        }





        session.close();
    }
}
