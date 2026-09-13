package com.aitu.mealplan;

public class MealPlanDirector {
    public MealPlan createMuscleGainPlan(MealPlanBuilder builder){
        return builder
                .setName("Muscle Gain")
                .setDailyCalories(3300)
                .setDailyProtein(180)
                .setMealsPerDay(5)
                .build();
    }

    public MealPlan createWeightLossPlan(MealPlanBuilder builder){
        return builder
                .setName("Weight Loss")
                .setDailyCalories(2400)
                .setDailyProtein(170)
                .setMealsPerDay(4)
                .build();
    }
}
