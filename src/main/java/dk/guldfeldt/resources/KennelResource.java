package dk.guldfeldt.resources;

import dk.guldfeldt.api.Kennel;
import io.quarkus.panache.common.Sort;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

import java.util.List;

@Path("/kennels")
@ApplicationScoped
public class KennelResource {

    @GET
    public Uni<List<Kennel>> getKennels() {
        return Kennel.listAll(Sort.by("id"));
    }

    @GET
    @Path("/{id}")
    public Uni<Kennel> getKennel(@PathParam("id") final Long id) {
        return Kennel.findById(id);
    }

}
