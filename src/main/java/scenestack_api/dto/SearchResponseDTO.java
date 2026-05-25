package scenestack_api.dto;

import lombok.Data;
import java.util.List;

@Data
public class SearchResponseDTO {
    private List<ItemResponseDTO> Search;
    private String totalResults;
    private String Response;
}