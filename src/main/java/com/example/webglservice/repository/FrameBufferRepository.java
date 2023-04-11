package com.example.webglservice.repository;

import com.example.webglservice.model.FrameBuffer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FrameBufferRepository extends CrudRepository<FrameBuffer, Integer> {
    @Override
    FrameBuffer save(FrameBuffer frameBuffer);
    FrameBuffer getFrameBufferById(Integer id);
    List<FrameBuffer> findAll();
}
