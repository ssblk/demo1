package com.Covite.demo.model;

import javax.persistence.*;

import java.util.ArrayList;

@Entity
@DiscriminatorValue("administrateur")
@Table(name = "administrateur")
public class Administrateur extends Utilisateur {


    @OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private ArrayList<Client> clients = new ArrayList<Client>();

    @OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private ArrayList<Livreur> livreurs = new ArrayList<Livreur>();


    public Administrateur(Long id, String cin, String nom, String prenom, String email, String login, String mdp, String tel, String adresse, ArrayList<Client> clients, ArrayList<Livreur> livreurs) {
        super(id, cin, nom, prenom, email, login, mdp, tel, adresse);
        this.clients = clients;
        this.livreurs = livreurs;
    }



}
