package com.tuananhdo.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    @GetMapping("/")
    public String homeFood(){
        return "web/web-home";
    }

    @GetMapping("/home")
    public String home (){
        return "admin/admin-home";
    }

    @GetMapping("/login")
    public String login(){
        return "web/login";
    }

    @GetMapping("/register")
    public String register(){
        return "web/register";
    }

    @GetMapping("/product-details")
    public String details(){
        return "web/product-details";
    }

    @GetMapping("/checkout")
    public String checkout(){
        return "web/checkout";
    }

    @GetMapping("/menu-list")
    public String menuList(){
        return "web/menu-list";
    }

    @GetMapping("/chicken")
    public String menuChicken(){
        return "web/menu-chicken";
    }

    @GetMapping("/about-us")
    public String aboutUs(){
        return "web/about-us";
    }
}
