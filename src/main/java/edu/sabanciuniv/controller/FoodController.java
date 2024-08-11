package edu.sabanciuniv.controller;

import edu.sabanciuniv.entity.Food;
import edu.sabanciuniv.service.FoodService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/food")
public class FoodController {
    private final FoodService foodService;
    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }
    @GetMapping("/all")
    public List<Food> getAllFoods(){
        return foodService.getAllFoods();
    }

    @GetMapping("/id/{id}")
    public Food getFoodById(@PathVariable Integer id){
        return foodService.getFoodById(id);
    }

    @GetMapping("/category/{category}")
    public List<Food> getFoodByCategoryName(@PathVariable String categoryName){
        return foodService.getFoodByCategoryName(categoryName);
    }

    @PostMapping("/insert")
    public Food insertFood(@RequestBody Food food){
        return foodService.insertFood(food);
    }

    @PutMapping("/update/{id}")
    public Food updateFood(@RequestBody Food food, @PathVariable Long id){
        return foodService.updateFoodById(food, id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteFoodById(@PathVariable Integer id){
        foodService.deleteFoodById(id);
    }

    @DeleteMapping("/delete-all")
    public void deleteAllFoods(){
        foodService.deleteAllFoods();
    }
}


