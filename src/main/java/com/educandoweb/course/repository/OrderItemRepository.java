package com.educandoweb.course.repository;

import com.educandoweb.course.entites.Order;
import com.educandoweb.course.entites.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
