package dk.guldfeldt.repository;

import dk.guldfeldt.api.Dog;
import io.quarkus.hibernate.reactive.panache.PanacheRepositoryBase;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
@Transactional
public class DogRepository implements PanacheRepositoryBase<Dog, String> {

    public Uni<List<Dog>> findByOwnerId(String ownerId) {
        return find("owner", ownerId).list();
    }
}
