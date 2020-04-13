package com.Covite.demo.model;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "position")
public class Position {

    private String pointDepart;
    private String pointArrive;


    @OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private ArrayList<Commande> commandes = new ArrayList<Commande>() ;




    public Position(String pointDepart, String pointArrive, ArrayList<Commande> commandes) {
        this.pointDepart = pointDepart;
        this.pointArrive = pointArrive;
        this.commandes = commandes;
    }

    public ArrayList<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(ArrayList<Commande> commandes) {
        this.commandes = commandes;
    }

    public String getPointDepart() {
        return pointDepart;
    }

    public void setPointDepart(String pointDepart) {
        this.pointDepart = pointDepart;
    }

    public String getPointArrive() {
        return pointArrive;
    }

    public void setPointArrive(String pointArrive) {
        this.pointArrive = pointArrive;
    }
}
