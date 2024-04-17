package com.example.gameresearch.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EntityGameResearch {

    private Long id;
    private String slug;
    private String name;
    private Integer metacritic;
    private String released;
    private Boolean tba;
    private String updated;
    private String website;
    private Double rating;
    private Integer ratingTop;
    private Integer playtime;
    private Integer achievementsCount;
    private Integer ratingsCount;
    private Integer suggestionsCount;
    private Integer gameSeriesCount;
    private Integer reviewsCount;
    private String platforms;
    private String developers;
    private String genres;
    private String publishers;
    private String esrbRating;
    private Integer addedStatusYet;
    private Integer addedStatusOwned;
    private Integer addedStatusBeaten;
    private Integer addedStatusToplay;
    private Integer addedStatusDropped;
    private Integer addedStatusPlaying;

}
