 Meal Plan Builder

@ Course Information
- Student Name: Abdraissov Altair 
- University: Astana IT University
- Course: SE-2528
- Programming Language: Java
- JDK Version: 17
- Design Pattern: Builder

@ Project Description

This project demonstrates the Builder Design Pattern using a meal plan
creation system.

The system allows creating different types of meal plans:

- Muscle Gain Meal Plan
- Weight Loss Meal Plan

The Builder Pattern separates the construction of a complex object from
its representation.

@ Project Structure

- `MealPlan` — Product class.
- `MealPlanBuilder` — Builder interface.
- `MuscleGainMealPlanBuilder` — Concrete Builder for muscle gain plans.
- `WeightLossMealPlanBuilder` — Concrete Builder for weight loss plans.
- `MealPlanDirector` — Director that defines the construction process.
- `Main` — Client class that runs the program.

@ Builder Pattern Structure

<img width="487" height="431" alt="image" src="https://github.com/user-attachments/assets/05c6563b-af01-4e34-b6ad-74aafa285e31" />

Features

Fluent API and method chaining.

Two concrete builders.

Director for predefined meal plans.

Encapsulation using private fields.

Immutable product fields using final.

Validation of input values.

Clear separation of responsibilities.

Example
MealPlanDirector director = new MealPlanDirector();

MealPlan muscleGainPlan =
        director.createMuscleGainPlan(
                new MuscleGainMealPlanBuilder()
        );

MealPlan weightLossPlan =
        director.createWeightLossPlan(
                new WeightLossMealPlanBuilder()
        );

System.out.println(muscleGainPlan);
System.out.println(weightLossPlan);
Validation

The builders validate the following values:

Name cannot be empty.

Daily calories must be greater than zero.

Daily protein must be greater than zero.

Meals per day must be greater than zero.

If invalid data is provided, the builder throws IllegalArgumentException.

Technologies

Java 17

IntelliJ IDEA

Git

GitHub

How to Run

Clone the repository.

Open the project in IntelliJ IDEA.

Make sure JDK 17 is selected.

Run the Main class.
