package com.example.webglservice.model;

import jakarta.persistence.*;
import lombok.*;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Table(name="FragmentShaders")
public class FragmentShader {
    @Id
    private Integer id;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @MapsId
    private Profile profile;

    private Integer maxFragmentUniformVectors;
    private Integer maxTextureImageUnits;
    private String precisions;
//    private Integer bestFloatPrecision;
    private Integer maxFragmentUniformComponents;
    private Integer maxFragmentUniformBlocks;
    private Integer maxFragmentInputComponents;
    private Integer minProgramTexelOffset;
    private Integer maxProgramTexelOffset;

}
