package org.scholanova.mealdeliverapi.repositories.MainCourse;

import org.scholanova.mealdeliverapi.model.MainCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class MainCourseRepositoryImpl implements MainCourseRepository{

    @Autowired
    JdbcTemplate jdbc;

    public List<MainCourse> getMenu() {
        List<MainCourse> result = jdbc.query("select * FROM menu", new BeanPropertyRowMapper(MainCourse.class));
        return result;
    }

    @Override
    public List<MainCourse> listAll() {
        MainCourse pouletRoti=new MainCourse();
        pouletRoti.setName("Poulet Roti");
        pouletRoti.setPrice(10.0f);
        pouletRoti.setTimeToCook(45);
        pouletRoti.setIdPlat(1);

        MainCourse steakFrite=new MainCourse();
        steakFrite.setName("Steak Frite");
        steakFrite.setPrice(6.0f);
        steakFrite.setTimeToCook(15);
        steakFrite.setIdPlat(2);

        return Arrays.asList(pouletRoti,steakFrite);
    }
}
