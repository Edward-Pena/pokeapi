
package com.pokeapi.entity;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ability",
    "is_hidden",
    "slot"
})
@Generated("jsonschema2pojo")
@Data
public class Ability implements Serializable {

    @JsonProperty("ability")
    public Ability__1 ability;
    @JsonProperty("is_hidden")
    public Boolean isHidden;
    @JsonProperty("slot")
    public Integer slot;

}
