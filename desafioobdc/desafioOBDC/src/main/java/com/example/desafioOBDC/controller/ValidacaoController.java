package com.example.desafioOBDC.controller;

import com.example.desafioOBDC.model.DadosUsuario;
import com.example.desafioOBDC.service.ValidacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ValidacaoController {

    @Autowired
    private ValidacaoService validacaoService;

    @PostMapping("/validar")
    public int validarDados(@RequestBody DadosUsuario dados) {
        return validacaoService.validarDados(dados);
    }
}
