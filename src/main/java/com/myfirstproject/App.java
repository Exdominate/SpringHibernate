package com.myfirstproject;

import org.hibernate.Session;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Maven + Hibernate");
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        User user = new User();
        
        
        user.setName("Jane");
        user.setSurname("Austen");
        user.setPosition("writer");
        user.setSalary(5.5);
        
        User user2 = new User();
        
        
        user2.setName("Vasilit");
        user2.setSurname("AUGUST");
        user2.setPosition("reader");
        user2.setSalary(22.8);
        
        session.save(user);
        session.save(user2);
        session.getTransaction().commit();

    }
}
