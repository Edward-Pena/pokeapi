
package com.pokeapi.entity;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "front_default",
    "front_shiny"
})
@Generated("jsonschema2pojo")
@Data
public class OfficialArtwork implements Serializable {

    @JsonProperty("front_default")
    public String frontDefault;
    @JsonProperty("front_shiny")
    public String frontShiny;

}
