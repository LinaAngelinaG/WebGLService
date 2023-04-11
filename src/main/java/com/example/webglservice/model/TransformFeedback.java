package com.example.webglservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="TransformFeedbacks")
public class TransformFeedback {
    @Id
    private Integer id;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    //@JoinColumn(name = "profile_id", unique = true)
    @MapsId
    private Profile profile;

    public TransformFeedback setProfile(Profile profile) {
        this.profile = profile;
        this.id = profile.getId();
        return this;
    }

    public TransformFeedback(Integer maxInterleavedComponents, Integer maxSeparateAttribs, Integer maxSeparateComponents) {
        this.maxInterleavedComponents = maxInterleavedComponents;
        this.maxSeparateAttribs = maxSeparateAttribs;
        this.maxSeparateComponents = maxSeparateComponents;
    }

    private Integer maxInterleavedComponents;
    private Integer maxSeparateAttribs;
    private Integer maxSeparateComponents;
}
