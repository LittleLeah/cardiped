package dk.guldfeldt.resources;


import dk.guldfeldt.api.Dog;
import dk.guldfeldt.repository.DogRepository;
import io.quarkus.panache.common.Sort;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

import java.util.List;

@Path("/dogs")
@ApplicationScoped
public class DogResource {

    @Inject
    DogRepository dogRepository;
    @GET
    public Uni<List<Dog>> get() {
        return Dog.listAll(Sort.by("id"));
    }

    @GET
    @Path("/{id}")
    public Uni<Dog> getDog(@PathParam("id") Long id ) {
        return Dog.findById(id);
    }

    @GET
    @Path("/owner/{id}")
    public Uni<List<Dog>> getDogsByOwner(@PathParam("id") String id) {
        return dogRepository.findByOwnerId(id);
    }
}
