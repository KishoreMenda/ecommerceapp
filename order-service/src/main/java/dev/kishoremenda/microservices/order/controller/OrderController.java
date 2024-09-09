package dev.kishoremenda.microservices.order.controller;

import org.springframework.http.HttpStatus; // Add this import statement

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import dev.kishoremenda.microservices.order.dto.OrderRequest;
import dev.kishoremenda.microservices.order.service.OrderService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;


    //endpoint to place an order
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderRequest orderRequest) {
        System.out.println("This is for testing");
        orderService.placeOrder(orderRequest);
        return "Order placed successfully";
    }

}
