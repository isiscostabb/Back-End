
//Solicitação de transação

package com.example.Ex12.DTO;

public record TransacaoRequestDTO(
        String origem,
        String destino,
        Double valor) {
}