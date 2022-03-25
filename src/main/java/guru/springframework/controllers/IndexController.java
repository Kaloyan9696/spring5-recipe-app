package guru.springframework.controllers;

import guru.springframework.domain.Category;
import guru.springframework.domain.UnitOfMeasure;
import guru.springframework.repositories.CategoryRepo;
import guru.springframework.repositories.UnitOfMeasurementRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * Created by jt on 6/1/17.
 */
@Controller
public class IndexController {

    private CategoryRepo categoryRepo;
    private UnitOfMeasurementRepo unitOfMeasurementRepo;

    public IndexController(CategoryRepo categoryRepo, UnitOfMeasurementRepo unitOfMeasurementRepo) {
        this.categoryRepo = categoryRepo;
        this.unitOfMeasurementRepo = unitOfMeasurementRepo;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(){

        return "index";

    }


}
