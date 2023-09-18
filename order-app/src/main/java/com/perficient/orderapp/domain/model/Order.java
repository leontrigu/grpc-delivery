package com.perficient.orderapp.domain.model;

import lombok.Data;
import lombok.NonNull;

@Data
public class Order {

    @NonNull
    private String orderId;

    @NonNull
    private String name;

}