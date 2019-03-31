package pl.jpa;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

public class SelectEmployeeExample {

    public static void main(String[] args) {
        EntityManager entityManager = EntityManagerBuilder.getEntityManager();

        entityManager.getTransaction().begin();

        TypedQuery<Employee>query = entityManager
                .createQuery("select e from Employee e", Employee.class);

        List<Employee>resultList = query.getResultList();

        resultList.stream()
                .forEach(employee -> System.out.println(employee));


        TypedQuery<Employee> query1 = entityManager
                .createQuery("select e from Employee e where e.name = ?1", Employee.class);
        query1.setParameter(1, "name2");
        List<Employee>resultList1 = query1.getResultList();
        resultList1.stream()
                .forEach(employee -> System.out.println(employee));

        TypedQuery<Employee> query2 = entityManager
                .createQuery("select e from Employee e where e.name = :employeeName", Employee.class);
        query2.setParameter("empoyeeName", "name3");
        List<Employee>resultList2 = query1.getResultList();
        resultList2.stream()
                .forEach(employee -> System.out.println(employee));

        //w jedynym zapisie
        entityManager.createQuery("select from e from Employee e where e.name = :employeeName", Employee.class)
                .setParameter("employeeName", "name2")
                .getResultList()
                .stream()
                .forEach(employee -> System.out.println(employee));



        entityManager.getTransaction().commit();


    }
}

