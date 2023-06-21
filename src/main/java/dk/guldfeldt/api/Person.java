package dk.guldfeldt.api;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Cacheable
public class Person extends PanacheEntity {

    @Column
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

    @ManyToOne
    @JoinColumn(name = "kennel_id", referencedColumnName = "id")
    public Kennel kennel;

    @ManyToMany
    @JoinTable(name = "Dog")
    public List<Dog> dogs;

}
