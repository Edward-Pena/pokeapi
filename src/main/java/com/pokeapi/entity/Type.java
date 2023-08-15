
package com.pokeapi.entity;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "slot",
    "type"
})
@Generated("jsonschema2pojo")
@Data
public class Type implements Serializable {

    @JsonProperty("slot")
    public Integer slot;
    @JsonProperty("type")
    public Type__1 type;

}
