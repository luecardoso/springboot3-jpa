package com.luecardoso.ProjetoSpring.services;

import com.luecardoso.ProjetoSpring.entities.Order;
import com.luecardoso.ProjetoSpring.entities.User;
import com.luecardoso.ProjetoSpring.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
