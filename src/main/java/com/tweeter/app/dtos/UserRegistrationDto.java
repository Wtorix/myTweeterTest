package com.tweeter.app.dtos;

import lombok.Data;
import lombok.Setter;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;


@Data
@Component
public class UserRegistrationDto {
    @Setter
    long id;
    @NotBlank(message = "Login is required!")
    String login;

    @NotBlank(message = "First name is required!")
    String firstName;

    @NotBlank(message = "Last name is required!")
    @Setter
    String lastName;

    @NotBlank
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{6,}$",message = "Wrong password pattern!")
    String password;

    @NotBlank
    @Setter
    String repeatPassword;

    @NotBlank(message = "Email is required!")
    @Email(message = "Wrong email pattern")
    String email;

    public UserRegistrationDto setPassword(String password) {
        this.password = BCrypt.hashpw(password, BCrypt.gensalt(12));
        return this;
    }

    public UserRegistrationDto setRepeatPassword(String repeatPassword) {
        this.repeatPassword = BCrypt.hashpw(repeatPassword, BCrypt.gensalt(12));
        return this;
    }

}
