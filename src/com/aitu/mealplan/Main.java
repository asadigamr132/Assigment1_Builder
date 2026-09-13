package com.aitu.mealplan;

public class Main {
    public static void main(String[] args) {
        MealPlan muscleGainPlan = new MuscleGainMealPlanBuilder()
                .setName("MuscleGain")
                .setDailyCalories(3300)
                .setDailyProtein(170)
                .setMealsPerDay(5)
                .build();
        MealPlan weightLossPlan = new WeightLossMealPlanBuilder()
                .setName("WeightLoss")
                .setDailyCalories(2400)
                .setDailyProtein(160)
                .setMealsPerDay(4)
                .build();
        System.out.println(muscleGainPlan);
        System.out.println(weightLossPlan);
    }
}
