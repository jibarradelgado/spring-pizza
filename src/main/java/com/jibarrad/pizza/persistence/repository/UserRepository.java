package com.jibarrad.pizza.persistence.repository;

import com.jibarrad.pizza.persistence.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, String> {
}
