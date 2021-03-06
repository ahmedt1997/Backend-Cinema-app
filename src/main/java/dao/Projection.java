package dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Projection implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private Date dateProjection;
    private double prix ;
    @ManyToOne()
    private Salle salle ;
    @ManyToOne()
    private  Filme filme ;
    @OneToMany(mappedBy = "projection")
    private Collection<Tickets> tickets ;
    @ManyToOne
    private Seance seance;




}
