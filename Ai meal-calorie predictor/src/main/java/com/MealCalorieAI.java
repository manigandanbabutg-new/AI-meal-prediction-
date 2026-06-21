package com.ai.meal;

import java.util.HashMap;
import java.util.Map;

public class MealCalorieAI {

    private Map<String, Integer> meals =
            new HashMap<>();

    public MealCalorieAI() {

        meals.put("idli", 58);
        meals.put("dosa", 168);
        meals.put("chapati", 120);
        meals.put("rice", 130);
        meals.put("banana", 89);
        meals.put("apple", 52);
        meals.put("egg", 78);
        meals.put("milk", 42);
        meals.put("pizza", 266);
        meals.put("burger", 295);
    }

    public String predict(String meal, int quantity) {

        meal = meal.toLowerCase();

        if(meals.containsKey(meal)) {

            int calories =
                    meals.get(meal) * quantity;

            return "Meal: " + meal +
                   "\nQuantity: " + quantity +
                   "\nEstimated Calories: " +
                   calories + " kcal";
        }

        return "Meal not found in dataset.";
    }
}
