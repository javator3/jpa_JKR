package pl.jpa;

import javax.persistence.EntityManager;

public class UpdateDeleteEmployeeExample {

    public static void main(String[] args) {
        EntityManager entityManager = EntityManagerBuilder.getEntityManager();

        entityManager.getTransaction().begin();

//        int update = entityManager
//                .createQuery("Update Employee e SET e.name = ?1 where e.name = ?2")
//                .setParameter(1, "name2")
//                .setParameter(2, "name5")
//                .executeUpdate();
//        System.out.println(update);
//
//
//        int update1 = entityManager
//                .createQuery("Delete from Employee e where e.salary < :maxSalary")
//                .setParameter("maxSalary", 10L)
//                .executeUpdate();
//        System.out.println(update1);


//        int update2 = entityManager
//                .createQuery(" Update Employee set salary = 2*salary where id < ?1")
//                .setParameter(1, 3)
//                .executeUpdate();
//        System.out.println(update2);

        int update3 = entityManager
                .createQuery("Delete from Employee e where e.name = :chosenName")
                .setParameter("chosenName", "name1")
                .executeUpdate();
        System.out.println(update3);

        entityManager.getTransaction().commit();

    }

}
