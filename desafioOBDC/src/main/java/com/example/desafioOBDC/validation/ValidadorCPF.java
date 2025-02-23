package com.example.desafioOBDC.validation;

public class ValidadorCPF{

    private static final int TAMANHO_CPF = 11;

    public static boolean validar(String cpf) {
        if (cpf == null || cpf.isEmpty()) {
            return false;
        }
        // Remove caracteres não numéricos
        String cpfNumerico = cpf.replaceAll("[^0-9]", "");
        return cpfNumerico.length() == TAMANHO_CPF;
    }
}