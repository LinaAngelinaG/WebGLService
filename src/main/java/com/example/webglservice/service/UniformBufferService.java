package com.example.webglservice.service;

import com.example.webglservice.model.UniformBuffer;
import com.example.webglservice.repository.TextureRepository;
import com.example.webglservice.repository.UniformBufferRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UniformBufferService {
    private final UniformBufferRepository repository;

    public UniformBuffer createRUniformBuffer(UniformBuffer uniformBuffer){
        UniformBuffer savedUniformBuffer = repository.save(uniformBuffer);
        return savedUniformBuffer;
    }

    public UniformBuffer getUniformBufferById(Integer id) {
        UniformBuffer uniformBuffer = repository.getUniformBufferById(id);
        return uniformBuffer;
    }

    public List<UniformBuffer> getAllUniformBuffers() {
        List<UniformBuffer> restoredUniformBuffers = repository.findAll();
        return restoredUniformBuffers;
    }
}
