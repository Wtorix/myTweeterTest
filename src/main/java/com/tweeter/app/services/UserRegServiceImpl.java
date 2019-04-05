package com.tweeter.app.services;

import com.tweeter.app.dtos.UserRegistrationDto;
import com.tweeter.app.models.User;
import com.tweeter.app.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegServiceImpl implements UserRegService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User saveUser(UserRegistrationDto userRegistrationDto) {
        User user = new User(userRegistrationDto.getLogin(), userRegistrationDto.getFirstName(), userRegistrationDto.getLastName()
                , userRegistrationDto.getPassword(), userRegistrationDto.getEmail());
        userRepository.save(user);
        return user;
    }

    @Override
    public User findByLogIn(String login) {
        User user = userRepository.findByLogin(login);
        return user;
    }
}
