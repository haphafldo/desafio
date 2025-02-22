package com.example.desafioOBDC.service;

import com.example.desafioOBDC.model.DadosUsuario;
import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class ValidacaoService {

    public int validarDados(DadosUsuario dados) {
        // Validações simples
        if (dados.getCpf() == null || dados.getCpf().isEmpty() ||
            dados.getNomeCompleto() == null || dados.getNomeCompleto().isEmpty() ||
            dados.getTelefone() == null || dados.getTelefone().isEmpty() ||
            dados.getEmail() == null || dados.getEmail().isEmpty() ||
            dados.getDataNascimento() == null || dados.getDataNascimento().isEmpty() ||
            dados.getEndereco() == null || dados.getEndereco().isEmpty() ||
            dados.getNomeMae() == null || dados.getNomeMae().isEmpty()) {
            return 0; // Dados inválidos
        }

        // Gera uma nota aleatória entre 0 e 10
        Random random = new Random();
        return random.nextInt(11);
    }
}