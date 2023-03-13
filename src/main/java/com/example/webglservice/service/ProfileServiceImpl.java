package com.example.webglservice.service;

import com.example.webglservice.model.Profile;
import com.example.webglservice.model.ProfileDto;
import com.example.webglservice.repository.ProfileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProfileServiceImpl implements ProfileService{
    //@Autowired
    private final ProfileRepository repository;
    private Long id = 1l;
    @Override
    public ProfileDto createProfile(ProfileDto profileDto){
        Profile profile = getProfile(profileDto);
        profile.setId(id);
        ++id;
        Profile savedProfile = repository.save(profile);
        ProfileDto restoresProfileDto = getProfileDto(savedProfile);
        return restoresProfileDto;
    }

    @Override
    public ProfileDto getProfileById(Integer id) {
        Profile profile = repository.getProfileById(id);
        ProfileDto restoredProfile = getProfileDto(profile);
        return restoredProfile;
    }

    @Override
    public List<ProfileDto> getAllProfiles() {
        List<Profile> restoredProfiles = repository.findAll();
        List<ProfileDto> restoredProfilesDto = new ArrayList<>();
        for (Profile restoredProfile : restoredProfiles) {
            ProfileDto profileDto = getProfileDto(restoredProfile);
            restoredProfilesDto.add(profileDto);
        }
        return restoredProfilesDto;
    }

    private Profile getProfile(ProfileDto profileDto){
        return new Profile(profileDto.getNickName(),profileDto.getHash());
    }
    private ProfileDto getProfileDto(Profile savedProfile){
        return ProfileDto.builder()
                .hash(savedProfile.getHash())
                .nickName(savedProfile.getNickName())
                .build();
    }
}
