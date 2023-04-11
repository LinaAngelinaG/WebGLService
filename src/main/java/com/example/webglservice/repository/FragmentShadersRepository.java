package com.example.webglservice.repository;

import com.example.webglservice.model.FragmentShader;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FragmentShadersRepository extends CrudRepository<FragmentShader, Integer> {
    @Override
    FragmentShader save(FragmentShader fragmentShader);
    FragmentShader getFragmentShaderById(Integer id);
    List<FragmentShader> findAll();
}
