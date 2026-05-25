package scenestack_api.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class SerieSearchItemDTO {
    @JsonAlias("Title")
    private String title;

    @JsonAlias("Year")
    private String year;

    @JsonAlias("Type")
    private String type;

    @JsonAlias("imdbID")
    private String imdbID;

    @JsonAlias("Poster")
    private String poster;
}
