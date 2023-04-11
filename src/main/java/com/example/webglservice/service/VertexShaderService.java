package com.example.webglservice.service;

import com.example.webglservice.model.VertexShader;
import com.example.webglservice.repository.VertexShaderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VertexShaderService {
    private final VertexShaderRepository repository;

    public VertexShader createVertexShader(VertexShader vertexShader){
        VertexShader savedVertexShader = repository.save(vertexShader);
        return savedVertexShader;
    }

    public VertexShader getVertexShaderById(Integer id) {
        VertexShader texture = repository.getVertexShaderById(id);
        return texture;
    }

    public List<VertexShader> getAllVertexShaders() {
        List<VertexShader> restoredVertexShaders = repository.findAll();
        return restoredVertexShaders;
    }
}
