package dev.kishoremenda.microservices.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.kishoremenda.microservices.order.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
