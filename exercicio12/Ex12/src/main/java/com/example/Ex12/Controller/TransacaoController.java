
//Recebe requisições

package com.example.Ex12.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Ex12.DTO.TransacaoRequestDTO;
import com.example.Ex12.DTO.TransacaoResponseDTO;
import com.example.Ex12.Services.TransacoesService;

@RestController
@RequestMapping("/transacoes")
public class TransacaoController {

    @Autowired
    private TransacoesService transacoesService;

    @PostMapping
    public TransacaoResponseDTO gerarTransacao(@RequestBody TransacaoRequestDTO request) {
        return transacoesService.gerarTransacao(request);
    }
}