package com.karan.Community.Food.Sharing.Platform.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.karan.Community.Food.Sharing.Platform.Entities.FoodItem;
@Repository
public interface FoodItemRepository extends JpaRepository<FoodItem,Long>{

}
