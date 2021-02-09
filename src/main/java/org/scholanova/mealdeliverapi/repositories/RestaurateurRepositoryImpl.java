package org.scholanova.mealdeliverapi.repositories;

import org.scholanova.mealdeliverapi.model.Restaurateur;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class RestaurateurRepositoryImpl implements RestaurateurRepository {

    @Override
    public List<Restaurateur> listAll() {
        Restaurateur MealParis= new Restaurateur();
        MealParis.setClientMax(20);
        MealParis.setVille("Paris");
        MealParis.setCommandeReady(true);
        MealParis.setPlataModifier("Poulet");
        MealParis.setNouveauPlat("Burger");

        Restaurateur MealArgenteuil= new Restaurateur();
        MealArgenteuil.setClientMax(10);
        MealArgenteuil.setVille("Argenteuil");
        MealArgenteuil.setCommandeReady(false);
        MealArgenteuil.setPlataModifier("Baguette");
        MealArgenteuil.setNouveauPlat("Burger");


        return Arrays.asList(MealParis,MealArgenteuil);
    }

}
