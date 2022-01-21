package com.isika.app.AppDockerTest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.isika.app.AppDockerTest.modele.Personne;

@Controller
public class PersonController {

	Logger log=LoggerFactory.getLogger(getClass());
	
	@GetMapping("/")
	public String accueil(Model model){
		log.info("------------------------Envoi requête vers accueil");
		
		Personne person= new Personne();
		
		model.addAttribute("person", person);
		
		return "accueil";
		
	}
	
	@PostMapping(value="/saisir")
	public String direBonjour(Personne person, Model model) {
		
		
		String message="Bonjour " + person.getPrenom() +  " " +  person.getNom()+ ", c'est bientôt le weekend !";
		
		person.setMessage(message);
		model.addAttribute("person", person);
		
		return "accueil" ;
	}
}
