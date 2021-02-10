package org.scholanova.mealdeliverapi.repositories.Client;

import org.scholanova.mealdeliverapi.model.Client;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class ClientRepositoryImpl implements ClientRepository{
    
    List<Client> panierClient = new ArrayList<>();
    Client panier = new Client();

    @Override
    public List<Client> listAll() {

        Client client1=new Client();
        client1.setCouvert(true);
        client1.setCommandeValide(false);

        return Arrays.asList(client1);
    }

    @Override
    public List<String> panier(String produit, int id) {
        panier.setPanier(panier(produit,id));
        return null;
    }
}
