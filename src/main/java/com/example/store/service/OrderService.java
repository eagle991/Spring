package com.example.store.service;

import com.example.store.model.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final Cart cart;

    @Autowired
    public OrderService(Cart cart) {
        this.cart = cart;
    }

    public void addItems(List<Integer> ids) {
        cart.addItems(ids);
    }

    public List<Integer> getItems() {
        return cart.getItems();
    }
}