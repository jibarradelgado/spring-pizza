package com.jibarrad.pizza.persistence.repository;

import com.jibarrad.pizza.persistence.entity.OrderEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface OrderRepository extends ListCrudRepository<OrderEntity, Integer> {
}
