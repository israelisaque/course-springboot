package com.coursespring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursespring.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
