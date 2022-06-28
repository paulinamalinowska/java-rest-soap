package pl.sapiens.javarestsoap.dto;

import javax.json.bind.annotation.JsonbProperty;
import javax.persistence.Column;
import java.time.LocalDateTime;

// JSON representation
public record ReservationDTO(
    Long id,
    String surname,
    @JsonbProperty("table_number")
    Integer tableNumber,
    LocalDateTime startReservation,
    LocalDateTime endReservation,
    String address,
    String customerComments
){}

