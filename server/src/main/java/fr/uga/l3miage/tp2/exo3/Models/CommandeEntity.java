package fr.uga.l3miage.tp2.exo3.Models;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Id;

public class CommandeEntity {
    @Id
    private long id ;

    private Date date ;

    private double montantTotal ;

    @ManyToOne
    private ClientEntity client;

}
