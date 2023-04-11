package com.example.webglservice.service;

import com.example.webglservice.model.FragmentShader;
import com.example.webglservice.repository.FragmentShadersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FragmentShaderService{
    //@Autowired
    private final FragmentShadersRepository repository;

    public FragmentShader createProfile(FragmentShader fragmentShader){
        FragmentShader savedFragmentShader = repository.save(fragmentShader);
        return fragmentShader;
    }

    public FragmentShader getProfileById(Integer id) {
        FragmentShader fragmentShader = repository.getFragmentShaderById(id);
        return fragmentShader;
    }

    public List<FragmentShader> getAllProfiles() {
        List<FragmentShader> restoredFragmentShaders = repository.findAll();
        return restoredFragmentShaders;
    }

}