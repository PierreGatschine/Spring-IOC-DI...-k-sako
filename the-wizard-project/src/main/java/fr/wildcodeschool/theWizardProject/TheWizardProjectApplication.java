package fr.wildcodeschool.theWizardProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.wildcodeschool.theWizardProject.controllers.App;

@SpringBootApplication
public class TheWizardProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheWizardProjectApplication.class, args);
		App myApp = new App();
		myApp.start();
	}

}

