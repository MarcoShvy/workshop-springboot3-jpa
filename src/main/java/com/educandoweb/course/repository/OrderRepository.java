package com.educandoweb.course.repository;

import com.educandoweb.course.entites.Order;
import com.educandoweb.course.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
