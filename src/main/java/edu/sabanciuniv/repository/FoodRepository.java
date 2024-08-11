package edu.sabanciuniv.repository;

import edu.sabanciuniv.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodRepository extends JpaRepository<Food, Integer> {
    List<Food> findByCategory_Name(String categoryName);
}
