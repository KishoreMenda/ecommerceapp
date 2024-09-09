package dev.kishoremenda.microservices.order.dto;

import java.math.BigDecimal;

public record OrderRequest(Long id, String orderNumer, String skuCode, BigDecimal price, Integer quantity,UserDetails userDetails) {
    public record UserDetails(String email, String firstName, String lastName) {}
}
