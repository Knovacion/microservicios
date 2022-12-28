package com.knovacion.bookingmicroservice.dto;

import com.knovacion.bookingmicroservice.entity.OrderItem;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class OrderDTO {

    private List<OrderItem> orderItems;
}