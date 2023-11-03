package TommasoEleodori.BEU2W1D4.entities;

import TommasoEleodori.BEU2W1D4.Enum.Type;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "workstations")
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Workstation {
    @Id
    @GeneratedValue
    @Column(nullable = false)
    private UUID id;
    private String description;
    private Type type;
    @Column(name = "max_occupancy")
    private int maxOccupancy;
    @ManyToOne
    @JoinColumn(name = "building_id")
    private Building building;
    @OneToMany(mappedBy = "workstation", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Reservation> reservations = new HashSet<>();
}
