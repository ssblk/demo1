package com.Covite.demo.model;

import javax.persistence.*;


@Entity
@Inheritance(strategy =InheritanceType.JOINED)
@DiscriminatorColumn(name = "role")
@Table(name = "utilisateur")
public class Utilisateur {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cin;
    private String nom;
    private String prenom;
    private String email;
    private String login;
    private String mdp;
    private String tel ;
    private String adresse ;

    public Utilisateur(Long id, String cin, String nom, String prenom, String email, String login, String mdp, String tel, String adresse) {
        this.id = id;
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.login = login;
        this.mdp = mdp;
        this.tel = tel;
        this.adresse = adresse;
    }

    public String getTel() { return tel;}

    public void setTel(String tel) { this.tel = tel; }

    public String getAdresse() { return adresse; }

    public void setAdresse(String adresse) { this.adresse = adresse; }

    public int getId() {
        return id;
    }

    public void setId(Long id) { this.id = id; }

    public String getCin() { return cin; }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "id=" + id +
                ", cin='" + cin + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", login='" + login + '\'' +
                ", mdp='" + mdp + '\'' +
                ", tel='" + tel + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }
}