package com.food.foodcatalogue.service;


import com.food.foodcatalogue.dto.FoodItemDTO;
import com.food.foodcatalogue.entity.FoodItem;
import com.food.foodcatalogue.mapper.FoodItemMapper;
import com.food.foodcatalogue.repo.FoodItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FoodCatalogueService {

    @Autowired
    FoodItemRepo footItemRepo;

    public FoodItemDTO addFoodItem(FoodItemDTO foodItemDTO) {
        FoodItem foodItemSaved = footItemRepo.save(FoodItemMapper.INSTANCE.mapFoodItemDTOToFoodItem(foodItemDTO));
        return FoodItemMapper.INSTANCE.mapFoodItemToFoodItemDTO(foodItemSaved);
    }
}
