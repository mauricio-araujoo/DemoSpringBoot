package com.mauricio.modulo2.project.common;

public class SwimCoach implements Coach{

    public SwimCoach(){
        System.out.println("Construinfo um: "+ getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Nadar 30 metros!! no aquecimento";
    }
}
