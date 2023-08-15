
package com.pokeapi.entity;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "icons"
})
@Generated("jsonschema2pojo")
@Data
public class GenerationViii implements Serializable {

    @JsonProperty("icons")
    public Icons__1 icons;

}
