package pl.jpa;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;

    @Embedded
    Address address;

    @Embedded
    @AttributeOverrides(
            value =  {
                    @AttributeOverride(name ="street",column = @Column(name = "contact_street") ),
                    @AttributeOverride(name ="city",column = @Column(name = "contact_city") ),
                    @AttributeOverride(name ="postCode",column = @Column(name = "contact_postCode") )

            }
    )
    private Address contactAdress;



    public Client( String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                '}';
    }
}
