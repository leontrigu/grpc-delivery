package com.perficient.orderapp.application.port.in;

import com.perficient.orderapp.domain.model.Customer;
import com.perficient.orderapp.domain.model.Order;
import com.perficient.orderapp.domain.model.PaymentDetails;

public interface PayOrderUseCase {

    void payOrder(Order order);
}