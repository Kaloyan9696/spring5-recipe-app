package guru.springframework.controllers;

import guru.springframework.repositories.RecipeRepo;
import guru.springframework.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class RecipeController {

    private RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        log.debug("I'm in Recipe controller");
        this.recipeService = recipeService;
    }

    @RequestMapping({"",  "/recipe"})
    public String listRecipes(Model model) {
        model.addAttribute("recipes", recipeService.getRecipes());
        return "recipe/index";
    }
}
