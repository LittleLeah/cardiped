package dk.guldfeldt.api;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Cacheable
public class Person extends PanacheEntity {

    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Person_SEQ")
    public Long id;
    @Column
    public String name;
    @Column
    public String email;

    @Column
    public String address;

    @Column
    public String city;

    @Column
    public String postcode;

    @Column
    public String country;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "kennel_id", referencedColumnName = "id")
    public Kennel kennel;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "OwnerDogs",
            joinColumns = @JoinColumn(name = "owner_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "dog_id", referencedColumnName = "id"))
    public List<Dog> dogs;

}
