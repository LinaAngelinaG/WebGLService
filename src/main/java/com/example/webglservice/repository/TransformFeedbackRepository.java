package com.example.webglservice.repository;

import com.example.webglservice.model.TransformFeedback;
import com.example.webglservice.model.TransformFeedback;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransformFeedbackRepository extends CrudRepository<TransformFeedback, Integer> {
    @Override
    TransformFeedback save(TransformFeedback transformFeedback);
    TransformFeedback getTransformFeedbackById(Integer id);
    List<TransformFeedback> findAll();
}
