package com.pokeapi.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.pokeapi.entity.Pokemon;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

@RestController
@RequestMapping("/api")
public class PokeapiController {
    @Value("${pokeapi.base-url}")
    private String ApiUrl;
    private static final Logger LOGGER = Logger.getLogger(PokeapiController.class.getName());

   @GetMapping(value = "/pokemon",produces = MediaType.APPLICATION_JSON_VALUE)
    public Pokemon getOnePokemon(@RequestParam("name") String name) {
       String url = ApiUrl+name;
       RestTemplate restTemplate = new RestTemplate();
       try {
           ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.GET, null, String.class);

           if (responseEntity.getStatusCode().is2xxSuccessful()){
               String jsonResponse = responseEntity.getBody();
               ObjectMapper objectMapper = new ObjectMapper();
               Pokemon pokemon = objectMapper.readValue(jsonResponse, Pokemon.class);
               return pokemon;
           }else if (responseEntity.getStatusCode().is4xxClientError()){
               LOGGER.info("CLIENT ERROR");
           }else if (responseEntity.getStatusCode().is5xxServerError()){
               LOGGER.info("SERVER ERROR");
           }else {
               LOGGER.severe("UNKNOWN ERROR");
           }
       } catch (Exception e) {
           LOGGER.severe("Error a causa de:  "+e);
       }
       return null;
   }
}




