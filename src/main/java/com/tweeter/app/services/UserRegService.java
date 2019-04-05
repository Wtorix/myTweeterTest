package com.tweeter.app.services;

import com.tweeter.app.dtos.UserRegistrationDto;
import com.tweeter.app.models.User;
import org.springframework.stereotype.Service;

@Service
public interface UserRegService {
    User saveUser(UserRegistrationDto userRegistrationDto);

    User findByLogIn(String login);
}
