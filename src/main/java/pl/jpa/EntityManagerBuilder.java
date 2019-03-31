package pl.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerBuilder {

    public static EntityManager getEntityManager(){
        EntityManagerFactory emf = Persistence.
                createEntityManagerFactory("test");
        EntityManager entityManager = emf.createEntityManager();
        return emf.createEntityManager();
    }
}
