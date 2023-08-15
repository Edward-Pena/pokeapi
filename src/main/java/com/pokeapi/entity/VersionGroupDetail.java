
package com.pokeapi.entity;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "level_learned_at",
    "move_learn_method",
    "version_group"
})
@Generated("jsonschema2pojo")
@Data
public class VersionGroupDetail implements Serializable {

    @JsonProperty("level_learned_at")
    public Integer levelLearnedAt;
    @JsonProperty("move_learn_method")
    public MoveLearnMethod moveLearnMethod;
    @JsonProperty("version_group")
    public VersionGroup versionGroup;

}
