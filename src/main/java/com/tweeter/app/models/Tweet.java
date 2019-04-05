package com.tweeter.app.models;

import lombok.Data;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Entity
@Table(name = "tweets")
@Data
public class Tweet {

    @Id
    @GeneratedValue
    private long id;

    @NotBlank
    @ManyToOne
    private User user;

    @NotBlank
    private String text;

    @NotBlank
    @Setter
    private LocalDateTime created;

    public Tweet(@NotBlank User user, @NotBlank String text) {
        this.user = user;
        this.text = text;
        this.created = LocalDateTime.now();
    }
}
