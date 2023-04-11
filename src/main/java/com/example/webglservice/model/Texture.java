package com.example.webglservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Textures")
public class Texture {
    @Id
    private Integer id;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    //@JoinColumn(name = "profile_id", unique = true)
    @MapsId
    private Profile profile;

    private Integer maxTextureSize;
    private Integer maxCubeMapTextureSize;
    private Integer maxCombinedTextureImageUnits;
    private Integer maxAnisotropy;
    private Integer max3DTextureSize;
    private Integer maxArrayTextureLayers;
    private Integer maxTextureLODBias;

    public Texture setProfile(Profile profile) {
        this.profile = profile;
        this.id = profile.getId();
        return this;
    }

    public Texture(Integer maxTextureSize, Integer maxCubeMapTextureSize, Integer maxCombinedTextureImageUnits, Integer maxAnisotropy, Integer max3DTextureSize, Integer maxArrayTextureLayers, Integer maxTextureLODBias) {
        this.maxTextureSize = maxTextureSize;
        this.maxCubeMapTextureSize = maxCubeMapTextureSize;
        this.maxCombinedTextureImageUnits = maxCombinedTextureImageUnits;
        this.maxAnisotropy = maxAnisotropy;
        this.max3DTextureSize = max3DTextureSize;
        this.maxArrayTextureLayers = maxArrayTextureLayers;
        this.maxTextureLODBias = maxTextureLODBias;
    }
}
