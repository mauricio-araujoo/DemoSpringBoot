package com.maubas.demo.MyDemoProject.rest;

import com.maubas.demo.MyDemoProject.model.Pet;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class FunRestController {

    @Value("${name.author}")
    private String nome;

    @GetMapping("/")
    public String getIndex(){
        return "Hello World "+nome;
    }

    @GetMapping("/{id}")
    public String getId(@PathVariable long id){
        return "Seu id é "+id;
    }

    @PostMapping(path = "/pets", consumes = "application/json")
    public String addPet(@RequestBody Pet pet) {
        return "Recebi o pet " + pet.getNome() + " da raça "+ pet.getTipo();
    }

}
