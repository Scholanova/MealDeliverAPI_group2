package org.scholanova.mealdeliverapi.repositories.Client;

import org.scholanova.mealdeliverapi.model.Client;
import org.scholanova.mealdeliverapi.model.Livraison;
import org.scholanova.mealdeliverapi.model.Panier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class ClientRepositoryImpl implements ClientRepository{
    
    List<Client> panierClient = new ArrayList<>();
    

    @Override
    public List<Client> listAll() {
        Client client1=new Client();
        Livraison livraison_client1 = new Livraison();
        client1.setCouvert(true);
        client1.setCommandeValide(false);
        client1.setPlat(1);
        client1.setIdPanier(1);
        client1.setIdClient(1);

        if(client1.getCommandeValide() == true){
            livraison_client1.setCommandeReady(true);
        }

        Client client2=new Client();
        Livraison livraison_client2 = new Livraison();
        client2.setCouvert(true);
        client2.setCommandeValide(false);
        client2.setPlat(2);
        client2.setIdPanier(2);
        client2.setIdClient(2);

        if(client2.getCommandeValide() == true){
            livraison_client2.setCommandeReady(true);
        }

        return Arrays.asList(client1, client2);
    }

    @Override
    public List<Panier> panier(){
        panier().get(0).setCustomerId("Test");
        return null;
    }
}
