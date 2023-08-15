
package com.pokeapi.entity;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "rarity",
    "version"
})
@Generated("jsonschema2pojo")
@Data
public class VersionDetail implements Serializable {

    @JsonProperty("rarity")
    public Integer rarity;
    @JsonProperty("version")
    public Version__1 version;

}
