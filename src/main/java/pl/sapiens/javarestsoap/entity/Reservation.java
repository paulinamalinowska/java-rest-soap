package pl.sapiens.javarestsoap.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {

    Long id;  //id rezerwacji
    String surname; //nazwisko na którą jest zamawiane
    Integer tableNumber;
    LocalDateTime startReservation; //start rezerwacji
    LocalDateTime endReservation; //koniec rezerwacji

    // TODO: migrate to Address class
    String address;

    String customerComments;

}
