package com.educandoweb.course.repository;

import com.educandoweb.course.entites.Product;
import com.educandoweb.course.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
