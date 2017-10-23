package com.connect.response.cadastrar;

import com.google.gson.annotations.SerializedName;

public class Contato {
    @SerializedName("Celular")
    public String celular;
    @SerializedName("Email")
    public String email;
    @SerializedName("Telefone")
    public Object telefone;
}
