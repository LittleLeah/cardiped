package dk.guldfeldt.api;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Cacheable;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
@Cacheable
public class Person extends PanacheEntity {

    @Column
    public String id;
    @Column
    public String name;
    @Column
    public String email;

    public Person() {

    }

    public Person(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

}
