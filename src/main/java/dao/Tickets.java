package dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Tickets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String nomClient ;
    private double prix ;
    private int codePayement ;
    private boolean reserve;
    @ManyToOne()
    private Place place ;
    @ManyToOne()
    private Projection projection ;
}
