package com.example.bibliotecaduoc.dto;

import java.util.List;

/**
 * DTO simple para consumir PokeAPI - solo campos básicos
 */
public class PokemonResponse {

    private Long id;
    private String name;

    private Boolean is_legendary;

    // Nuevos campos
    private Integer base_happiness;
    private Integer capture_rate;
    private List<String> egg_groups;
    private String spriteUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIs_legendary() {
        return is_legendary;
    }

    public void setIs_legendary(Boolean isLegendary) {
        this.is_legendary = isLegendary;
    }

  
    
    


    //base_feliz

    public Integer getBase_happiness() {
        return base_happiness;
    }
    public void getHappiness (Integer base_happiness){
        this.base_happiness = base_happiness;
    
    }

    //capture_rate
    public Integer getCapture_rate() {
        return capture_rate;
    }
    public void setCapture_rate(Integer capture_rate) {
        this.capture_rate = capture_rate;
    }

    /*egg_groups
    private List<String> egg_groups;
    public List<String> getEgg_groups() {
        return egg_groups;
    }
    public void setEgg_groups(List<String> egg_groups) {
        this.egg_groups = egg_groups;
    }*/

    //spriteUrl
    public String getSpriteUrl() {
        return spriteUrl;
    }
    public void setSpriteUrl(String spriteUrl) {
        this.spriteUrl = spriteUrl;
    }


}

    

   
   


