package com.example.webglservice.service;

import com.example.webglservice.model.Texture;
import com.example.webglservice.repository.RasterizerRepository;
import com.example.webglservice.repository.TextureRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TextureService {
    private final TextureRepository repository;

    public Texture createTexture(Texture texture){
        Texture savedTexture = repository.save(texture);
        return savedTexture;
    }

    public Texture getTextureById(Integer id) {
        Texture texture = repository.getTextureById(id);
        return texture;
    }

    public List<Texture> getAllTextures() {
        List<Texture> restoredTextures = repository.findAll();
        return restoredTextures;
    }
}
