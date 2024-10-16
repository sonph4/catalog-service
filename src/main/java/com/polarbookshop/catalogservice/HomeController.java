package com.polarbookshop.catalogservice;

import com.polarbookshop.catalogservice.configuration.ApplicationConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private final ApplicationConfiguration configuration;

    public HomeController(ApplicationConfiguration configuration) {
        this.configuration = configuration;
    }


    @GetMapping("/")
    public String welcome(){
        return configuration.getGreeting();
    }
}
