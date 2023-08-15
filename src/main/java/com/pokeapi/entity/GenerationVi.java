
package com.pokeapi.entity;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "omegaruby-alphasapphire",
    "x-y"
})
@Generated("jsonschema2pojo")
@Data
public class GenerationVi implements Serializable {

    @JsonProperty("omegaruby-alphasapphire")
    public OmegarubyAlphasapphire omegarubyAlphasapphire;
    @JsonProperty("x-y")
    public XY xY;

}
