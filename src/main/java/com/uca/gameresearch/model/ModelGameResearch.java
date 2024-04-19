package com.uca.gameresearch.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "api-game-research")
public class ModelGameResearch {

    @Id
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
