package com.tweeter.app.controllers;

import com.tweeter.app.dtos.UserRegistrationDto;
import com.tweeter.app.services.UserRegService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
@Controller
public class RegisterUserController {

    private UserRegService userRegService;

    public RegisterUserController(UserRegService userRegService) {
        this.userRegService = userRegService;
    }

    @GetMapping("/registration_form")
    public String showRegistrationForm(Model model) {
        model.addAttribute("userRegistrationDto", new UserRegistrationDto());
        return "registration_form";
    }

    @PostMapping("/registration_form")
    public String registerUserForm(@ModelAttribute @Valid UserRegistrationDto userRegistrationDto, BindingResult result) {

        if (result.hasErrors()) {
            return "registration_form";
        } else {
            userRegService.saveUser(userRegistrationDto);
            return "index";
        }
    }
}
