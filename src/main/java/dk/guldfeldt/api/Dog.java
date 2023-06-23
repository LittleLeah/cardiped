package dk.guldfeldt.api;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;
import jakarta.persistence.*;

import javax.sound.midi.Sequence;
import java.util.List;

@Entity
@Cacheable
public class Dog extends PanacheEntity {

    public enum Colors {
        BRINDLE,
        BLACKWHITE,
        TRIPOINTBRINDLE,
        TRIPOINTTAN,
        MERLEBRINDLE,
        MERLETAN,
        RED,
        SABLE
    }

    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Dog_SEQ")
    public Long id;

    @Column
    public String registrationNumber;

    @Column
    public String name;

    @OneToOne
    @JoinColumn(name = "sire_id")
    public Dog sire;
    @OneToOne
    @JoinColumn(name = "dam_id")
    public Dog dam;

    @Column
    public boolean sex;

    @Column
    public Long height;

    @Column
    public Long weight;

    @Column
    public Colors color;

    @Column
    public String notes;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "breeder_id", referencedColumnName = "id")
    public Kennel bredBy;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "standing_id", referencedColumnName = "id")
    public Kennel standingAt;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="DogTitles",
            joinColumns = @JoinColumn(name = "dog_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "title_id", referencedColumnName = "id"))
    public List<Title> titles;

    @OneToOne
    @JoinColumn(name = "healthinfo_id", referencedColumnName = "id")
    public HealthInfo healthInfo;

}
