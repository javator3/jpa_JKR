package pl.jpa;



import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@NoArgsConstructor

@Entity
@Table(name = "product" , uniqueConstraints={@UniqueConstraint(columnNames={"name"})})
public class Product {

    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true,nullable = false)
    private String name;
    @Column (nullable = false)
    private BigDecimal price;


    public Product( String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
