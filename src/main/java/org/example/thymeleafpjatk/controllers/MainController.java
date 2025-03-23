package org.example.thymeleafpjatk.controllers;

import lombok.AllArgsConstructor;
import org.example.thymeleafpjatk.model.index.Properties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@AllArgsConstructor
public class MainController {

    private final Properties properties;

    @GetMapping("/{name}")
    public String mainPage(@PathVariable("name") String fragmentType, Model model) {
        model.addAttribute("props", properties);
        model.addAttribute("fragmentType", fragmentType);
        return "index";
    }
}
