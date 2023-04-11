package com.example.webglservice.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Table(name="frame_buffers")
public class FrameBuffer {
    @Id
    private Integer id;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    //@JoinColumn(name = "profile_id", unique = true)
    @MapsId
    private Profile profile;

    private Integer maxDrawBuffers;
    private Integer maxColorAttachments;
    private Integer maxSamples;
    private Integer RBits;
    private Integer GBits;
    private Integer BBits;
    private Integer ABits;
    private Integer DepthBits;
    private Integer StencilBits;
    private Integer maxRenderBufferSize;
    private String maxViewportDimensions;
//    private Integer maxViewportDimensions2;

    public FrameBuffer setProfile(Profile profile) {
        this.profile = profile;
        this.id = profile.getId();
        return this;
    }

    public FrameBuffer(Integer maxDrawBuffers, Integer maxColorAttachments, Integer maxSamples, Integer RBits, Integer GBits, Integer BBits, Integer ABits, Integer depthBits, Integer stencilBits, Integer maxRenderBufferSize, String maxViewportDimensions) {
        this.maxDrawBuffers = maxDrawBuffers;
        this.maxColorAttachments = maxColorAttachments;
        this.maxSamples = maxSamples;
        this.RBits = RBits;
        this.GBits = GBits;
        this.BBits = BBits;
        this.ABits = ABits;
        DepthBits = depthBits;
        StencilBits = stencilBits;
        this.maxRenderBufferSize = maxRenderBufferSize;
        this.maxViewportDimensions = maxViewportDimensions;
    }
}
