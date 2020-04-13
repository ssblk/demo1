package com.Covite.demo.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Commande")
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date  date;
    private Float prix ;
    private Categorie type;
    private Service typeSevice;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private Client client ;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private Livreur livreur ;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private Vehicule vehicule ;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private Position position ;


    public Commande() { }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public Position getPosition() { return position; }

    public void setPosition(Position position) { this.position = position; }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    public Livreur getLivreur() {
        return livreur;
    }

    public void setLivreur(Livreur livreur) {
        this.livreur = livreur;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Float getPrix() {
        return prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    public Categorie getType() {
        return type;
    }

    public void setType(Categorie type) {
        this.type = type;
    }

    public Service getTypeSevice() {
        return typeSevice;
    }

    public void setTypeSevice(Service typeSevice) {
        this.typeSevice = typeSevice;
    }