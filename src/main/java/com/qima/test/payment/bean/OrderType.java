package com.qima.test.payment.bean;

public enum OrderType {
    ON_LINE("online"),
    OFF_LINE("offline"),
    INTERNAL("internal");

    private String name;
    private OrderType(String name) {
        this.name = name;
    }
}
