package com.example.webglservice.service;

import com.example.webglservice.model.Profile;
import com.example.webglservice.model.ProfileDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProfileService {
    ProfileDto createProfile(ProfileDto profileDto);
    Profile createProfile(Profile profile);
    ProfileDto getProfileById(Integer id);
    List<ProfileDto> getAllProfiles();
}
