package pl.jpa;

import lombok.NoArgsConstructor;


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

    public Employee( String name, Long salary) {
        this.name = name;
        this.salary = salary;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getSalary() {
        return salary;
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
