package com.example.webglservice.service;

import com.example.webglservice.model.DataPackage;
import com.example.webglservice.model.FragmentShader;
import com.example.webglservice.repository.DataPackageRepository;
import com.example.webglservice.repository.FragmentShadersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DataPackageService {
    private final DataPackageRepository repository;

    public DataPackage createData(DataPackage dataPackage){
        DataPackage savesDataPackage = repository.save(dataPackage);
        return savesDataPackage;
    }

    public DataPackage getDataPackageById(Integer id) {
        DataPackage dataPackage = repository.getDataPackageById(id);
        return dataPackage;
    }

    public List<DataPackage> getAllDataPackages() {
        List<DataPackage> restoredDataPackages = repository.findAll();
        return restoredDataPackages;
    }
}
