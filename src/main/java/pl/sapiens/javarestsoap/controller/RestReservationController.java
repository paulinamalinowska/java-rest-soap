package pl.sapiens.javarestsoap.controller;

import lombok.extern.slf4j.Slf4j;
import pl.sapiens.javarestsoap.entity.Reservation;
import pl.sapiens.javarestsoap.service.ReservationsService;

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

    private final ReservationsService businessLogic = new ReservationsService();


    @GET
    public Response getReservation() {
        log.info("getting all reservation");
        var reservations = businessLogic.getAllResevationsFromDataSource();
        return Response.ok(reservations).build();
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
    public Response createReservation(Reservation toCreate)  {
        log.info("trying to create reservation: [{}]", toCreate);
        // TODO: use service, add validation
        URI location = null;
        try{
            location = new URI("/reservations/2");
        }catch (URISyntaxException e){
            log.error("Cannot create location header");
        }

        return Response.created(location).build();

    }


}