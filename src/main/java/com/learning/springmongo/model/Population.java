package com.learning.springmongo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
@NoArgsConstructor
@Getter
@Setter
public class Population {
    @Id
    private String _id;
    @Field(name = "CountryName")
    private String countryName;
    @Field(name = "CountryCode")
    private String countryCode;
    @Field(name = "RaceCode")
    private long raceCode;
    @Field(name = "Age")
    private int age;
    @Field(name = "RaceName")
    private String raceName;
    @Field(name = "Population")
    private long population;
}
