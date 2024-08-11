package edu.sabanciuniv.service;

import edu.sabanciuniv.entity.Food;
import edu.sabanciuniv.repository.FoodRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class FoodService {
    private final FoodRepository foodRepository;
    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }
    public List<Food> getAllFoods(){
        return foodRepository.findAll();
    }

    public Food getFoodById(Integer id){
        return foodRepository.findById(id).orElseThrow(() -> new NoSuchElementException(String.format("Food with id %s not found", id)));
    }

    public List<Food> getFoodByCategoryName(String categoryName){
        return foodRepository.findByCategory_Name(categoryName);
    }

    public Food insertFood(Food food){
        return foodRepository.save(food);
    }

    public Food updateFoodById(Food food, Long id){
        return foodRepository.save(food);
    }

    public void deleteFoodById(Integer id){
        foodRepository.deleteById(id);
    }

    public void deleteAllFoods(){
        foodRepository.deleteAll();
    }
}

