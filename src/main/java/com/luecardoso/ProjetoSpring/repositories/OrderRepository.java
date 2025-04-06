package com.luecardoso.ProjetoSpring.repositories;

import com.luecardoso.ProjetoSpring.entities.Order;
import com.luecardoso.ProjetoSpring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
