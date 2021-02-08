package org.scholanova.mealdeliverapi.controllers;

import org.scholanova.mealdeliverapi.model.MainCourse;
import org.scholanova.mealdeliverapi.repositories.MainCourseRepository;
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
}
