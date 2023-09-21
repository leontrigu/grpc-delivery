package com.perficient.orderapp.domain.service;

import com.perficient.orderapp.application.port.in.CreateOrderUseCase;
import com.perficient.orderapp.domain.model.Customer;
import com.perficient.orderapp.domain.model.Order;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CreateOrderService implements CreateOrderUseCase {


    @Override
    public Order create(UUID customerId) {
        return null;
    }
}
