
package com.Exercicio13.Exercicio13.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record JogadorRequestDto(
        @NotNull(message = "O nome não pode estar nulo") String nome,
        @NotBlank(message = "O apelido não pode estar vazio") String apelido
) {
}