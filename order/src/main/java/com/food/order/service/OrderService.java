package com.food.order.service;

import com.food.order.dto.OrderDTO;
import com.food.order.dto.OrderDTOFromFrontEnd;
import com.food.order.dto.UserDTO;
import com.food.order.entity.Order;
import com.food.order.entity.Sequence;
import com.food.order.mapper.OrderMapper;
import com.food.order.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {
    @Autowired
    OrderRepo orderRepo;

    @Autowired
    SequenceGenerator sequenceGenerator;

    @Autowired
    RestTemplate restTemplate;

    public OrderDTO saveOrderInDB(OrderDTOFromFrontEnd orderDetails) {
        Integer newOrderID = sequenceGenerator.generateNextOrderId();
        UserDTO userDTO = fetchOrderDetailsFromUserId(orderDetails.getUserId());
        Order orderToBeSaved = new Order(newOrderID,orderDetails.getFoodItemsDTOList(),orderDetails.getRestaurant(),userDTO);
        orderRepo.save(orderToBeSaved);
        return OrderMapper.INSTANCE.mapFoodItemToFoodItemDTO(orderToBeSaved);
    }

    private UserDTO fetchOrderDetailsFromUserId(Integer userId) {
        return restTemplate.getForObject("http://USER-SERVICE/user/fetchUserById/"+userId, UserDTO.class);
    }
}
