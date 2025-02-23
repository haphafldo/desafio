package com.example.desafioOBDC.validation;

import java.util.regex.Pattern;

public class ValidadorEmail{

    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@(.+)\\.com$";

    public static boolean validar(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }
        return Pattern.compile(EMAIL_REGEX).matcher(email).matches();
    }
}