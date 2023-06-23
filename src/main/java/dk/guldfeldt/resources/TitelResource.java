package dk.guldfeldt.resources;

import dk.guldfeldt.api.Title;
import io.quarkus.panache.common.Sort;
import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

import java.util.List;

@Path("/titles")
public class TitelResource {

    @GET
    public Uni<List<Title>> getTitles() {
        return Title.listAll(Sort.by("id"));
    }

    @POST
    public Uni<Title> createTitle(Title title) {
       
    }
}
