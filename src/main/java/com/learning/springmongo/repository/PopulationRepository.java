package com.learning.springmongo.repository;

import com.learning.springmongo.model.Population;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PopulationRepository extends MongoRepository<Population, String> {
     List<Population> findByCountryNameAndPopulation(String countryName, long population);
}
