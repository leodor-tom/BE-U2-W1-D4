package TommasoEleodori.BEU2W1D4.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "reservations")
@Getter
@ToString
@NoArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "username")
    private User user;
    @ManyToOne
    @JoinColumn(name = "workstation_id")
    private Workstation workstation;
    @Column(nullable = false, name = "reservation_date")
    private LocalDate reservationDate;
    @Column(nullable = false, name = "number_of_participants")
    private int numberOfParticipants;

    public Reservation(User user, Workstation workstation, LocalDate reservationDate, int numberOfParticipants) {
        this.user = user;
        this.workstation = workstation;
        this.reservationDate = reservationDate;
        this.numberOfParticipants = numberOfParticipants;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setWorkstation(Workstation workstation) {
        this.workstation = workstation;
    }

    public void setReservationDate(LocalDate reservationDate) {
        this.reservationDate = reservationDate;
    }

    public void setNumberOfParticipants(int numberOfParticipants) {
        this.numberOfParticipants = numberOfParticipants;
    }
}
