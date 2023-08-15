
package com.pokeapi.entity;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "crystal",
    "gold",
    "silver"
})
@Generated("jsonschema2pojo")
@Data
public class GenerationIi implements Serializable {

    @JsonProperty("crystal")
    public Crystal crystal;
    @JsonProperty("gold")
    public Gold gold;
    @JsonProperty("silver")
    public Silver silver;

}
