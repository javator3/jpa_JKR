package pl.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class EntityManagerOtherOperations {


    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.
                createEntityManagerFactory("test");
        EntityManager entityManager = emf.createEntityManager();

        entityManager.getTransaction().begin();

        Employee employee = entityManager.find(Employee.class,2L); // Long bo id jest longiem
//        System.out.println(employee);
//        employee.setName("PracownikZaktualizowany");
        // tu można dodać entityManager.persistance ale nie trzeba, bo wszystko pod spoodem i tak wykona się tak samo

//        entityManager.remove(employee);

        entityManager.detach(employee);
        employee.setSalary(1234561L);

        entityManager.getTransaction().commit();


        entityManager.getTransaction().begin();

        entityManager.merge(employee); // pobiera obiekt z jednej tranasakci i zapisuje w drugiej(?);
        //merge tylko przy detachu lub ew. jako zamiennik persist

        entityManager.getTransaction().commit();

    }
}
