package org.scholanova.mealdeliverapi.controllers;

import org.scholanova.mealdeliverapi.model.Client;
import org.scholanova.mealdeliverapi.model.Livraison;
import org.scholanova.mealdeliverapi.model.MainCourse;
import org.scholanova.mealdeliverapi.model.Restaurateur;
import org.scholanova.mealdeliverapi.repositories.MainCourseRepository;
import org.scholanova.mealdeliverapi.repositories.LivraisonRepository;
import org.scholanova.mealdeliverapi.repositories.RestaurateurRepository;
import org.scholanova.mealdeliverapi.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MealController {

    @Autowired
    MainCourseRepository mainCourseRepository;

    @GetMapping("/mains")
    public List<MainCourse> listAllMainCourse(){
        return mainCourseRepository.listAll();
    }

    @Autowired
    LivraisonRepository livraisonRepository;

    @GetMapping("/livraisons")
    public List<Livraison> listAllLivraisons(){
        return livraisonRepository.listAll();
    }

    @Autowired
    RestaurateurRepository restaurateurRepository;

    @GetMapping("/restaurateurs")
    public List<Restaurateur> listAllRestaurateur(){
        return restaurateurRepository.listAll();
    }

    @Autowired
    ClientRepository clientRepository;

    @GetMapping("/clients_menu")
    public List<Client> listAllClientsMenu(){
        return clientRepository.listAll();
    }
}
