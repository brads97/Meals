package BS.Meals;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/all-meals")
public class MealsController {

    private final MealsRepository mealsRepository;
    public MealsController(MealsRepository mealsRepository) {
        this.mealsRepository = mealsRepository;
    }

    @GetMapping
    public List<Meals> getAllMeals() {
        return mealsRepository.findAll();
    }

}
