package com.rohith.FitnessCutlet.api.model;

import org.springframework.stereotype.Component;

@Component
public class UserData {
    String fitnessLevel,age, height, weight, gender;

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getAge() {
        return Integer.parseInt(age);
    }
    public void setAge(String age) {
        this.age = age;
    }

    public int getHeight() {
        return Integer.parseInt(height);
    }
    public void setHeight(String height) {
        this.height = height;
    }

    public int getWeight() {
        return Integer.parseInt(weight);
    }
    public void setWeight(String weight) {
        this.weight = weight;
    }

    public double getFitnessLevel() {
        if(fitnessLevel.equals("sedentary")){
            return 1.2;
        }
        else if(fitnessLevel.equals("lightly-acitve")){
            return 1.375;
        }
        else if(fitnessLevel.equals("moderately-active")){
            return 1.55;
        }
        else if(fitnessLevel.equals("very-active")){
            return 1.725;
        }
        else if(fitnessLevel.equals("extremly-active")){
            return 1.9;
        }
        // else { // throw exception
        //  }
        return 0;
    }

    public void setFitnessLevel(String fitnessLevel) {
        this.fitnessLevel = fitnessLevel;
    }
}
