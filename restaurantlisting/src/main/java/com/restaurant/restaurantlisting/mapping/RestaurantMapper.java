package com.restaurant.restaurantlisting.mapping;


import com.restaurant.restaurantlisting.dto.RestaurantDTO;
import com.restaurant.restaurantlisting.entity.Restaurant;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RestaurantMapper {
    RestaurantMapper INSTANCE = Mappers.getMapper(RestaurantMapper.class);

    Restaurant mapRestaurantDTOToRestaurant(RestaurantDTO restaurantDTO);
    RestaurantDTO mapRestaurantToRestaurantDTO(Restaurant restaurant);
}
