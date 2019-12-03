package com.learning.springmongo.service;

import com.learning.springmongo.model.Population;
import com.learning.springmongo.repository.PopulationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
@AllArgsConstructor
public class PopulationService {
    private PopulationRepository repository;

    public Mono<Population> getPop() {
        return repository.findById("5de3dd430b2684731dd76998");
    }

    public Mono<List<Population>> getPop(String countryName, long population) {
        return repository.findByCountryNameAndPopulation(countryName, population)
                .limitRequest(5)
                .log()
                .collectList();
    }
}
