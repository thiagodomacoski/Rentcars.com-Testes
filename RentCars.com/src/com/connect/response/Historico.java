package com.connect.response;

import com.google.gson.annotations.SerializedName;

public class Historico {
    @SerializedName("Cadastro")
    public String mCadastro;
    @SerializedName("Hash")
    public Long hash;
    @SerializedName("TotalConfirmadas")
    private int totalConfirmadas;
    @SerializedName("TotalReservas")
    private int totalReservas;
    @SerializedName("UltimaReserva")
    private Object ultimaReserva;
}
