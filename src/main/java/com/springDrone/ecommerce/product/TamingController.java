package com.springDrone.ecommerce.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TamingController {

    @GetMapping("/taming")
    public String products() {
        return "/taming/index";
    }
    
}
