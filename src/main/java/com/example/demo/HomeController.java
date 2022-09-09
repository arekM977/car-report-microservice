package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class HomeController {

    // http://localhost:8081
    //
    @GetMapping
    @ResponseBody
    public String index() {

        // request url
        String url = "http://localhost:8080/vehicles/1";

// create an instance of RestTemplate
        RestTemplate restTemplate = new RestTemplate();

// make an HTTP GET request
        String json = restTemplate.getForObject(url, String.class);
        RestTemplate template = new RestTemplate();

        return json;
    }
}