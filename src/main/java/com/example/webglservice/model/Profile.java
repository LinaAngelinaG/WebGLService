package com.example.webglservice.model;

import jakarta.persistence.*;
import lombok.*;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="profiles")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nick_name", nullable = false)
    private String nickName;

    @Column(name = "hash", nullable = false)
    private String hash;

//    @JoinColumn(name="fragment_shader_id", referencedColumnName = "id")
//    @OneToOne
//    @JoinColumn(name = "fragment_shader_id")
//    private FragmentShader fragmentShader = null;

    public Profile(String nickName, String hash){
        this.nickName = nickName;
        this.hash = hash;
    }



//    @Column(name = "atr1", nullable = false)
//    private String atr1;
}
