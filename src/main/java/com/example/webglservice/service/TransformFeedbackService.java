package com.example.webglservice.service;

import com.example.webglservice.model.TransformFeedback;
import com.example.webglservice.repository.TextureRepository;
import com.example.webglservice.repository.TransformFeedbackRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TransformFeedbackService {
    private final TransformFeedbackRepository repository;

    public TransformFeedback createTransformFeedback(TransformFeedback transformFeedback){
        TransformFeedback savedTransformFeedback = repository.save(transformFeedback);
        return savedTransformFeedback;
    }

    public TransformFeedback getTransformFeedbackById(Integer id) {
        TransformFeedback texture = repository.getTransformFeedbackById(id);
        return texture;
    }

    public List<TransformFeedback> getAllTransformFeedbacks() {
        List<TransformFeedback> restoredTransformFeedbacks = repository.findAll();
        return restoredTransformFeedbacks;
    }
}
