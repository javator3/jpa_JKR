package pl.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Optional;
import java.util.Scanner;

public class EntityManagerExercises {

    public static void main(String[] args) {
//      showSalary();
      addEmployees();
//      removeEmployee();
    }

    public static void  showSalary () {
        EntityManagerFactory emf = Persistence.
                createEntityManagerFactory("test");
        EntityManager entityManager = emf.createEntityManager();

        entityManager.getTransaction().begin();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj id");
        long id = scanner.nextLong();

        Employee  employee = entityManager.find(Employee.class, id);
        System.out.println(employee.getSalary());

        if (employee == null){
            System.out.println("Nie istnieje takie id");
        }else{
            System.out.println(employee.getSalary());
        }

        entityManager.getTransaction().commit();

        // albo opakować w Optionala
//       Long salary =  Optional.ofNullable(entityManager.find(Employee.class, 48L))
//        .map(employee1 -> employee.getSalary())
//        .orElse(0L);

    }

    public static void addEmployees() {

        EntityManagerFactory emf = Persistence.
                createEntityManagerFactory("test");
        EntityManager entityManager = emf.createEntityManager();

        entityManager.getTransaction().begin();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę pracowników");
        int a = scanner.nextInt();

        for (int i = 0; i == a; i++) {
            Employee employee = new Employee("employee"+i, 1L);
            entityManager.persist(employee);
        }



        entityManager.getTransaction().commit();

    }

    public static void removeEmployee(){
        EntityManagerFactory emf = Persistence.
                createEntityManagerFactory("test");
        EntityManager entityManager = emf.createEntityManager();

        entityManager.getTransaction().begin();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj id pracownika");
        int a = scanner.nextInt();

        entityManager.remove(a);

        entityManager.getTransaction().commit();


    }

}
