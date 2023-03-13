package com.example.webglservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Table(name="profile")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nick", nullable = false)
    private String nickName;

    @Column(name = "hash", nullable = false)
    private String hash;

    public Profile(String nickName, String hash){
        this.nickName = nickName;
        this.hash = hash;
    }

//    @Column(name = "atr1", nullable = false)
//    private String atr1;
}
