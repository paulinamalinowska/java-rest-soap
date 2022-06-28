package pl.sapiens.javarestsoap.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.json.bind.annotation.JsonbProperty;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "RESERVATIONS")
public class Reservation {

    @Id
    Long id;  //id rezerwacji
    String surname; //nazwisko na którą jest zamawiane

    @Column(name = "TABLE_NUMBER")
    @JsonbProperty("numer stolika")
    Integer tableNumber;

    @Column(name = "START_RESERVATION")
    LocalDateTime startReservation; //start rezerwacji

    @Column(name = "END_RESERVATION")
    LocalDateTime endReservation; //koniec rezerwacji

    // TODO: migrate to Address class
    String address;

    @Column(name = "CUSTOMER_COMMENTS")
    String customerComments;

}
