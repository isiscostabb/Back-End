
package com.Exercicio13.Exercicio13.mapper;

import com.Exercicio13.Exercicio13.DTO.JogadorResponseDto;
import com.Exercicio13.Exercicio13.models.JogadorModel;
import org.springframework.stereotype.Component;

@Component
public class JogadorMapper {

    // Conversão obj p/ DTO
    public JogadorResponseDto toDto(JogadorModel jogador) {
        return new JogadorResponseDto(
                jogador.getNome(),
                jogador.getApelido(),
                jogador.getHabilidade()
        );
    }
}