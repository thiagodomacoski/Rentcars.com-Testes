
package com.connect.response.cadastrar;
import com.google.gson.annotations.SerializedName;

public class Endereco {
    @SerializedName("Bairro")
    public Object bairro;
    @SerializedName("Cep")
    public Object cep;
    @SerializedName("Cidade")
    public Object cidade;
    @SerializedName("Endereco")
    public Endereco endereco;
    @SerializedName("Estado")
    public Object estado;
    @SerializedName("Pais")
    public Pais pais;
    @SerializedName("UF")
    private Object uf;
}
