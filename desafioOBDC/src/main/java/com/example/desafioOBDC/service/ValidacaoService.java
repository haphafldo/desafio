package com.example.desafioOBDC.service;

import com.example.desafioOBDC.model.DadosUser;
import com.example.desafioOBDC.validation.*;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ValidacaoService {

    public int validarDados(DadosUser dados) {
        if (dados == null || !validarCamposObrigatorios(dados) || !validarFormatoDados(dados)) {
            return 0;
        }
        return gerarNotaAleatoria();
    }

    private boolean validarCamposObrigatorios(DadosUser dados) {
        return dados.getCpf() != null && !dados.getCpf().isEmpty() &&
               dados.getNomeCompleto() != null && !dados.getNomeCompleto().isEmpty() &&
               dados.getTelefone() != null && !dados.getTelefone().isEmpty() &&
               dados.getEmail() != null && !dados.getEmail().isEmpty() &&
               dados.getDataNascimento() != null && !dados.getDataNascimento().isEmpty() &&
               dados.getEndereco() != null && !dados.getEndereco().isEmpty() &&
               dados.getNomeMae() != null && !dados.getNomeMae().isEmpty();
    }

    private boolean validarFormatoDados(DadosUser dados) {
        return ValidadorCPF.validar(dados.getCpf()) &&
               ValidadorEmail.validar(dados.getEmail()) &&
               ValidadorNome.validar(dados.getNomeCompleto()) &&
               ValidadorDataNasc.validar(dados.getDataNascimento()) &&
               ValidadorTexto.validar(dados.getNomeMae());
    }

    private int gerarNotaAleatoria() {
        return new Random().nextInt(11); // Gera um número aleatório entre 0 e 10
    }
}