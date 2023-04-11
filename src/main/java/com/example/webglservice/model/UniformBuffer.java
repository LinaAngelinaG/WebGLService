package com.example.webglservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="UniformBuffers")
public class UniformBuffer {
    @Id
    private Integer id;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    //@JoinColumn(name = "profile_id", unique = true)
    @MapsId
    private Profile profile;

    private Integer maxUniformBufferBindings;
    private Integer maxUniformBlockSize;
    private Integer uniformBufferOffsetAlignment;
    private Integer maxCombinedUniformBlocks;
    private Integer maxCombinedVertexUniformComponents;
    private Integer maxCombinedFragmentUniformComponents;

    public UniformBuffer setProfile(Profile profile) {
        this.profile = profile;
        this.id = profile.getId();
        return this;
    }

    public UniformBuffer(Integer maxUniformBufferBindings, Integer maxUniformBlockSize, Integer uniformBufferOffsetAlignment, Integer maxCombinedUniformBlocks, Integer maxCombinedVertexUniformComponents, Integer maxCombinedFragmentUniformComponents) {
        this.maxUniformBufferBindings = maxUniformBufferBindings;
        this.maxUniformBlockSize = maxUniformBlockSize;
        this.uniformBufferOffsetAlignment = uniformBufferOffsetAlignment;
        this.maxCombinedUniformBlocks = maxCombinedUniformBlocks;
        this.maxCombinedVertexUniformComponents = maxCombinedVertexUniformComponents;
        this.maxCombinedFragmentUniformComponents = maxCombinedFragmentUniformComponents;
    }
}
