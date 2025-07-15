package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class CountryController {
    @GetMapping("/countries")
    public List<Country> getAll() {
        return List.of(
            new Country("India", "IN"),
            new Country("USA", "US"),
            new Country("Germany", "DE")
        );
    }
}