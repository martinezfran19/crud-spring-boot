package com.tutorial.crud.security.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class jwtDto {
    private  String token;

    public jwtDto(String token) {
        this.token = token;
    }
}
