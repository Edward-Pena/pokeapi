
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
    "abilities",
    "base_experience",
    "forms",
    "game_indices",
    "height",
    "held_items",
    "id",
    "is_default",
    "location_area_encounters",
    "moves",
    "name",
    "order",
    "past_types",
    "species",
    "sprites",
    "stats",
    "types",
    "weight"
})
@Generated("jsonschema2pojo")
@Data
public class Pokemon implements Serializable {

    @JsonProperty("abilities")
    public List<Ability> abilities;
    @JsonProperty("base_experience")
    public Integer baseExperience;
    @JsonProperty("forms")
    public List<Form> forms;
    @JsonProperty("game_indices")
    public List<GameIndex> gameIndices;
    @JsonProperty("height")
    public Integer height;
    @JsonProperty("held_items")
    public List<HeldItem> heldItems;
    @JsonProperty("id")
    public Integer id;
    @JsonProperty("is_default")
    public Boolean isDefault;
    @JsonProperty("location_area_encounters")
    public String locationAreaEncounters;
    @JsonProperty("moves")
    public List<Move> moves;
    @JsonProperty("name")
    public String name;
    @JsonProperty("order")
    public Integer order;
    @JsonProperty("past_types")
    public List<Object> pastTypes;
    @JsonProperty("species")
    public Species species;
    @JsonProperty("sprites")
    public Sprites sprites;
    @JsonProperty("stats")
    public List<Stat> stats;
    @JsonProperty("types")
    public List<Type> types;
    @JsonProperty("weight")
    public Integer weight;

}
