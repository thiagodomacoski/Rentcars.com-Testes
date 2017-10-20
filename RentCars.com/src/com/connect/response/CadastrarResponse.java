
package com.connect.response;

import com.google.gson.annotations.SerializedName;

public class CadastrarResponse extends ResponseModel {
    @SerializedName("Autenticacao")
    public String autenticacao;
    @SerializedName("Codigo")
    public int codigo;
    @SerializedName("Contato")
    public Contato contato;
    @SerializedName("DataNascimento")
    private String dataNascimento;
    @SerializedName("Documento")
    public Documento documento;
    @SerializedName("Endereco")
    public Endereco endereco;
    @SerializedName("FaixaEtaria")
    public String faixaEtaria;
    @SerializedName("Historico")
    public Historico historico;
    @SerializedName("Idade")
    private int idade;
    @SerializedName("Nacionalidade")
    public Nacionalidade nacionalidade;
    @SerializedName("Nome")
    public String nome;
    @SerializedName("Opcoes")
    public Opcoes opcoes;
    @SerializedName("Sexo")
    public String sexo;
    @SerializedName("Sobrenome")
    public String sobrenome;
    @SerializedName("Social")
    public Social social;
    @SerializedName("Status")
    public String status;
    @SerializedName("Success")
    public  String success;
    @SerializedName("Token")
    public String token;
    @SerializedName("Tratamento")
    public int tratamento;

}
