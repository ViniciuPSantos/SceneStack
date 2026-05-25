package scenestack_api.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

import java.util.List;

@Data
public class SearchMovieResponseDTO {
    @JsonAlias("Search")
    private List<MovieSearchItemDTO> search;

    @JsonAlias("totalResults")
    private String totalResults;

    @JsonAlias("Response")
    private String response;
}
