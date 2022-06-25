package pl.sapiens.javarestsoap.controller;

import lombok.extern.slf4j.Slf4j;
import pl.sapiens.javarestsoap.entity.Reservation;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDateTime;
import java.util.List;
import static javax.ws.rs.core.Response.Status.NOT_FOUND;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Slf4j
@Path("/reservations")
public class RestReservationController {


    private static Reservation theOnlyOne = new Reservation(0L, "Kowalski", 1, LocalDateTime.now(), LocalDateTime.now().plusHours(2), "Wojska Polskiego", "Przy oknie");


    @GET
    public Response getReservation() {
        var dummyReservation = List.of(
                theOnlyOne
        );
        log.info("getting all reservation");
        log.info("number of found reservation : [{}]", dummyReservation.size());
        return Response.ok(dummyReservation).build();
    }

    @GET
    @Path("/{id}")
    public Response findReservationById(@PathParam("id") Long reservationsId) {
        log.info("trying to find reservation by id: [{}]", reservationsId);
        // TODO: replace with integration with service

        Response result;
        if(reservationsId==1L) {
            result = Response.ok(theOnlyOne).build();
        } else {
            result = Response.status(NOT_FOUND).build();
        }
        return result;
    }

    @POST
    public Response createReservation(Reservation toCreate) throws URISyntaxException {
        log.info("tryging to create reservation: [{}]", toCreate);
        // TODO: use service, add validation
        URI location = new URI("/reservations/2");
        return Response.created(location).build();


    }


}