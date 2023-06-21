package dk.guldfeldt.api;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;
import jakarta.persistence.Cacheable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Cacheable
public class Title extends PanacheEntity {

    @Column
    public Long id;

    @Column
    public String title;
}
