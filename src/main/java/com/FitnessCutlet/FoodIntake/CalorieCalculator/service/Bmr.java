package com.FitnessCutlet.FoodIntake.CalorieCalculator.service;
/*
 * BMR stands for Basil Metabolic Rate
 * Def: amount of calories burning when body is resting
 */

import com.FitnessCutlet.FoodIntake.CalorieCalculator.model.UserData;

public class Bmr {
    private double value;
    UserData data;
    
    public Bmr(UserData userData) {
        data = userData;
    }

    public double getBMR() {
        double temp = 0;
        if(data.getGender().equals("male")){
            temp = (65) + (6.2 * data.getWeight()) + (12.7 * data.getHeight()) - (6.8 * data.getAge());
            setBMR(temp); 
        }
        else {
            temp = (655) + (4.3 * data.getWeight()) + (4.3 * data.getHeight()) - (4.7 * data.getAge());
            setBMR(temp); 
        }
        return value;
    }

    public void setBMR(double value) {
        this.value = value;
    }
}
