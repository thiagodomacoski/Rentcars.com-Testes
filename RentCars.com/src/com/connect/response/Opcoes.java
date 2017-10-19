
package com.connect.response;

import com.google.gson.annotations.SerializedName;

public class Opcoes {
    @SerializedName("CidadesInteresse")
    public Object cidadesInteresse;
    @SerializedName("EmailFrequencia")
    public String emailFrequencia;
    @SerializedName("Newsletter")
    public String newsletter;
    @SerializedName("SMS")
    public String sms;
    @SerializedName("ViajaCom")
    public Object viajaCom;
}
