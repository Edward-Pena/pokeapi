
package com.pokeapi.entity;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "back_default",
    "back_gray",
    "back_transparent",
    "front_default",
    "front_gray",
    "front_transparent"
})
@Generated("jsonschema2pojo")
@Data
public class Yellow implements Serializable {

    @JsonProperty("back_default")
    public String backDefault;
    @JsonProperty("back_gray")
    public String backGray;
    @JsonProperty("back_transparent")
    public String backTransparent;
    @JsonProperty("front_default")
    public String frontDefault;
    @JsonProperty("front_gray")
    public String frontGray;
    @JsonProperty("front_transparent")
    public String frontTransparent;

}
