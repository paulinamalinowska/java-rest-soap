package pl.sapiens.javarestsoap.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

public class NoReservationExceptionMapper implements ExceptionMapper<NoReservationFoundExceptionBetterOne> {

    @Override
    public Response toResponse(NoReservationFoundExceptionBetterOne noReservationFoundExceptionBetterOne) {
        return null;
    }
}
