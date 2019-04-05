package com.tweeter.app.services;

import com.tweeter.app.dtos.UserRegistrationDto;
import com.tweeter.app.models.Tweet;
import com.tweeter.app.repositories.TweetRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TweetServiceImpl implements TweetService {

    private TweetRepository tweetRepository;

    public TweetServiceImpl(TweetRepository tweetRepository) {
        this.tweetRepository = tweetRepository;
    }

    @Override
    public List<Tweet> findAllByUser(UserRegistrationDto userRegistrationDto) {
        List<Tweet> allTweetsByUser = tweetRepository.findAllByUser(userRegistrationDto);
        return allTweetsByUser;
    }

    @Override
    public List<Tweet> findAllByUserId(Long userId) {
        List<Tweet> allTweetsByUserId = tweetRepository.findAllByUserId(userId);
        return allTweetsByUserId;
    }

    @Override
    public List<Tweet> findAllOrderByCreatedDesc() {
        List<Tweet> allTweetsOrderByCreated = tweetRepository.findAllByOrderByCreatedDesc();
        return allTweetsOrderByCreated;
    }
}
