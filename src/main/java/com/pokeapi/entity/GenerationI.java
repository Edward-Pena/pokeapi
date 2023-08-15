
package com.pokeapi.entity;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "red-blue",
    "yellow"
})
@Generated("jsonschema2pojo")
@Data
public class GenerationI implements Serializable {

    @JsonProperty("red-blue")
    public RedBlue redBlue;
    @JsonProperty("yellow")
    public Yellow yellow;

}
