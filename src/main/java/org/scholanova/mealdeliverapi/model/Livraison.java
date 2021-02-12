package org.scholanova.mealdeliverapi.model;

public class Livraison {
    String adresse;
    String client;
    Boolean priseEnCharge;
    Boolean commandeReady;
    String menu;
    int idPanier;
    int idClient;

    public int getIdPanier() {
        return this.idPanier;
    }

    public void setIdPanier(int idPanier) {
        this.idPanier = idPanier;
    }

    public int getIdClient() {
        return this.idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getClient() {
        return this.client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public Boolean getPriseEnCharge() {
        return this.priseEnCharge;
    }

    public void setPriseEnCharge(Boolean priseEnCharge) {
        this.priseEnCharge = priseEnCharge;
    }

    public Boolean getCommandeReady() {
        return this.commandeReady;
    }

    public void setCommandeReady(Boolean commandeReady) {
        this.commandeReady = commandeReady;
    }

    public String getMenu() {
        return this.menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

}
