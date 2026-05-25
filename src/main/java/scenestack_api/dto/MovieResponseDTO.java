package scenestack_api.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;

@Data
public class MovieResponseDTO {

    @JsonAlias("Title")
    private String title;

    @JsonAlias("Year")
    private String year;

    @JsonAlias("imdbID")
    private String imdbID;

    @JsonAlias("Type")
    private String type;

    @JsonAlias("Poster")
    private String poster;

    @JsonAlias("imdbRating")
    private String imdbRating;

    @JsonAlias("Plot")
    private String plot;
}