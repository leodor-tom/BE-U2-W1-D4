package TommasoEleodori.BEU2W1D4.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "buildings")
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Building {
    @Id
    @Column(nullable = false, unique = true)
    private String name;
    private String addres;
    private String city;
    @OneToMany(mappedBy = "building", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Workstation> workstations = new ArrayList<>();

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
