package thymeleaf.demo.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

        @RequestMapping("/showform")
        public String showForm(){
            return "helloworld-form";
        }


    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }

    @RequestMapping("/processFormV2")
    public String readData(HttpServletRequest request, Model modelo){

            String theName = request.getParameter("studentName").toUpperCase();

            String result = "Ola "+ theName;

            modelo.addAttribute("message",result);

            return "helloworld";
    }

    @RequestMapping("/processFormV3")
    public String readDataV3(@RequestParam("studentName") String name, Model modelo){

        String result = "Ola blabla "+ name.toUpperCase();

        modelo.addAttribute("message",result);

        return "helloworld";
    }
}
