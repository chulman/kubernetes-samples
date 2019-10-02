package com.chulman.k8s.sample;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("host", new Host());
        return "index";
    }

    @GetMapping("/healthCheck")
    @ResponseBody
    public String healthCheck() {
        return "healthy";
    }
}
