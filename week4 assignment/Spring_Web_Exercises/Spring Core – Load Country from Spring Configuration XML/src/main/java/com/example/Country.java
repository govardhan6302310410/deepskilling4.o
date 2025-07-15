package com.example;

public class Country {
    private String name;
    private String code;

    public void setName(String name) { this.name = name; }
    public void setCode(String code) { this.code = code; }

    @Override
    public String toString() {
        return "Country{name='" + name + "', code='" + code + "'}";
    }
}