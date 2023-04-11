package com.example.webglservice.repository;

import com.example.webglservice.model.DataPackage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DataPackageRepository extends CrudRepository<DataPackage, Integer> {
    @Override
    DataPackage save(DataPackage dataPackage);

    DataPackage getDataPackageById(Integer id);

    List<DataPackage> findAll();
}
