package com.example.webglservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="VertexShaders")
public class VertexShader {
    @Id
    private Integer id;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    //@JoinColumn(name = "profile_id", unique = true)
    @MapsId
    private Profile profile;

    private Integer maxVertexAttributes;
    private Integer maxVertexUniformVectors;
    private Integer maxVertexTextureImageUnits;
    private Integer maxVaryingVectors;
    private Integer maxVertexUniformComponents;
    private Integer maxVertexUniformBlocks;
    private Integer maxVertexOutputComponents;
    private Integer maxVaryingComponents;

    public VertexShader setProfile(Profile profile) {
        this.profile = profile;
        this.id = profile.getId();
        return this;
    }

    public VertexShader(Integer maxVertexAttributes, Integer maxVertexUniformVectors, Integer maxVertexTextureImageUnits, Integer maxVaryingVectors, Integer maxVertexUniformComponents, Integer maxVertexUniformBlocks, Integer maxVertexOutputComponents, Integer maxVaryingComponents) {
        this.maxVertexAttributes = maxVertexAttributes;
        this.maxVertexUniformVectors = maxVertexUniformVectors;
        this.maxVertexTextureImageUnits = maxVertexTextureImageUnits;
        this.maxVaryingVectors = maxVaryingVectors;
        this.maxVertexUniformComponents = maxVertexUniformComponents;
        this.maxVertexUniformBlocks = maxVertexUniformBlocks;
        this.maxVertexOutputComponents = maxVertexOutputComponents;
        this.maxVaryingComponents = maxVaryingComponents;
    }
}
