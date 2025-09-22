package com.food.order.mapper;

import com.food.order.dto.OrderDTO;
import com.food.order.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);
    Order mapFoodItemDTOToFoodItem(OrderDTO foodItemDTO);
    OrderDTO mapFoodItemToFoodItemDTO(Order foodItem);
}
