package org.scholanova.mealdeliverapi.model;

import java.util.List;

public class Client {
    List<String> panier;
    String nom;
    String adresse;
    Boolean couvert;
    int temps_cuisson;
    Boolean commandeValide;

    public Boolean getCommandeValide() {
        return this.commandeValide;
    }

    public void setCommandeValide(Boolean commandeValide) {
        this.commandeValide = commandeValide;
    }

    public Boolean getCouvert() {
        return this.couvert;
    }

    public void setCouvert(Boolean couvert) {
        this.couvert = couvert;
    }

    public int getTemps_cuisson() {
        return this.temps_cuisson;
    }

    public void setTemps_cuisson(int temps_cuisson) {
        this.temps_cuisson = temps_cuisson;
    }

    public List<String> getPanier() {
        return this.panier;
    }

    public void setPanier(List<String> panier) {
        this.panier = panier;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
