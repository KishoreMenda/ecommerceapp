package com.kishoremenda.microservices.product.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kishoremenda.microservices.product.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
