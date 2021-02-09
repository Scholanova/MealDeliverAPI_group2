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

        Livraison course2=new Livraison();
        course2.setAdresse("50 avenue de schola");
        course2.setClient("Mr. Fouzi");
        course2.setCommandeReady(false);
        course2.setMenu("Poulet Roti");
        course2.setPriseEnCharge(false);

        return Arrays.asList(course, course2);
    }
}
