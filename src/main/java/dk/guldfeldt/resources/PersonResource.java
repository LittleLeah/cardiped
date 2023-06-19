package dk.guldfeldt.resources;

import dk.guldfeldt.api.Person;
import io.quarkus.hibernate.orm.panache.Panache;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.panache.common.Sort;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.jboss.resteasy.reactive.RestResponse;

import java.util.ArrayList;
import java.util.List;

@Path("/persons")
@ApplicationScoped
public class PersonResource {

    @GET
    public Uni<List<Person>> get() {
        return (Uni<List<Person>>) Person.listAll(Sort.by("id"));
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Person> get(@PathParam("id") String id){
        return Person.findById(id);
    }
}
