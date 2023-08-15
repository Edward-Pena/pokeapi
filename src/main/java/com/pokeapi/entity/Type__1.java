
package com.pokeapi.entity;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "url"
})
@Generated("jsonschema2pojo")
@Data
public class Type__1 implements Serializable {

    @JsonProperty("name")
    public String name;
    @JsonProperty("url")
    public String url;

}
