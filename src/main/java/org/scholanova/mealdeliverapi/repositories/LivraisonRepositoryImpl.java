package org.scholanova.mealdeliverapi.repositories;

import org.scholanova.mealdeliverapi.model.Livraison;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class LivraisonRepositoryImpl implements LivraisonRepository{


    @Override
    public List<Livraison> listAll() {
        Livraison course=new Livraison();
        course.setAdresse("50 avenue de schola");
        course.setClient("Mr. Fouzi");
        course.setCommandeReady(false);
        course.setMenu("Poulet Roti");
        course.setPriseEnCharge(false);

        return Arrays.asList(course);
    }
}
