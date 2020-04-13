package com.Covite.demo.model;


import javax.persistence.*;
import java.util.ArrayList;


@Entity
@DiscriminatorValue("livreur")
@Table(name = "livreur")

public class Livreur extends Utilisateur{

    private Float solde;

    @OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private  ArrayList<Commande> commandes = new ArrayList<Commande>() ;

    @OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private Vehicule vehicule ;



    public Livreur(Long id, String cin, String nom, String prenom, String email, String login, String mdp, String tel, String adresse, Float solde, ArrayList<Commande> commandes, Vehicule vehicule) {
        super(id, cin, nom, prenom, email, login, mdp, tel, adresse);
        this.solde = solde;
        this.commandes = commandes;
        this.vehicule = vehicule;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    public ArrayList<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(ArrayList<Commande> commandes) {
        this.commandes = commandes;
    }

    public Float getSolde() {
        return solde;
    }

    public void setSolde(Float solde) {
        this.solde = solde;
    }
