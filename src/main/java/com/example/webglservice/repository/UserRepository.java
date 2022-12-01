package com.example.webglservice.repository;

import com.example.webglservice.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, String> {
    @Override
    <S extends User> S save(S entity);
}
