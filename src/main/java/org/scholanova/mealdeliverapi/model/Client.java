package org.scholanova.mealdeliverapi.model;

import java.util.List;

public class Client {
    List<String> panier;
    Boolean couvert;
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

    public List<String> getPanier() {
        return this.panier;
    }

    public void setPanier(List<String> panier) {
        this.panier = panier;
    }
}
