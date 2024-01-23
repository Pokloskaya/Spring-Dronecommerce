package com.springDrone.ecommerce.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    @GetMapping("/products")
    public String products() {
        return "/product/index";
    }
    
}
