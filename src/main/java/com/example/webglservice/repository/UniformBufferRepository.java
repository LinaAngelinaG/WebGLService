package com.example.webglservice.repository;

import com.example.webglservice.model.UniformBuffer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UniformBufferRepository extends CrudRepository<UniformBuffer, Integer> {
    @Override
    UniformBuffer save(UniformBuffer uniformBuffer);
    UniformBuffer getUniformBufferById(Integer id);
    List<UniformBuffer> findAll();
}
