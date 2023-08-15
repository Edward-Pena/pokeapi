
package com.pokeapi.entity;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "base_stat",
    "effort",
    "stat"
})
@Generated("jsonschema2pojo")
@Data
public class Stat implements Serializable {

    @JsonProperty("base_stat")
    public Integer baseStat;
    @JsonProperty("effort")
    public Integer effort;
    @JsonProperty("stat")
    public Stat__1 stat;

}
