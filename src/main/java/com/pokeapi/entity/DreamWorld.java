
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
    "front_female"
})
@Generated("jsonschema2pojo")
@Data
public class DreamWorld implements Serializable {

    @JsonProperty("front_default")
    public String frontDefault;
    @JsonProperty("front_female")
    public Object frontFemale;

}
