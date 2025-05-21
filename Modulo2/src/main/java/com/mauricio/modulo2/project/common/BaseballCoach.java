package com.mauricio.modulo2.project.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON) // SCOPE_PROTOTYPE = cria um novo ja o SCOPE_SINGLETON = so reutiliza
public class BaseballCoach implements Coach{
    public BaseballCoach(){
        System.out.println("In construction: "+ getClass().getSimpleName());
    }

    @PostConstruct
    public void makeSomethingInCreation(){
        System.out.println("Este print é na criação");
    }

    @PreDestroy  // SCOPE_PROTOTYPE nao chama esse metodo pois o spring nao se responsabiliza pelo ciclo de vida completo do objeto quando ele esta no escopo de prototipo
    public void makeSomethingInDestroy(){
        System.out.println("Este print é quando destroi");
    }

    @Override
    public String getDailyWorkout() {
        return "Esse retorna baseball";
    }
}
