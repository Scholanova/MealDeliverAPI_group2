package org.scholanova.mealdeliverapi.repositories.Client;

import java.util.List;

import org.scholanova.mealdeliverapi.model.Client;

public interface ClientRepository {
    public List<Client> listAll();
}
