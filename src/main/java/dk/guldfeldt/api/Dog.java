package dk.guldfeldt.api;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Cacheable
public class Dog extends PanacheEntity {

    @Column
    public Long id;

    @Column
    public String registrationNumber;
    @ManyToMany(mappedBy = "dogs")
    public List<Person> owners;

    @Column
    public String name;

    @OneToOne
    @MapsId
    public Dog sire;
    @OneToOne
    @MapsId
    public Dog dam;

    @Column
    public Long height;

    @Column
    public Long weight;

    @Column
    public String color;

    @Column
    public String notes;

    @OneToOne
    @MapsId
    public Kennel bredBy;

    @OneToOne
    @MapsId
    public Kennel standingAt;

    @ManyToMany
    @JoinTable(name = "Title")
    public List<Title> titles;

    @OneToOne
    @MapsId
    public HealthInfo healthInfo;

}
