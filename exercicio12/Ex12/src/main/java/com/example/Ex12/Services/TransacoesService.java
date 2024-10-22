
//Logica

package com.example.Ex12.Services;

import com.example.Ex12.DTO.TransacaoRequestDTO;
import com.example.Ex12.DTO.TransacaoResponseDTO;
import com.example.Ex12.Mapper.ContaMapper;
import com.example.Ex12.model.Conta;
import com.example.Ex12.model.Transacao;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransacoesService {
    private List<Conta> contas = new ArrayList<>();

    // Construtor das contas
    public TransacoesService() {
        contas.add(new Conta("500-1", "Fulano", 1000.0));
        contas.add(new Conta("320-2", "Ciclano", 2000.0));
    }

    // Metodo p/ processar uma transação
    public TransacaoResponseDTO gerarTransacao(TransacaoRequestDTO request) {
        Conta origem = findContaByCodigo(request.origem());
        Conta destino = findContaByCodigo(request.destino());

        // Verificação das contas
        if (origem == null || destino == null) {
            throw new IllegalArgumentException("Conta origem ou destino não encontrada.");
        }

        // Verificação do saldo
        if (origem.getSaldo() < request.valor()) {
            throw new IllegalArgumentException("Saldo insuficiente.");
        }

        origem.debitar(request.valor());
        destino.creditar(request.valor());

        Transacao transacao = new Transacao(origem, destino, request.valor());

        // Devolve um DTO de resposta
        return new TransacaoResponseDTO(
                ContaMapper.toDTO(transacao.getOrigem()),
                ContaMapper.toDTO(transacao.getDestino()),
                transacao.getValor()
        );
    }

    // Meotdo p/ encontrar a conta pelo cod
    private Conta findContaByCodigo(String codigo) {
        return contas.stream()
                .filter(conta -> conta.getCodigo().equals(codigo))
                .findFirst()
                .orElse(null);
    }
}