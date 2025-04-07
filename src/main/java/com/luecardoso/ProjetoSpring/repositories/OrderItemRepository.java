package com.luecardoso.ProjetoSpring.repositories;

import com.luecardoso.ProjetoSpring.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
