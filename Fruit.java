package com.example.finalTerm.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Fruit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long fruitId;
    private String fruitName;
    private String fruitDescription;
    private double fruitPrice;

    @Override
    public String toString() {
        return "Fruit{" +
                "fruitId=" + fruitId +
                ", fruitName='" + fruitName + '\'' +
                ", fruitDescription='" + fruitDescription + '\'' +
                ", fruitPrice=" + fruitPrice +
                '}';
    }
}
