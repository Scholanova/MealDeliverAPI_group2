package org.scholanova.mealdeliverapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class MealdeliverapiApplication {

	public static void main(String[] args) {
		SpringApplication app=new SpringApplication(MealdeliverapiApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port","5555"));
		app.run(args);
		System.out.println("group2 running");
	}

}
