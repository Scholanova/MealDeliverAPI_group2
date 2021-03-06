package org.scholanova.mealdeliverapi.controllers;

import org.scholanova.mealdeliverapi.model.Client;
import org.scholanova.mealdeliverapi.model.Livraison;
import org.scholanova.mealdeliverapi.model.MainCourse;
import org.scholanova.mealdeliverapi.model.Panier;
import org.scholanova.mealdeliverapi.model.Restaurateur;
import org.scholanova.mealdeliverapi.repositories.MainCourse.MainCourseRepository;
import org.scholanova.mealdeliverapi.repositories.Panier.PanierRepository;
import org.scholanova.mealdeliverapi.repositories.Livraison.LivraisonRepository;
import org.scholanova.mealdeliverapi.repositories.Restaurant.RestaurateurRepository;
import org.scholanova.mealdeliverapi.repositories.Client.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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

    /*@Autowired
    PanierRepository panierRepository;

    @PostMapping("/customer/{customerId}/panier/{panierId}")
    @ResponseBody
    public Panier ajouterProduitPanier(@RequestBody int idProduit, @PathVariable(value="customerId") String customerId, @PathVariable(value="panierId") String panierId){
        //TODO: Récupérer le customer qui correspond au customerId
        //TODO: Récupérer le panier qui correspond au panierId
        //TODO: Vérifier que le panier correspond bien au client
        //TODO: Vérifier que le produit correspond bien à l'ID produit
        //TODO: Si bon ajouter produit au panier
        
        
        return panierRepository.ajoutProduitauPanier(idProduit, customerId, panierId);
    }*/

    @Autowired
    ClientRepository clientRepository;

    @GetMapping("/clients_menu")
    public List<Client> listAllClientsMenu(){
        return clientRepository.listAll();
    }
}