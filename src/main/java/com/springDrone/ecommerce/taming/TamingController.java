package com.springDrone.ecommerce.taming;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/taming")
public class TamingController {

    @GetMapping
    public String index(Model model) {
        model.addAttribute("pageTitle", "Taming Thymeleaf");
        model.addAttribute("variable", "I am a variable");
        model.addAttribute("expressionInlining", "Instead of using 'th:*' tags to use variables!!");
        model.addAttribute("condition", 11);
        model.addAttribute("scientists", List.of("Albert Einstein",
                                                 "Niels Bohr",
                                                 "James Clerk Maxwell"));
                        
        model.addAttribute("drones", new String[]{"Dji Model 3", "Racing Drone", "Agro Drone"});                                         
        
        return "/taming/index";
    }
}