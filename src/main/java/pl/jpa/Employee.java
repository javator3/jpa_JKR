package pl.jpa;

import javax.persistence.*;

@Entity
@Table(name = "employee9")

public class Employee {
    @Id
    @GeneratedValue
    private Long id;
    @Column (unique = true,nullable = false)
    private String name;
    @Column (nullable = false)
    private Long salary;

    public Employee(){
        //dla potrzeb hibernate
    }

    public Employee(Long id, String name, Long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
