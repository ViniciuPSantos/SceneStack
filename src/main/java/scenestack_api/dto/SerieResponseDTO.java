package scenestack_api.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class SerieResponseDTO {

    @JsonAlias("Title")
    private String title;

    @JsonAlias("Year")
    private String year;

    @JsonAlias("Plot")
    private String plot;

    @JsonAlias("imdbRating")
    private String imdbRating;

    @JsonAlias("imdbID")
    private String imdbID;

    @JsonAlias("totalSeasons")
    private String seasons;

    @JsonAlias("Poster")
    private String poster;

}
