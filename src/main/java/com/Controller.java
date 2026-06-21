package com.ai.meal;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Controller {

    private MealCalorieAI ai =
            new MealCalorieAI();

    @GetMapping("/predict")
    public String predict(
            @RequestParam String meal,
            @RequestParam int quantity
    ) {

        return ai.predict(
                meal,
                quantity
        );
    }
}
