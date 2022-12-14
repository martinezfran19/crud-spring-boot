package com.tutorial.crud.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
public class ProductDto {
@NotBlank
private String nombre;

@Min(0)
    private Float precio;

    public ProductDto(@NotBlank String nombre,@Min(0) Float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
}
