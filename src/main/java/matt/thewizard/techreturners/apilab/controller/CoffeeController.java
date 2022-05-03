package matt.thewizard.techreturners.apilab.controller;

import matt.thewizard.techreturners.apilab.model.Coffee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class CoffeeController {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping(value ="/coffeelover")
    public String coffeeLover(){
        return "I like coffee!";
    }

    @GetMapping(value ="/coffee")
    public Coffee coffee(@RequestParam(value = "name", defaultValue = "latte") String name){
        return new Coffee(counter.incrementAndGet(),name);
    }

}
