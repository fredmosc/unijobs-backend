package com.github.unijobs.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.unijobs.api.model.User;

public class UserDTO {

    @JsonProperty("name")
    private String name;

    @JsonProperty("email")
    private String email;

    @JsonProperty("registroAcademico")
    private int registroAcademico;

    public UserDTO() { }

    public UserDTO(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.registroAcademico = user.getRegistroAcademico();
    }
}
