
package com.pokeapi.entity;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "item",
    "version_details"
})
@Generated("jsonschema2pojo")
@Data
public class HeldItem implements Serializable {

    @JsonProperty("item")
    public Item item;
    @JsonProperty("version_details")
    public List<VersionDetail> versionDetails;

}
