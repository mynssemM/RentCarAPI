package com.br.rentcarapi.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Order {

    private LocalDate moment;
    private OrderStatus status;
    private Client client;
    List<OrderItem> items = new ArrayList<>();

    public Order(LocalDate moment, OrderStatus status, Client client, List<OrderItem> items) {
        this.moment = moment;
        this.status = status;
        this.client = client;
        this.items = items;
    }
    public LocalDate getMoment() {
        return moment;
    }

    public void setMoment(LocalDate moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

}
