package org.scholanova.mealdeliverapi.repositories;

import java.util.List;

import org.scholanova.mealdeliverapi.model.Livraison;

public interface LivraisonRepository {

    public List<Livraison> listAll();
}
