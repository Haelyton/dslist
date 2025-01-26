package dto;

import com.devsuperior.dslist.entities.Game;

public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public Long getId() {
        return id;
    }

    public String getImgUrl() {
        return imgUrl;
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

    public GameMinDTO(final Long id, final String imgUrl, final String shortDescription, final String title, final Integer year) {
        this.id = id;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.title = title;
        this.year = year;
    }

    public GameMinDTO() {
    }

    public GameMinDTO(final Game entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.year = entity.getYear();
        this.imgUrl = entity.getImgUrl();
        this.shortDescription = entity.getShortDescription();
    }

}
