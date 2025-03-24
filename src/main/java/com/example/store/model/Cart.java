package com.example.store.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Cart {
    private final List<Integer> items = new ArrayList<>();

    public void addItems(List<Integer> ids) {
        items.addAll(ids);
    }

    public List<Integer> getItems() {
        return new ArrayList<>(items);
    }
}