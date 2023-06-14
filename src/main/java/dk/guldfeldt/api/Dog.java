package dk.guldfeldt.api;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Cacheable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
@Cacheable
public class Dog extends PanacheEntity {
    @Column
    public String id;

    @Column
    public String owner;

    @Column
    public String name;

    public Dog() {

    }

    public Dog(String id, String owner, String name) {
        this.id = id;
        this.owner = owner;
        this.name = name;
    }

}
