package com.karan.Community.Food.Sharing.Platform.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.karan.Community.Food.Sharing.Platform.Entities.FoodItem;
import com.karan.Community.Food.Sharing.Platform.Repositories.FoodItemRepository;

import jakarta.persistence.EntityNotFoundException;

@RestController
@RequestMapping("/food")
public class FoodManagement {
    @Autowired
    private FoodItemRepository foodItemRepository;
    @PostMapping("/register")
    private FoodItem registerFoodItem(@RequestBody FoodItem foodItem){
        return foodItemRepository.save(foodItem);
    }
    // End point to get all FoodItems
    @GetMapping("/food")
    private List<FoodItem>getAllFoodItems(){
    return foodItemRepository.findAll();
}
// End point to find food by id 
@GetMapping("/food/{id}")
private FoodItem getItemById(@PathVariable Long id){
    return foodItemRepository.findById(id).orElseThrow(()->new EntityNotFoundException("FoodItems not found for id" +id));

}
}