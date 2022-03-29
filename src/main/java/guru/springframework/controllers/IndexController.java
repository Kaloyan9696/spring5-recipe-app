package guru.springframework.controllers;

import guru.springframework.domain.Category;
import guru.springframework.domain.UnitOfMeasure;
import guru.springframework.repositories.CategoryRepo;
import guru.springframework.repositories.UnitOfMeasurementRepo;
import guru.springframework.services.RecipeService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * Created by jt on 6/1/17.
 */
@Slf4j
@Controller
public class IndexController {

    private CategoryRepo categoryRepo;
    private UnitOfMeasurementRepo unitOfMeasurementRepo;
    private RecipeService recipeService;

    public IndexController(CategoryRepo categoryRepo, UnitOfMeasurementRepo unitOfMeasurementRepo) {
        log.debug("I'm in Index controller");
        this.categoryRepo = categoryRepo;
        this.unitOfMeasurementRepo = unitOfMeasurementRepo;
    }

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model){
        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";

    }


}
