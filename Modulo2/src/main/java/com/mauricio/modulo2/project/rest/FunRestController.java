package com.mauricio.modulo2.project.rest;

import com.mauricio.modulo2.project.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    private Coach myCoach;
    private Coach mySecondCoach;

//    @Autowired
//    public FunRestController(Coach theCoach){
//        myCoach = theCoach;
//    }

    @Autowired
    public FunRestController(
            @Qualifier("aquatico") Coach theCoach,
            @Qualifier("baseballCoach") Coach theSecondCoach){
        System.out.println("In construction: "+ getClass().getSimpleName());
        myCoach = theCoach;
        mySecondCoach = theSecondCoach;
    }

    @GetMapping("/dailyWorkout")
    public String getWorkout(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String checkCoach(){
        return "Checando se o objeto é o mesmo myCoach == mySecondCoach "+((mySecondCoach == myCoach)? "estilo singleton":"estilo prototipo");
    }

    @GetMapping("/")
    public String getIndex(){
        return "Ola";
    }

    @GetMapping("/{str}")
    public String getIndexSt(@PathVariable String str){
        return "Ola "+ str +"!!";
    }

}
