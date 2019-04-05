package com.tweeter.app.services;

import com.tweeter.app.dtos.UserRegistrationDto;
import com.tweeter.app.models.Tweet;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TweetService {

    List<Tweet> findAllByUser (UserRegistrationDto userRegistrationDto);
    List<Tweet> findAllByUserId(Long userId);
    List<Tweet> findAllOrderByCreatedDesc();
}
