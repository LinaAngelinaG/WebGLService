package com.example.webglservice.service;

import com.example.webglservice.model.FrameBuffer;
import com.example.webglservice.repository.FrameBufferRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FrameBufferService {
    private final FrameBufferRepository repository;

    public FrameBuffer createFrameBuffer(FrameBuffer frameBuffer){
        FrameBuffer savedFrameBuffer = repository.save(frameBuffer);
        return frameBuffer;
    }

    public FrameBuffer getFrameBufferById(Integer id) {
        FrameBuffer frameBuffer = repository.getFrameBufferById(id);
        return frameBuffer;
    }

    public List<FrameBuffer> getAllProfiles() {
        List<FrameBuffer> restoredFrameBuffers = repository.findAll();
        return restoredFrameBuffers;
    }
}
