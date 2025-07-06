package com.example.jpa;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

public class JPAUserDAO {
    EntityManager em = Persistence.createEntityManagerFactory("jpa-unit").createEntityManager();

    public void save(JPAUser user) {
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
    }
}