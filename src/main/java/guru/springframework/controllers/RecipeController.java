package guru.springframework.controllers;

import guru.springframework.repositories.RecipeRepo;
import guru.springframework.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RecipeController {

    private RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"",  "/recipe/index", "/recipe/index.html"})
    public String listRecipes(Model model) {
        model.addAttribute("recipes", recipeService.getRecipes());
        return "recipe/index";
    }
}
