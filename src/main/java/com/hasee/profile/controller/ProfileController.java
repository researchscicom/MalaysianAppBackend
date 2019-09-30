package com.hasee.profile.controller;

import com.hasee.profile.exception.ResourceNotFoundException;
import com.hasee.profile.model.Profile;
import com.hasee.profile.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api")
@CrossOrigin("*")
public class ProfileController {
    @Autowired
    ProfileRepository profileRepository;

    @GetMapping("/profile")
    public List<Profile> getProfiles()
    {
        return this.profileRepository.findAll();
    }

    @PostMapping("/profile")
    public String saveProfile(@RequestBody Profile profile)
    {
        profileRepository.save(profile);
        return profile.getNickname();
    }
    @PutMapping("/profile/{id}")
    public Profile editProfile(@PathVariable(name = "id") long id,@RequestBody Profile profile)
    {
        Profile profile1 = profileRepository.findById(id) .orElseThrow(() ->new ResourceNotFoundException("id","id",id));
        profile1.setCountry(profile.getCountry());
        profile1.setDob(profile.getDob());
        profile1.setExpiryDate(profile.getExpiryDate());
        profile1.setGender(profile.getGender());
        profile1.setGivenName(profile.getGivenName());
        profile1.setIdentificationNo(profile.getIdentificationNo());
        profile1.setIsMalaysian(profile.getIsMalaysian());
        profile1.setNickname(profile.getNickname());
        profile1.setNationality(profile.getNationality());
        profile1.setSurname(profile.getSurname());
        profile1.setTravelDocNum(profile.getTravelDocNum());
        return profileRepository.save(profile1);
    }
    @DeleteMapping("profile/{id}")
    public long deleteProfile(@PathVariable(name = "id") long id) throws Exception {
        Profile profile = profileRepository.findById(id) .orElseThrow(() ->new ResourceNotFoundException("id","id",id));
        profileRepository.delete(profile);
        return id;
    }
}
