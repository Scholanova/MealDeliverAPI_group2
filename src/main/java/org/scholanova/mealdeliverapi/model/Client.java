package org.scholanova.mealdeliverapi.model;

import java.util.List;

public class Client {
    List<Panier> panier;
    Boolean couvert;
    Boolean commandeValide;
    int plat;
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

    public int getPlat() {
        return this.plat;
    }

    public void setPlat(int plat) {
        this.plat = plat;
    }

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
    
    
}
