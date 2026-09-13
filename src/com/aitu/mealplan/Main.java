package com.aitu.mealplan;

public class Main {
    public static void main(String[] args) {
        MealPlanDirector director = new MealPlanDirector();

        MealPlan muscleGainPlan = director.createMuscleGainPlan(
                new MuscleGainMealPlanBuilder()
        );

        MealPlan weightLossPlan = director.createWeightLossPlan(
                new WeightLossMealPlanBuilder()
        );


        System.out.println(muscleGainPlan);
        System.out.println(weightLossPlan);
    }
}
