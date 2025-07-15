package com.example;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
public class CountryController {

    private static final Map<String, Country> countryMap = Map.of(
        "IN", new Country("India", "IN"),
        "US", new Country("USA", "US"),
        "DE", new Country("Germany", "DE")
    );

    @GetMapping("/country/{code}")
    public Country getCountryByCode(@PathVariable String code) {
        return countryMap.getOrDefault(code.toUpperCase(), new Country("Unknown", code));
    }
}