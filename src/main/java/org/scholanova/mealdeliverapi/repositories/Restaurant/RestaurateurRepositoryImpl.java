package org.scholanova.mealdeliverapi.repositories.Restaurant;

import org.scholanova.mealdeliverapi.model.Restaurateur;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class RestaurateurRepositoryImpl implements RestaurateurRepository {

    @Override
    public List<Restaurateur> listAll() {
        Restaurateur Resto1 = new Restaurateur();
        Resto1.setClientMax(10);
        Resto1.setCommandeReady(true);
        Resto1.setPlataModifier("Poulet");
        Resto1.setNouveauPlat("Burger");

        return Arrays.asList(Resto1);
     }
}