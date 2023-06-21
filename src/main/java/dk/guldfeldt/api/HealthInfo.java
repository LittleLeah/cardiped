package dk.guldfeldt.api;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;
import jakarta.persistence.Cacheable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Cacheable
public class HealthInfo extends PanacheEntity {

    @Column
    public Long id;

    @Column
    public String hips;
    @Column
    public String hipGraduatedAt;
}
