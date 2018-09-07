package fr.insee.bar.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseStatus;

import fr.insee.bar.date.Dates;

@Controller
public class AccueilController {

  @Value("${application.name}")
  private String name;

  @ModelAttribute("date")
  public String date() {
    return Dates.today();
  }

  @GetMapping("/")
  @ResponseStatus(HttpStatus.MOVED_PERMANENTLY)
  public String welcome() {
    return "redirect:/accueil";
  }

  @GetMapping("/accueil")
  public String hello(Model model) {
    model.addAttribute("message");
    return "accueil";
  }
}
