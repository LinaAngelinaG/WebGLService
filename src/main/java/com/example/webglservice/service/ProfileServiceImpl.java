package com.example.webglservice.service;

import com.example.webglservice.model.Profile;
import com.example.webglservice.model.ProfileDto;
import com.example.webglservice.repository.ProfilesRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProfileServiceImpl implements ProfileService{
    //@Autowired
    private final ProfilesRepository repository;
    @Getter
    private Integer id=1;
    @Override
    public ProfileDto createProfile(ProfileDto profileDto){
        Profile profile = getProfile(profileDto);
        Profile savedProfile = repository.save(profile);
        id = savedProfile.getId();
        ProfileDto restoresProfileDto = getProfileDto(savedProfile);
        return restoresProfileDto;
    }

    @Override
    public Profile createProfile(Profile profile) {
        Profile savedProfile = repository.save(profile);
        ProfileDto savedProfileDto = getProfileDto(savedProfile);
        id = savedProfile.getId();
        return savedProfile;
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
