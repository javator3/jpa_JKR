package pl.jpa.biderctional;

import pl.jpa.EntityManagerBuilder;
import pl.jpa.undirectional.Post;
import pl.jpa.undirectional.PostDetails;

import javax.persistence.EntityManager;

public class PostOneToOneExample2 {
    public static void main(String[] args) {
        EntityManager entityManager = EntityManagerBuilder.getEntityManager();

        entityManager.getTransaction().begin();

        Post post1 = new Post("post1");
        post1.setDetails(new PostDetails("content"));

        entityManager.getTransaction().commit();
    }
}
