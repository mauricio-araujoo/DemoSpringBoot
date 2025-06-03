package thymeleaf.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DemoController {

    @GetMapping("/hello/{nome}")
    public String getModel(Model front, @PathVariable String nome){
        front.addAttribute("name", nome);

        return "helloworld";
    }
}
