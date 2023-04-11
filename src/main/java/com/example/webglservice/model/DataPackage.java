package com.example.webglservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="dataAll")
public class DataPackage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nickName;
    private String hash;


    private Integer maxFragmentUniformVectors;
    private Integer maxTextureImageUnits;
    private String precisions;
//    private Integer bestFloatPrecision;
    private Integer maxFragmentUniformComponents;
    private Integer maxFragmentUniformBlocks;
    private Integer maxFragmentInputComponents;
    private Integer minProgramTexelOffset;
    private Integer maxProgramTexelOffset;

    private Integer maxDrawBuffers;
    private Integer maxColorAttachments;
    private Integer maxSamples;
    private Integer RBits;
    private Integer GBits;
    private Integer BBits;
    private Integer ABits;
    private Integer depthBits;
    private Integer stencilBits;
    private Integer maxRenderBufferSize;
    private String maxViewportDimensions;
    private String aliasedLineWidthRange;
    private String aliasedPointSizeRange;
    private Integer maxTextureSize;
    private Integer maxCubeMapTextureSize;
    private Integer maxCombinedTextureImageUnits;
    private Integer maxAnisotropy;
    private Integer max3DTextureSize;
    private Integer maxArrayTextureLayers;
    private Integer maxTextureLODBias;

    private Integer maxInterleavedComponents;
    private Integer maxSeparateAttribs;
    private Integer maxSeparateComponents;

    private Integer maxUniformBufferBindings;
    private Integer maxUniformBlockSize;
    private Integer uniformBufferOffsetAlignment;
    private Integer maxCombinedUniformBlocks;
    private Integer maxCombinedVertexUniformComponents;
    private Integer maxCombinedFragmentUniformComponents;

    private Integer maxVertexAttributes;
    private Integer maxVertexUniformVectors;
    private Integer maxVertexTextureImageUnits;
    private Integer maxVaryingVectors;
    private Integer maxVertexUniformComponents;
    private Integer maxVertexUniformBlocks;
    private Integer maxVertexOutputComponents;
    private Integer maxVaryingComponents;

    public DataPackage(String nickName, String hash, Integer maxFragmentUniformVectors, Integer maxTextureImageUnits, String precisions, Integer maxFragmentUniformComponents, Integer maxFragmentUniformBlocks, Integer maxFragmentInputComponents, Integer minProgramTexelOffset, Integer maxProgramTexelOffset, Integer maxDrawBuffers, Integer maxColorAttachments, Integer maxSamples, Integer RBits, Integer GBits, Integer BBits, Integer ABits, Integer depthBits, Integer stencilBits, Integer maxRenderBufferSize, String maxViewportDimensions, String aliasedLineWidthRange, String aliasedPointSizeRange, Integer maxTextureSize, Integer maxCubeMapTextureSize, Integer maxCombinedTextureImageUnits, Integer maxAnisotropy, Integer max3DTextureSize, Integer maxArrayTextureLayers, Integer maxTextureLODBias, Integer maxInterleavedComponents, Integer maxSeparateAttribs, Integer maxSeparateComponents, Integer maxUniformBufferBindings, Integer maxUniformBlockSize, Integer uniformBufferOffsetAlignment, Integer maxCombinedUniformBlocks, Integer maxCombinedVertexUniformComponents, Integer maxCombinedFragmentUniformComponents, Integer maxVertexAttributes, Integer maxVertexUniformVectors, Integer maxVertexTextureImageUnits, Integer maxVaryingVectors, Integer maxVertexUniformComponents, Integer maxVertexUniformBlocks, Integer maxVertexOutputComponents, Integer maxVaryingComponents) {
        this.nickName = nickName;
        this.hash = hash;
        this.maxFragmentUniformVectors = maxFragmentUniformVectors;
        this.maxTextureImageUnits = maxTextureImageUnits;
        this.precisions = precisions;
        this.maxFragmentUniformComponents = maxFragmentUniformComponents;
        this.maxFragmentUniformBlocks = maxFragmentUniformBlocks;
        this.maxFragmentInputComponents = maxFragmentInputComponents;
        this.minProgramTexelOffset = minProgramTexelOffset;
        this.maxProgramTexelOffset = maxProgramTexelOffset;
        this.maxDrawBuffers = maxDrawBuffers;
        this.maxColorAttachments = maxColorAttachments;
        this.maxSamples = maxSamples;
        this.RBits = RBits;
        this.GBits = GBits;
        this.BBits = BBits;
        this.ABits = ABits;
        this.depthBits = depthBits;
        this.stencilBits = stencilBits;
        this.maxRenderBufferSize = maxRenderBufferSize;
        this.maxViewportDimensions = maxViewportDimensions;
        this.aliasedLineWidthRange = aliasedLineWidthRange;
        this.aliasedPointSizeRange = aliasedPointSizeRange;
        this.maxTextureSize = maxTextureSize;
        this.maxCubeMapTextureSize = maxCubeMapTextureSize;
        this.maxCombinedTextureImageUnits = maxCombinedTextureImageUnits;
        this.maxAnisotropy = maxAnisotropy;
        this.max3DTextureSize = max3DTextureSize;
        this.maxArrayTextureLayers = maxArrayTextureLayers;
        this.maxTextureLODBias = maxTextureLODBias;
        this.maxInterleavedComponents = maxInterleavedComponents;
        this.maxSeparateAttribs = maxSeparateAttribs;
        this.maxSeparateComponents = maxSeparateComponents;
        this.maxUniformBufferBindings = maxUniformBufferBindings;
        this.maxUniformBlockSize = maxUniformBlockSize;
        this.uniformBufferOffsetAlignment = uniformBufferOffsetAlignment;
        this.maxCombinedUniformBlocks = maxCombinedUniformBlocks;
        this.maxCombinedVertexUniformComponents = maxCombinedVertexUniformComponents;
        this.maxCombinedFragmentUniformComponents = maxCombinedFragmentUniformComponents;
        this.maxVertexAttributes = maxVertexAttributes;
        this.maxVertexUniformVectors = maxVertexUniformVectors;
        this.maxVertexTextureImageUnits = maxVertexTextureImageUnits;
        this.maxVaryingVectors = maxVaryingVectors;
        this.maxVertexUniformComponents = maxVertexUniformComponents;
        this.maxVertexUniformBlocks = maxVertexUniformBlocks;
        this.maxVertexOutputComponents = maxVertexOutputComponents;
        this.maxVaryingComponents = maxVaryingComponents;
    }

    public Profile generateProfile(){
       return new Profile(id,nickName,hash);
    }

    public FragmentShader buildFragmentShader(){
        Profile profile = new Profile(id,nickName,hash);
        return new FragmentShader(
                id,
                profile,
                maxFragmentUniformVectors,
                maxTextureImageUnits,
                precisions,
                maxFragmentUniformComponents,
                maxFragmentUniformBlocks,
                maxFragmentInputComponents,
                minProgramTexelOffset,
                maxProgramTexelOffset);
    }

    public FrameBuffer buildFrameBuffer(){
        return new FrameBuffer(
                maxDrawBuffers,
                maxColorAttachments,
                maxSamples,
                RBits,
                GBits,
                BBits,
                ABits,
                depthBits,
                stencilBits,
                maxRenderBufferSize,
                maxViewportDimensions);
    }

    public Rasterizer buildRasterizer(){
        return new Rasterizer(
                aliasedLineWidthRange,
                aliasedPointSizeRange);
    }

    public TransformFeedback buildTransformFeedback(){
        return new TransformFeedback(
                maxInterleavedComponents,
                maxSeparateAttribs,
                maxSeparateComponents);
    }

    public Texture buildTexture(){
        return new Texture(
                maxTextureSize,
                maxCubeMapTextureSize,
                maxCombinedTextureImageUnits,
                maxAnisotropy,
                max3DTextureSize,
                maxArrayTextureLayers,
                maxTextureLODBias);
    }

    public UniformBuffer buildUniformBuffer(){
        return new UniformBuffer(
                maxUniformBufferBindings,
                maxUniformBlockSize,
                uniformBufferOffsetAlignment,
                maxCombinedUniformBlocks,
                maxCombinedVertexUniformComponents,
                maxCombinedFragmentUniformComponents
        );
    }

    public VertexShader buildVertexShader(){
        return new VertexShader(
                maxVertexAttributes,
                maxVertexUniformVectors,
                maxVertexTextureImageUnits,
                maxVaryingVectors,
                maxVertexUniformComponents,
                maxVertexUniformBlocks,
                maxVertexOutputComponents,
                maxVaryingComponents
        );
    }
}
