package com.example.desafioOBDC.validation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ValidadorDataNasc {

    private static final String FORMATO_DATA = "yyyy-MM-dd";

    public static boolean validar(String dataNascimento) {
        if (dataNascimento == null || dataNascimento.isEmpty()) {
            return false;
        }

        try {
            LocalDate data = LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern(FORMATO_DATA));
            LocalDate hoje = LocalDate.now();
            return !data.isAfter(hoje); // Data não pode ser futura
        } catch (DateTimeParseException e) {
            return false; // Formato inválido
        }
    }
}