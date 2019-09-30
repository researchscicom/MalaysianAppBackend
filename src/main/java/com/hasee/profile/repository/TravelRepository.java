package com.hasee.profile.repository;

import com.hasee.profile.exception.ResourceNotFoundException;
import com.hasee.profile.model.Travel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelRepository extends JpaRepository<Travel , Long> {
    Travel findByNickname(String nickname) throws Exception;
}
