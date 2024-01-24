package com.example.finalTerm.Service;

import com.example.finalTerm.Entity.Fruit;
import com.example.finalTerm.Repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class FruitService {
    @Autowired
    FruitRepository fruitRepository;

    public Fruit saveFruit(Fruit fruit) {
        return fruitRepository.save(fruit);
    }

    public Collection<Fruit> getAllFruits() {
        return fruitRepository.findAll();
    }

    public Fruit getFruitById(Long id) {
        return fruitRepository.findById(id).get();
    }

    public Fruit updateFruitById(Long id, Fruit fruit) {
        Fruit fruit1 = fruitRepository.findById(id).get();
        fruit1.setFruitName(fruit.getFruitName());
        fruit1.setFruitDescription(fruit.getFruitDescription());
        fruit1.setFruitPrice(fruit.getFruitPrice());
        return fruitRepository.save(fruit1);
    }

    public void deleteFruitById(Long id){
      fruitRepository.deleteById(id);
    }


    public Fruit fruitWithHighPrice(Fruit fruit) {
        double updatedPrice = fruit.getFruitPrice() + 10;
        fruit.setFruitPrice(updatedPrice);
        return fruitRepository.save(fruit);
    }

    public Collection<Fruit> getFruitsWithReducedPrice() {
        List<Fruit> allFruits = fruitRepository.findAll();
        List<Fruit> fruitsWithReducedPrice = new ArrayList<>();
        for(Fruit fruits:allFruits){
            double discount = 0.1 * (fruits.getFruitPrice());
            double reducedPrice = fruits.getFruitPrice() - discount;
            fruits.setFruitPrice(reducedPrice);
            fruitsWithReducedPrice.add(fruits);
        }
        return fruitRepository.saveAll(fruitsWithReducedPrice);
    }

}
