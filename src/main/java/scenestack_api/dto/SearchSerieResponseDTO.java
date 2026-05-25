package scenestack_api.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

import java.util.List;

@Data
public class SearchSerieResponseDTO {
    @JsonAlias("Search")
    private List<SerieSearchItemDTO> search;

    @JsonAlias("totalResults")
    private String totalResults;

    @JsonAlias("Response")
    private String response;
}
