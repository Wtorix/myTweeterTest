package com.tweeter.app.repositories;

import com.tweeter.app.dtos.UserRegistrationDto;
import com.tweeter.app.models.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TweetRepository extends JpaRepository<Tweet, Long> {

    List<Tweet> findAllByUser(UserRegistrationDto userRegistrationDto);

    List<Tweet> findAllByUserId(Long userId);

    List<Tweet> findAllByOrderByCreatedDesc();

}
