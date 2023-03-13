package com.example.webglservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
public class ProfileDto implements Serializable {

    private final String nickName;
    private final String hash;
}
