package org.scholanova.mealdeliverapi.Meal;

import org.junit.jupiter.api.Test;
import org.scholanova.mealdeliverapi.MealdeliverapiApplication;
import org.scholanova.mealdeliverapi.model.MainCourse;
import org.scholanova.mealdeliverapi.repositories.MainCourseRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = MealdeliverapiApplication.class)
public class MealRepositoryTest {
    @Autowired
    MainCourseRepositoryImpl meals;
    JdbcTemplate jdbcTemplate;

    /*@Test
    void getAllMeals() {
        //given
        //when
        List<MainCourse> result = meals.getMenu();
        //then
        assertEquals(result.size(), 2);
    }*/
}
