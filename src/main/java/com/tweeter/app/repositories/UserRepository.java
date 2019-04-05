package com.tweeter.app.repositories;

import com.tweeter.app.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


    User findByLogin(String login);

    User findByEmail(String email);

}
