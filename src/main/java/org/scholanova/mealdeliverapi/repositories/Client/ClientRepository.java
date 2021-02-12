package org.scholanova.mealdeliverapi.repositories.Client;

import java.util.List;

import org.scholanova.mealdeliverapi.model.Client;
import org.scholanova.mealdeliverapi.model.Panier;

public interface ClientRepository {
    public List<Client> listAll();
    //public List<Panier> panier();
}
