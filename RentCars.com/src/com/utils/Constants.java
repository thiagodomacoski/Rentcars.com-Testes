package com.utils;

import java.text.SimpleDateFormat;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Constants {
	
	public static Gson GSON = new GsonBuilder().create();
	
	public static final String FILTROS = "https://rest.stage.rentcars.com/api/reserva/Filtros?MobicarRequestorID=%s&CodigoLocalidade=%s&Format=json&Moeda=%s&Locale=%s&Environment=app";
	public static final String CLIENTE_VISUALIZAR = "http://rest.stage.rentcars.com/api/cliente/Visualizar?MobicarRequestorID=198&Moeda=BRL&Locale=pt_BR&Environment=app&Email=%s&Senha=%s";
	public static final String CADASTRAR = "http://rest.stage.rentcars.com/api/cliente/Cadastrar?Moeda=BRL&Locale=pt_BR&Environment=app&Format=json";
	
	
	public static String getUrlCadastroVisualizar(final String email, final String senha) {
		return String.format(CLIENTE_VISUALIZAR, email, senha);
	}
	
	
	public static String getUrlFiltros(final int requestorID, int codigoLocalidade, final String moeda, final String locale) {
		return String.format(FILTROS, String.valueOf(requestorID), String.valueOf(codigoLocalidade), moeda, locale);
	}
	
	
	
	public static final SimpleDateFormat FORMAT = new SimpleDateFormat("dd/MM/yy HH:mm");
	public static String currentData() {
		return FORMAT.format(System.currentTimeMillis());
	}
	
	
	
	
}
