package com.food.foodcatalogue.service;


import com.food.foodcatalogue.entity.FoodItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FoodCatalogueService {

    @Autowired
    FoodItem footItemRepo;
}
