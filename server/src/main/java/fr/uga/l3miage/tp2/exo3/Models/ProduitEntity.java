package fr.uga.l3miage.tp2.exo3.Models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Id;
import javax.persistence.OneToOne;


public class ProduitEntity {

    @Id
    private long id ;

    private String nom ;

    private double prix ;
    private int quantite ;

    @OneToOne(mappedBy = "produit")
    private CommandeEntity commande;

}
