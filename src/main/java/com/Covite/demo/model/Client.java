package com.Covite.demo.model;


import javax.persistence.*;
import java.util.ArrayList;

@Entity
@DiscriminatorValue("client")
@Table(name = "client")
public class Client extends Utilisateur{

    private String ville;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private Administrateur administrateur ;

    @OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private ArrayList<Commande> commandes = new ArrayList<Commande>() ;


    public Client(Long id, String cin, String nom, String prenom, String email, String login, String mdp, String tel, String adresse, String ville, ArrayList<Commande> commandes) {
        super(id, cin, nom, prenom, email, login, mdp, tel, adresse);
        this.ville = ville;
        this.commandes = commandes;


        public ArrayList<Commande> getCommandes() {
            return commandes;
        }
