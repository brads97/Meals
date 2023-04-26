package BS.Meals;

import BS.Meals.MealsRepository;
import BS.Meals.Meals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/meal-plan")
public class MealsController {


    private final MealsRepository mealsRepository;

    @Autowired
    public MealsController(MealsRepository mealsRepository) {
        this.mealsRepository = mealsRepository;
    }

    @GetMapping("/allmeals")
    public List<Meals> getAllMeals() {
        return mealsRepository.findAll();
    }

}

