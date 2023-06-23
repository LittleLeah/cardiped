package dk.guldfeldt.api;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Cacheable
public class Kennel extends PanacheEntity {

    @Column
    public Long id;

    @OneToMany(mappedBy = "kennel", fetch = FetchType.EAGER)
    public List<Person> owners;

    @Column
    public String name;

    @Column
    public String prefix;

    @Column
    public Boolean prependPrefix;


}
