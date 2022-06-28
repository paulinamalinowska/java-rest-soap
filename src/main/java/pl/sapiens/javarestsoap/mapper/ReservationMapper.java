package pl.sapiens.javarestsoap.mapper;

import pl.sapiens.javarestsoap.dto.ReservationDTO;
import pl.sapiens.javarestsoap.entity.Reservation;

public class ReservationMapper implements Mapper<Reservation, ReservationDTO> {

    @Override
    public ReservationDTO fromEntityToDTO(Reservation entity) {
        return new ReservationDTO(
                entity.getId(),
                entity.getSurname(),
                entity.getTableNumber(),
                entity.getStartReservation(),
                entity.getEndReservation(),
                entity.getAddress(),
                entity.getCustomerComments()
        );
    }

    @Override
    public Reservation fromDtoToEntity(ReservationDTO reservationDTO) {
        return Reservation.builder()
                .id(reservationDTO.id())
                .surname(reservationDTO.surname())
                .tableNumber(reservationDTO.tableNumber())
                .startReservation(reservationDTO.startReservation())
                .endReservation(reservationDTO.endReservation())
                .address(reservationDTO.address())
                .customerComments(reservationDTO.customerComments())
                .build();
    }
}
