package com.example.coffee_shop_microservice.repository;

import com.example.coffee_shop_microservice.model.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeRepository extends JpaRepository<Coffee, Long> {
}
