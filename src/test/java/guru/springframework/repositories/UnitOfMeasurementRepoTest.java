package guru.springframework.repositories;

import guru.springframework.domain.UnitOfMeasure;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitOfMeasurementRepoTest {

    @Autowired
    UnitOfMeasurementRepo unitOfMeasurementRepo;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void findByDescription() {
        Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasurementRepo.findByDescription("Teaspoon");
        assertEquals("Teaspoon", unitOfMeasure.get().getDescription());
    }
}