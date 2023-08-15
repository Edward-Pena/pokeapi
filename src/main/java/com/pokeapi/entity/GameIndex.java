
package com.pokeapi.entity;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "game_index",
    "version"
})
@Generated("jsonschema2pojo")
@Data
public class GameIndex implements Serializable {

    @JsonProperty("game_index")
    public Integer gameIndex;
    @JsonProperty("version")
    public Version version;

}
