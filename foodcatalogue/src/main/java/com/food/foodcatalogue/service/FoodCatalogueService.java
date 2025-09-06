package com.food.foodcatalogue.service;


import com.food.foodcatalogue.dto.FoodItemDTO;
import com.food.foodcatalogue.entity.FoodItem;
import com.food.foodcatalogue.mapper.FoodItemMapper;
import com.food.foodcatalogue.repo.FoodItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodCatalogueService {

    @Autowired
    FoodItemRepo foodItemRepo;

    public FoodItemDTO addFoodItem(FoodItemDTO foodItemDTO) {
        FoodItem entity = FoodItemMapper.INSTANCE.mapFoodItemDTOToFoodItem(foodItemDTO);
        FoodItem saved = foodItemRepo.save(entity);
        return FoodItemMapper.INSTANCE.mapFoodItemToFoodItemDTO(saved);
    }
}
