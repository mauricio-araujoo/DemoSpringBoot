package restApi.mauricio.Rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    @GetMapping("/")
    public String getHello(){
        return "Hello World!";
    }
}
