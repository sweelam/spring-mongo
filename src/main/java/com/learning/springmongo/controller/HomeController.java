package com.learning.springmongo.controller;


import com.learning.springmongo.model.Population;
import com.learning.springmongo.service.PopulationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HomeController {
    @Autowired
    private PopulationService popService;

    @GetMapping("/population")
    public Mono<Population> getPop() {
        return Mono.just(popService.getPop());
    }


    @GetMapping("/population/byCountry/blocked")
    public ResponseEntity<List<Population>> getPopByCountryNameAndPopulationBlocked(@RequestParam String countryName, @RequestParam long population) {
        return ResponseEntity.ok(popService.getPop(countryName, population));
    }


    @GetMapping("/population/byCountry")
    public Mono<List<Population>> getPopByCountryNameAndPopulation(@RequestParam String countryName, @RequestParam long population) {
        return Mono.just(popService.getPop(countryName, population));
    }
}
