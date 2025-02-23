package com.example.desafioOBDC.validation;

import java.util.regex.Pattern;

public class ValidadorTexto {

    private static final String TEXTO_REGEX = "^[A-Za-zÀ-ÿ]{2,}$";

    public static boolean validar(String texto) {
        if (texto == null || texto.isEmpty()) {
            return false;
        }
        return Pattern.compile(TEXTO_REGEX).matcher(texto).matches();
    }
}