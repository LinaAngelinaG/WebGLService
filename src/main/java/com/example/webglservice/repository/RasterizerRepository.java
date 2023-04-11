package com.example.webglservice.repository;

import com.example.webglservice.model.FrameBuffer;
import com.example.webglservice.model.Rasterizer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RasterizerRepository extends CrudRepository<Rasterizer, Integer> {
    @Override
    Rasterizer save(Rasterizer rasterizer);
    Rasterizer getRasterizerById(Integer id);
    List<Rasterizer> findAll();
}
