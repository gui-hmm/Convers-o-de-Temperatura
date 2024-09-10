package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @GetMapping("/celsiusParaFahrenheit/{grau}")
    public Double convertFahrenheit(@PathVariable Double grau){
        return (grau * 1.8) +32;
    }

    @GetMapping("/fahrenheitParaCelsius/{grau}")
    public Double convertCelsius(@PathVariable Double grau){
        return ((grau - 32)  / 9)*5;
    }
}
