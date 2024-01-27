package com.rohith.FitnessCutlet.api.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class UserData {
    String fitnessLevel, gender;
    double age, height, weight;

    public double getFitnessLevel() {
        return switch (fitnessLevel) {
            case "sedentary" -> 1.2;
            case "lightly-acitve" -> 1.375;
            case "moderately-active" -> 1.55;
            case "very-active" -> 1.725;
            case "extremly-active" -> 1.9;
            default -> 0;
        };
    }
}
