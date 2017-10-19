
package com.connect.response;

import com.google.gson.annotations.SerializedName;

public class Nacionalidade {
    @SerializedName("Codigo")
    public int codigo;
    @SerializedName("ISO")
    public String iso;
    @SerializedName("Nome")
    public String nome;
}
