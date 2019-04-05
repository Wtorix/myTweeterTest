package com.tweeter.app.controllers;

import com.tweeter.app.dtos.UserRegistrationDto;
import com.tweeter.app.models.User;
import com.tweeter.app.services.TweetService;
import com.tweeter.app.services.UserRegService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomePageController {

    private UserRegService userRegService;
    private TweetService tweetService;

    public HomePageController(UserRegService userRegService, TweetService tweetService) {
        this.userRegService = userRegService;
        this.tweetService = tweetService;
    }

    @GetMapping("/home")
    public String homePage(Model model) {
        model.addAttribute("userDto", new UserRegistrationDto());
        model.addAttribute("allTweets", tweetService.findAllOrderByCreatedDesc());
        return "index";
    }


    @PostMapping("/home")
    public String loginForm(HttpServletRequest request, Model model) {
        User user = userRegService.findByLogIn(request.getParameter("loginParam"));
        if (user != null) {
            model.addAttribute("user", userRegService.findByLogIn(request.getParameter("loginParam")));
            return "logged_in";
        } else {
            return "index";
        }
    }



}
