package org.scholanova.mealdeliverapi.model;

import java.util.List;

public class Client {
    String plat;
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
    
    public String getPlat() {
        return this.plat;
    }

    public void setPlat(String plat) {
        this.plat = plat;
    }
}
