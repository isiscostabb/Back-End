
package com.Exercicio13.Exercicio13.services;

import com.Exercicio13.Exercicio13.DTO.JogadorRequestDto;
import com.Exercicio13.Exercicio13.DTO.JogadorResponseDto;
import com.Exercicio13.Exercicio13.mapper.JogadorMapper;
import com.Exercicio13.Exercicio13.models.JogadorModel;
import com.Exercicio13.Exercicio13.repositories.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class JogadorService {

    @Autowired
    JogadorMapper jogadorMapper;

    @Autowired
    JogadorRepository jogadorRepository;

    // Metodo inserir jogador
    public JogadorResponseDto insereJogador(JogadorRequestDto jogadorRequestDto) {
        Random random = new Random();
        Integer habilidadeAleatoria = random.nextInt(1, 100);

        JogadorModel jogador = new JogadorModel(); //objeto

        // DTO
        jogador.setNome(jogadorRequestDto.nome());
        jogador.setApelido(jogadorRequestDto.apelido());
        jogador.setHabilidade(habilidadeAleatoria);
        jogadorRepository.save(jogador);

        return jogadorMapper.toDto(jogador);
    }

    public List<JogadorResponseDto> recuperaJogadores() {
        return jogadorRepository.findAll().stream()
                .map(jogadorMapper::toDto)
                .toList();
    }
}