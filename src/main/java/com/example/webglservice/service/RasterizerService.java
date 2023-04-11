package com.example.webglservice.service;

import com.example.webglservice.model.FrameBuffer;
import com.example.webglservice.model.Rasterizer;
import com.example.webglservice.repository.FrameBufferRepository;
import com.example.webglservice.repository.RasterizerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RasterizerService {
    private final RasterizerRepository repository;

    public Rasterizer createRasterizer(Rasterizer rasterizer){
        Rasterizer savedRasterizer = repository.save(rasterizer);
        return savedRasterizer;
    }

    public Rasterizer getRasterizerById(Integer id) {
        Rasterizer rasterizer = repository.getRasterizerById(id);
        return rasterizer;
    }

    public List<Rasterizer> getAllRasterizers() {
        List<Rasterizer> restoredRasterizers = repository.findAll();
        return restoredRasterizers;
    }
}
