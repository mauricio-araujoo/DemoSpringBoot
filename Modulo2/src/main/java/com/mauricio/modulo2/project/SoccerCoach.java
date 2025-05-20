package com.mauricio.modulo2.project;

import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice Pull 100 Ups!";
    }
}
