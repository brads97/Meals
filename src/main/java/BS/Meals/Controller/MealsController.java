package BS.Meals.Controller;

import BS.Meals.Manager.MealsManager;
import BS.Meals.Service.MealsService;
import BS.Meals.User.Meals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/meals")
public class MealsController {

    @Autowired
    public MealsController(final MealsService mealsService) {
        this.mealsService = mealsService;
    }

    private MealsService mealsService;

    @GetMapping
    public List<Meals> getAllMeals() {
        return mealsService.getAllMeals();
    }

    @GetMapping("/chicken")
    public List<Meals> test() {
        return mealsService.getChickenMeals();
    }
}

