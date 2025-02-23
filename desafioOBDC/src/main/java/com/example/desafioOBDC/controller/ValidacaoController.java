package com.example.desafioOBDC.controller;

import com.example.desafioOBDC.model.DadosUser;
import com.example.desafioOBDC.service.ValidacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ValidacaoController {

    private final ValidacaoService validacaoService;

    @Autowired
    public ValidacaoController(ValidacaoService validacaoService) {
        this.validacaoService = validacaoService;
    }

    @PostMapping("/validar")
    public int validarDados(@RequestBody DadosUser dados) {
        return validacaoService.validarDados(dados);
    }
}