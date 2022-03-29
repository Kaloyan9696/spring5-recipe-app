package guru.springframework.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@EqualsAndHashCode(exclude = {"recipes"})
@Data
public class Category {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String description;

    @ManyToMany(mappedBy = "category")
    private Set<Recipe> recipes = new HashSet<>();

    public Set<Recipe> getRecipes() {
        return recipes;
    }


}
