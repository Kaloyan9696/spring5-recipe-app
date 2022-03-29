package guru.springframework.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@EqualsAndHashCode(exclude = {"recipe", "unitOfMeasure"})
public class Ingredient {
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String description;
    private BigDecimal amount;

    @ManyToOne
    private Recipe recipe;

    @OneToOne
    private UnitOfMeasure unitOfMeasure;


    public Ingredient(String description, BigDecimal amount, UnitOfMeasure eachUom, Recipe tacosRecipe) {
        this.description = description;
        this.amount = amount;
        this.recipe = tacosRecipe;
        this.unitOfMeasure = eachUom;

    }

    public Ingredient() {

    }
}
