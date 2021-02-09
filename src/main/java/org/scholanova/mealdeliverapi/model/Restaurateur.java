package org.scholanova.mealdeliverapi.model;

public class Restaurateur {
    int clientMax;
    String ville;
    Boolean commandeReady;
    String plataModifier;
    String nouveauPlat;

    public int getClientMax() {
        return this.clientMax;
    }

    public void setClientMax(int clientMax) {
        this.clientMax = clientMax;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Boolean getCommandeReady() {
        return this.commandeReady;
    }

    public void setCommandeReady(Boolean commandeReady) {
        this.commandeReady = commandeReady;
    }

    public String getPlataModifier() {
        return this.plataModifier;
    }

    public void setPlataModifier(String plataModifier) {
        this.plataModifier = plataModifier;
    }

    public String getNouveauPlat() {
        return this.nouveauPlat;
    }

    public void setNouveauPlat(String nouveauPlat) {
        this.nouveauPlat = nouveauPlat;
    }

}
