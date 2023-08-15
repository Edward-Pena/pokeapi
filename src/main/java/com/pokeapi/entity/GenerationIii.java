
package com.pokeapi.entity;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "emerald",
    "firered-leafgreen",
    "ruby-sapphire"
})
@Generated("jsonschema2pojo")
@Data
public class GenerationIii implements Serializable {

    @JsonProperty("emerald")
    public Emerald emerald;
    @JsonProperty("firered-leafgreen")
    public FireredLeafgreen fireredLeafgreen;
    @JsonProperty("ruby-sapphire")
    public RubySapphire rubySapphire;

}
