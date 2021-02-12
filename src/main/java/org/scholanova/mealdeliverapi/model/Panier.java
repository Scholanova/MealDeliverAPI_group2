package org.scholanova.mealdeliverapi.model;

public class Panier {
    int idProduit;
    String customerId;
    String panierId;

    public String getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getPanierId() {
        return this.panierId;
    }

    public void setPanierId(String panierId) {
        this.panierId = panierId;
    }

    public int getIdProduit() {
        return this.idProduit;
    }

    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }

    
}
