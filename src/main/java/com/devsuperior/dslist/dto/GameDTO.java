package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
import com.fasterxml.jackson.databind.util.BeanUtil;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;


public class GameDTO {

    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public GameDTO() {
    }

    public GameDTO(Game entity) {
        BeanUtils.copyProperties(entity, this);
    }

    public String getGenre() {
        return genre;
    }

    public Long getId() {
        return id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public String getPlatforms() {
        return platforms;
    }

    public Double getScore() {
        return score;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public void setGenre(final String genre) {
        this.genre = genre;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public void setImgUrl(final String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public void setLongDescription(final String longDescription) {
        this.longDescription = longDescription;
    }

    public void setPlatforms(final String platforms) {
        this.platforms = platforms;
    }

    public void setScore(final Double score) {
        this.score = score;
    }

    public void setShortDescription(final String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public void setYear(final Integer year) {
        this.year = year;
    }
}
