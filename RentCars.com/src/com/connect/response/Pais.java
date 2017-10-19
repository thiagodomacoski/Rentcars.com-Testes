
package com.connect.response;

import com.google.gson.annotations.SerializedName;

public class Pais {
    @SerializedName("Codigo")
    public Long codigo;
    @SerializedName("ISO")
    public String iso;
    @SerializedName("Nome")
    public String nome;
}
