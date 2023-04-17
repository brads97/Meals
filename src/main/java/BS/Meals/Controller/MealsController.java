package BS.Meals.Controller;

import BS.Meals.Manager.MealsManager;
import BS.Meals.User.Meals;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/meals")
public class MealsController {

    private MealsManager mealsManager;
    public MealsController(final MealsManager mealsManager) {
        this.mealsManager = mealsManager;
    }

    @GetMapping
    public List<Meals> getAllMeals() {
        return mealsManager.getNumberOfMeals();


    }
}
