package BS.Meals.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "BS.Meals")
@SpringBootApplication
public class MealsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MealsApplication.class, args);
    }

}

