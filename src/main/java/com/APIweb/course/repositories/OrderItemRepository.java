package com.APIweb.course.repositories;

import com.APIweb.course.entities.Order;
import com.APIweb.course.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {

}
