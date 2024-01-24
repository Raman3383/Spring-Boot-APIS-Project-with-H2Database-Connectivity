package com.example.finalTerm.Repository;

import com.example.finalTerm.Entity.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitRepository extends JpaRepository<Fruit,Long> {
}
