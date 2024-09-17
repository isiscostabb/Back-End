
package com.example.EX08.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/fipe") // Caminho
public class FipeController {

    private final RestTemplate restTemplate = new RestTemplate();
    private static final String FIPE_API_URL = "https://parallelum.com.br/api/v2/"; // URL  da API

    @GetMapping("/valor")
    @ResponseBody
    public ResponseEntity<Map<String, String>> valor(
            @RequestParam String marca,   // Consulta marca
            @RequestParam String modelo,  // Consulta modelo
            @RequestParam String ano      // Consulta ano
    ) {

        String url = FIPE_API_URL + "cars/marcas/" + marca + "/modelos/" + modelo + "/anos/" + ano;

        // Faz uma requisição e obtém a resposta como um Map
        Map<String, Object> resposta = restTemplate.getForObject(url, HashMap.class);

        if (resposta == null) {
            return ResponseEntity.status(404).body(Map.of("error", "Informações não encontradas"));
        }

        // Cria HashMap p/ armazenar a resposta
        Map<String, String> respostaPersonalizada = new HashMap<>();
        respostaPersonalizada.put("Valor", resposta.get("valor").toString()); // Adiciona valor
        respostaPersonalizada.put("Marca", resposta.get("marca").toString()); // Adiciona marca
        respostaPersonalizada.put("Modelo", resposta.get("modelo").toString()); // Adiciona modelo

        // Retorna uma resposta
        return ResponseEntity.ok(respostaPersonalizada);
    }
}