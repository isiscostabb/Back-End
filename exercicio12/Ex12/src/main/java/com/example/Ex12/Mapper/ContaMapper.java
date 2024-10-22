
//Conversão entre a "conta" e os DTOs

package com.example.Ex12.Mapper;

import com.example.Ex12.DTO.ContaDTO;
import com.example.Ex12.model.Conta;

public class ContaMapper {

    // Metodp p/ converter uma Conta em ContaDTO
    public static ContaDTO toDTO(Conta conta) {
        return new ContaDTO(conta.getCodigo(), conta.getCliente());
    }

    // Metodo p/ converter um ContaDTO em uma Conta
    public static Conta toEntity(ContaDTO dto) {
        return new Conta(dto.codigo(), dto.cliente(), 0.0);
    }
}