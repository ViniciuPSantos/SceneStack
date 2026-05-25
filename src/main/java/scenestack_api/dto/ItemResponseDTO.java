package scenestack_api.dto;

import lombok.Data;

@Data
public class ItemResponseDTO {
    private String Title;
    private String Year;
    private String Poster;
    private String imdbID;
    private String Type;
}