package fr.insee.bar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.insee.bar.beans.Employe;

@Controller
@RequestMapping("/commande")
public class CommandeController {

	@GetMapping
	public String commande(Employe salarie, Model model) {
		model.addAttribute("employe", salarie);
		return "commande";
	}
}