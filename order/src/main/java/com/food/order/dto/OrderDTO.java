package com.food.order.dto;

import java.util.List;

public class OrderDTO {
    private Integer orderId;
    private List<FoodItemsDTO> foodItemList;
    private Restaurant restaurant;
    private UserDTO userDTO;
}
