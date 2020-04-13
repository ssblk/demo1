package com.Covite.demo.model;



import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "Vehicule")
public class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String matricule;
    private TypeVehicule type;
    private Integer capacite ;

    @OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private Livreur livreur ;

    @OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private ArrayList<Commande> commandes = new ArrayList<Commande>() ;



    public Vehicule() { }



    public Livreur getLivreur() { return livreur; }

    public void setLivreur(Livreur livreur) { this.livreur = livreur; }

    public ArrayList<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(ArrayList<Commande> commandes) {
        this.commandes = commandes;
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public TypeVehicule getType() {
        return type;
    }

    public void setType(TypeVehicule type) {
        this.type = type;
    }

    public Integer getCapacite() {
        return capacite;
    }

    public void setCapacite(Integer capacite) {
        this.capacite = capacite;
    }

}
