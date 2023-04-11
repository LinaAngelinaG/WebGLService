package com.example.webglservice.repository;

import com.example.webglservice.model.Texture;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TextureRepository extends CrudRepository<Texture, Integer> {
    @Override
    Texture save(Texture texture);
    Texture getTextureById(Integer id);
    List<Texture> findAll();
}
