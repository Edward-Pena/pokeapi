
package com.pokeapi.entity;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dream_world",
    "home",
    "official-artwork"
})
@Generated("jsonschema2pojo")
@Data
public class Other implements Serializable {

    @JsonProperty("dream_world")
    public DreamWorld dreamWorld;
    @JsonProperty("home")
    public Home home;
    @JsonProperty("official-artwork")
    public OfficialArtwork officialArtwork;

}
