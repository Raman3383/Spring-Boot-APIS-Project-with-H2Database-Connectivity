package com.example.finalTerm.Controller;

import com.example.finalTerm.Entity.Fruit;
import com.example.finalTerm.Service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RequestMapping("/fruits")
@RestController
public class FruitController {
    @Autowired
    FruitService fruitService;

    @PostMapping
    public Fruit saveFruit(@RequestBody Fruit fruit){
        return fruitService.saveFruit(fruit);
    }
    @GetMapping
    public Collection<Fruit> getAllFruits(){
        return fruitService.getAllFruits();
    }
    @GetMapping("/{id}")
    public Fruit getFruitById(@PathVariable("id") Long id){
        return fruitService.getFruitById(id);
    }

    @PutMapping("/{id}")
    public Fruit updateFruitById(@PathVariable("id") Long id ,@RequestBody Fruit fruit){
        return fruitService.updateFruitById(id,fruit);
    }
    @DeleteMapping("/{id}")
    public void deleteFruitById(@PathVariable Long id){
        fruitService.deleteFruitById(id);
    }

    @PostMapping("/pricehike")
    public Fruit fruitWithHighPrice(@RequestBody Fruit fruit){
        return fruitService.fruitWithHighPrice(fruit);
    }

    @GetMapping("/reducedPrice")
    public Collection<Fruit> getFruitsWithReducedPrice(){
        return fruitService.getFruitsWithReducedPrice();
    }
}
