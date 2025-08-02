package com.restaurant.restaurantlisting.service;

import com.restaurant.restaurantlisting.dto.RestaurantDTO;
import com.restaurant.restaurantlisting.entity.Restaurant;
import com.restaurant.restaurantlisting.mapping.RestaurantMapper;
import com.restaurant.restaurantlisting.repo.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

@Service
public class RestaurantService {

    @Autowired
    RestaurantRepo restaurantRepo;

    public List<RestaurantDTO> findAllRestaurants() {
        List<Restaurant> restaurants = restaurantRepo.findAll();
        // map it to list of DTO
        return restaurants.stream()
                .map(RestaurantMapper.INSTANCE::mapRestaurantToRestaurantDTO)
                .toList();
    }
}
