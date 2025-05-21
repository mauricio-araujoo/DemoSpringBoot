package com.mauricio.modulo2.project.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Lazy //Redundante por conta da propriedade no application.properties
public class SoccerCoach implements Coach {

    public SoccerCoach(){
        System.out.println("In construction: "+ getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice Pull 100 Ups!";
    }
}
