package com.example.hibernate;
import org.hibernate.Session;

public class HUserDAO {
    public void save(HUser user) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();
    }
}