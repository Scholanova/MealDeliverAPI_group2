package org.scholanova.mealdeliverapi.repositories.Panier;

import java.util.List;

import org.scholanova.mealdeliverapi.model.MainCourse;
import org.scholanova.mealdeliverapi.model.Panier;
import org.scholanova.mealdeliverapi.repositories.MainCourse.MainCourseRepository;
import org.scholanova.mealdeliverapi.repositories.MainCourse.MainCourseRepositoryImpl;
import org.springframework.stereotype.Repository;

@Repository
public class PanierRepositoryImpl implements PanierRepository{

    @Override
    public Panier ajoutProduitauPanier(int idPlat) {
        Panier panier = new Panier();
        MainCourseRepositoryImpl plat = new MainCourseRepositoryImpl();
        List<MainCourse> listePlat = plat.listAll();
        MainCourse menu = new MainCourse();
        panier.setIdPlat(1);

        if(panier.getIdPlat() == idPlat){
            panier.getIdPlat();
        }

        return panier;
    }
}
