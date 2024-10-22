
//Resposta da transação

package com.example.Ex12.DTO;

public record TransacaoResponseDTO(
        ContaDTO origem,
        ContaDTO destino,
        Double valor) {
}