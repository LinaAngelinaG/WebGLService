package com.example.webglservice.repository;

import com.example.webglservice.model.VertexShader;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VertexShaderRepository extends CrudRepository<VertexShader, Integer> {
    @Override
    VertexShader save(VertexShader vertexShader);
    VertexShader getVertexShaderById(Integer id);
    List<VertexShader> findAll();
}
