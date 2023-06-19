package dk.guldfeldt.resources;


import dk.guldfeldt.api.Dog;
import io.quarkus.panache.common.Sort;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import java.util.List;

@Path("/dogs")
@ApplicationScoped
public class DogResource {
    @GET
    public Uni<List<Dog>> get() {
        return (Uni<List<Dog>>) Dog.listAll(Sort.by("id"));
    }
}
