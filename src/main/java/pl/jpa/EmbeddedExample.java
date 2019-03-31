package pl.jpa;

import javax.persistence.EntityManager;

public class EmbeddedExample {

    public static void main(String[] args) {


        EntityManager entityManager = EntityManagerBuilder.getEntityManager();

        entityManager.getTransaction().begin();

        Client client = new Client("firstname", "lastname");
        client.setAddress (new Address("street", "city", "postcode"));
        entityManager.persist(client);
    }
}
