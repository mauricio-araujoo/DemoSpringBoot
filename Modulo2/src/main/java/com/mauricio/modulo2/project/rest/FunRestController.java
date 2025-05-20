package com.mauricio.modulo2.project.rest;

import com.mauricio.modulo2.project.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    private Coach myCoach;

    @Autowired
    public FunRestController(Coach theCoach){
        myCoach = theCoach;
    }

    @GetMapping("/dailyWorkout")
    public String getWorkout(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/")
    public String getIndex(){
        return "Ola";
    }
}
