package com.example.webglservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Rasterizers")
public class Rasterizer {

    @Id
    private Integer id;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    //@JoinColumn(name = "profile_id", unique = true)
    @MapsId
    private Profile profile;
    private String aliasedLineWidthRange;
    private String aliasedPointSizeRange;

    public Rasterizer setProfile(Profile profile) {
        this.profile = profile;
        this.id = profile.getId();
        return this;
    }

    public Rasterizer(String aliasedLineWidthRange, String aliasedPointSizeRange) {
        this.aliasedLineWidthRange = aliasedLineWidthRange;
        this.aliasedPointSizeRange = aliasedPointSizeRange;
    }

    //    private Integer aliasedLineWidthRange1;
//    private Integer aliasedLineWidthRange2;
//    private Integer aliasedPointSizeRange1;
//    private Integer aliasedPointSizeRange2;

}
