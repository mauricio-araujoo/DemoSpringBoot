package com.mauricio.modulo2.project.config;

import com.mauricio.modulo2.project.common.Coach;
import com.mauricio.modulo2.project.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatico")//id costumizado
    public Coach swimCoach(){ //tem que ser o id chamado no metodo qualifier
        return new SwimCoach();
    }

}
