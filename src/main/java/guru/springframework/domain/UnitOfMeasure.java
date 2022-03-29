package guru.springframework.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class UnitOfMeasure {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String description;
}
