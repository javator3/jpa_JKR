package pl.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

public class EntityManagerPersistence {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.
                createEntityManagerFactory("test");
        EntityManager entityManager = emf.createEntityManager();

        entityManager.getTransaction().begin();

//        Employee pracownik1 = new Employee("Pracownik1", 12345L);
//        entityManager.persist(pracownik1);

        Product product1 = new Product("name1", BigDecimal.TEN);
        entityManager.persist(product1);

        Product product2 = new Product("name1", BigDecimal.TEN);
        entityManager.persist(product2);


        entityManager.getTransaction().commit();

    }
}
