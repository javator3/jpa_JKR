package pl.jpa;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class JpqlExercises {

    public static void main(String[] args) {

        EntityManager entityManager = EntityManagerBuilder.getEntityManager();

        //posortowane według imienia

//        entityManager.getTransaction().begin();
//
//        TypedQuery<Employee>query = entityManager
//                .createQuery("select e from Employee e order by name asc", Employee.class);
//
//        List<Employee>resultList = query.getResultList();
//
//        resultList.stream()
//                .forEach(employee -> System.out.println(employee));
//
//        entityManager.getTransaction().commit();
//
//        //zarobki powyżej 200
//
//        entityManager.getTransaction().begin();
//
//        TypedQuery<Employee>query1 = entityManager
//                .createQuery("select e from Employee e where e.salary > 2000", Employee.class);
//
//        List<Employee>resultList1 = query.getResultList();
//
//        resultList.stream()
//                .forEach(employee -> System.out.println(employee));
//
//        entityManager.getTransaction().commit();

        //imiona na a

        entityManager.getTransaction().begin();

        TypedQuery<String>query2 = entityManager
                .createQuery("select e.name from Employee e where e.name like 'p%'", String.class);

        List<String>resultList2 = query2.getResultList();

        resultList2.stream()
                .forEach(employee -> System.out.println(employee));


        entityManager.getTransaction().commit();

    }


    }

