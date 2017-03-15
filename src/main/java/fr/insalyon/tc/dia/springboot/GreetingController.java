package fr.insalyon.tc.dia.springboot;

import fr.insalyon.tc.dia.springboot.hello.GreetingService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController{

    @GetMapping("/greet")
    @ResponseBody
    public String greet(@RequestParam String name) {
        return String.format("Hello %s", name);
    }
}
