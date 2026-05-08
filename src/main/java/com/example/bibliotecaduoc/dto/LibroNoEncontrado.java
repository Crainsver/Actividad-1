package com.example.bibliotecaduoc.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;


public record LibroNoEncontrado
            ( String codigoError,
                String mensaje
              ) {
}
