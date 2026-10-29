package ca.sheridancollege.rahika.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ca.sheridancollege.rahika.beans.Character;

@Controller
public class CharacterController {

	@GetMapping("/")
	public String indexPage(Model model) {
		model.addAttribute("filterCharacter", new Character());
		return "index";
	}
	
}
