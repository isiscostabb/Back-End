
package com.Exercicio13.Exercicio13.controllers;

import com.Exercicio13.Exercicio13.DTO.JogadorRequestDto;
import com.Exercicio13.Exercicio13.DTO.JogadorResponseDto;
import com.Exercicio13.Exercicio13.services.JogadorService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {

    @Autowired
    JogadorService jogadorService;

    // Requisição POST
    @PostMapping
    @ResponseBody
    public JogadorResponseDto insereJogador(@RequestBody @Valid JogadorRequestDto jogadorRequestDto) {
        return jogadorService.insereJogador(jogadorRequestDto); //inserir e retornar resp
    }

    // Requisição GET
    @GetMapping
    @ResponseBody
    public List<JogadorResponseDto> retornaJogadores() {
        return jogadorService.recuperaJogadores(); //recuperar lista e retornar
    }

    // Exceções
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST) // status HTTP 400
    public String handleValidationExceptions(MethodArgumentNotValidException ex) {
        return ex.getBindingResult().getAllErrors().get(0).getDefaultMessage(); //msg de erro ao falhar
    }
}