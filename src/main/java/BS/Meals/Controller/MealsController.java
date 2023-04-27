package BS.Meals.Controller;

import BS.Meals.User.Meals;
import BS.Meals.Service.MealsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/all-meals")
public class MealsController {

    private final MealsService mealsService;
    @Autowired
    public MealsController(MealsService mealsService) {
        this.mealsService = mealsService;
    }

    @GetMapping
    public List<Meals> getAllMeals() {
        return mealsService.allMeals();
    }

    @GetMapping("/chicken")
    public List<Meals> chickenMeals() {
        return mealsService.chickenMeals();
    }
    @GetMapping("/lunch")
    public List<Meals> lunchBeefMeal() {
        return mealsService.lunchBeefMeal();
    }@GetMapping("/breakfast")
    public List<Meals> breakfastMeal() {
        return mealsService.breakfastMeal();
    }
}
