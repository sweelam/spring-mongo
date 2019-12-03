package com.learning.springmongo.repository;

import com.learning.springmongo.model.Population;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.util.List;

@Repository
public interface PopulationRepository extends ReactiveMongoRepository<Population, String> {
    Flux<Population> findByCountryNameAndPopulation(String countryName, long population);
}
