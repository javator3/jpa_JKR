package pl.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserOperationExample {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.
                createEntityManagerFactory("test");
        EntityManager entityManager = emf.createEntityManager();

        entityManager.getTransaction().begin();
//        entityManager.persist(new User("nowyLogin"));
        User user = entityManager.find(User.class, 1L);
        user.setLogin("ZaktuaizowanyLogin");
        entityManager.getTransaction().commit();

    }
}
