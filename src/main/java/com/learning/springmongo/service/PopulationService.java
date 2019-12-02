package com.learning.springmongo.service;

import com.learning.springmongo.model.Population;
import com.learning.springmongo.repository.PopulationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PopulationService {
    @Autowired
    private PopulationRepository repository;

    public Population getPop() {
        return repository.findById("5de3dd430b2684731dd76998").get();
    }

    public List<Population> getPop(String countryName, long population) {
        return repository.findByCountryNameAndPopulation(countryName, population)
                .stream()
                .limit(5)
                .collect(Collectors.toList());
    }
}
