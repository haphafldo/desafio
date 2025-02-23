package com.example.desafioOBDC.model;

import lombok.Data;

@Data // Gera automaticamente getters, setters, toString, equals e hashCode
public class DadosUser {
    private String cpf;
    private String nomeCompleto;
    private String telefone;
    private String email;
    private String dataNascimento;
    private String endereco;
    private String nomeMae;
}