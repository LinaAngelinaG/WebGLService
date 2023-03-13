package com.example.webglservice.repository;

import com.example.webglservice.model.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfileRepository extends CrudRepository<Profile, Integer> {
    @Override
    Profile save(Profile profile);
    List<Profile> getUserByNickName(String name);
    Profile getProfileById(Integer id);
    boolean existsUsersByHashAndNickName(String hash, String nickname);
    List<Profile> findAll();
}
