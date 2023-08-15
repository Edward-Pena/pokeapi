
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
    "move",
    "version_group_details"
})
@Generated("jsonschema2pojo")
@Data
public class Move implements Serializable {

    @JsonProperty("move")
    public Move__1 move;
    @JsonProperty("version_group_details")
    public List<VersionGroupDetail> versionGroupDetails;

}
