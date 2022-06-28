package pl.sapiens.javarestsoap.exception;

import lombok.extern.slf4j.Slf4j;

import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Slf4j
@Provider
public class NoReservationExceptionMapper implements ExceptionMapper<NoReservationFoundExceptionBetterOne> {

    @Override
    public Response toResponse(NoReservationFoundExceptionBetterOne exception) {
        log.warn("handler for noReservationFoundExceptionBetterOne is running", exception);
        return Response.status(Response.Status.NOT_FOUND).build();
    }
}
