package com.food.foodcatalogue.controller;


import com.food.foodcatalogue.dto.FoodCataloguePage;
import com.food.foodcatalogue.dto.FoodItemDTO;
import com.food.foodcatalogue.service.FoodCatalogueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/foodCatalogue")
public class FoodCatalogueController {

    @Autowired
    FoodCatalogueService foodCatalogueService;

    @PostMapping("/addFoodItem")
    public ResponseEntity<FoodItemDTO> addFoodItem(@RequestBody FoodItemDTO foodItemDTO) {
        FoodItemDTO foodItemSaved = foodCatalogueService.addFoodItem(foodItemDTO);
        return new ResponseEntity<>(foodItemSaved, HttpStatus.CREATED);
    }

    @GetMapping("/fetchRestaurantAndFoodById/{id}")
    public ResponseEntity<FoodCataloguePage> fetchRestaurantDetailWithFoodMenu(@PathVariable Integer restaurantId) {
        FoodCataloguePage foodCataloguePage = foodCatalogueService.fetchFoodCatalogPageDetails(restaurantId);
        return new ResponseEntity<>(foodCataloguePage, HttpStatus.CREATED);
    }
}
