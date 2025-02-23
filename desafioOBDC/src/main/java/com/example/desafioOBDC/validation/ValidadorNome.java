package com.example.desafioOBDC.validation;

import java.util.regex.Pattern;

public class ValidadorNome {

    private static final String NOME_REGEX = "^[A-Za-zÀ-ÿ]+\\s[A-Za-zÀ-ÿ]+$";

    public static boolean validar(String nome) {
        if (nome == null || nome.isEmpty()) {
            return false;
        }
        return Pattern.compile(NOME_REGEX).matcher(nome).matches();
    }
}