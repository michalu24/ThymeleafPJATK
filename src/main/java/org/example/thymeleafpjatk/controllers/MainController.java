package org.example.thymeleafpjatk.controllers;

import lombok.AllArgsConstructor;
import org.example.thymeleafpjatk.model.index.Properties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class MainController {

    private final Properties properties;

    @GetMapping("/")
    public String mainPage(Model model) {
        model.addAttribute("props", properties);
        return "index";
    }
}
