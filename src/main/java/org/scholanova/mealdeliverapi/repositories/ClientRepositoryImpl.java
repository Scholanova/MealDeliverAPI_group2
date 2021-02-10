package org.scholanova.mealdeliverapi.repositories;

import org.scholanova.mealdeliverapi.model.Client;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class ClientRepositoryImpl implements ClientRepository{

    @Override
    public List<Client> listAll() {
        Client client1=new Client();
        client1.setAdresse("50 avenue de schola");
        client1.setNom("Fouzi");
        client1.setCouvert(true);
        client1.setCommandeValide(false);

        return Arrays.asList(client1);
    }
}
