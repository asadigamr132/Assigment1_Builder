package com.aitu.mealplan;

public class MealPlanDirector {
    public MealPlan createMuscleGainPlan(MealPlanBuilder builder){
        return builder
                .setName("Muscle Gain")
                .setGoal("BuildMuscleMass")
                .setDailyCalories(3300)
                .setDailyProtein(180)
                .setMealsPerDay(5)
                .build();
    }

    public MealPlan createWeightLossPlan(MealPlanBuilder builder){
        return builder
                .setName("Weight Loss")
                .setGoal("Reduce Body Weight")
                .setDailyCalories(2400)
                .setDailyProtein(170)
                .setMealsPerDay(4)
                .build();
    }
}
