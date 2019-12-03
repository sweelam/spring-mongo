package com.learning.springmongo.controller;


import com.learning.springmongo.model.Population;
import com.learning.springmongo.service.PopulationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class HomeController {
    private PopulationService popService;

    @GetMapping("/population")
    public Mono<Population> getPop() {
        return popService.getPop();
    }

    @GetMapping("/population/byCountry")
    public Mono<List<Population>> getPopByCountryNameAndPopulation(@RequestParam String countryName, @RequestParam long population) {
        return popService.getPop(countryName, population);
    }
}
