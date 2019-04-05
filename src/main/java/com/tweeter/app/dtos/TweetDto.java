package com.tweeter.app.dtos;

import com.tweeter.app.models.User;
import lombok.Data;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Data
public class TweetDto {
    private long id;

    @NotBlank
    private User user;

    @NotBlank
    private String text;

    @NotBlank
    @Setter
    private LocalDateTime created;

    public TweetDto(@NotBlank User user, @NotBlank String text) {
        this.user = user;
        this.text = text;
        this.created = LocalDateTime.now();
    }

    public TweetDto setCreated(LocalDateTime created) {
        this.created = LocalDateTime.now();
        return this;
    }
}
