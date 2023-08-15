
package com.pokeapi.entity;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "diamond-pearl",
    "heartgold-soulsilver",
    "platinum"
})
@Generated("jsonschema2pojo")
@Data
public class GenerationIv implements Serializable {

    @JsonProperty("diamond-pearl")
    public DiamondPearl diamondPearl;
    @JsonProperty("heartgold-soulsilver")
    public HeartgoldSoulsilver heartgoldSoulsilver;
    @JsonProperty("platinum")
    public Platinum platinum;

}
