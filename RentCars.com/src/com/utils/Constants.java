package com.utils;

import java.text.SimpleDateFormat;

public class Constants {
	public static final String PESQUISA = "https://rest.stage.rentcars.com/api/reserva/Filtros?MobicarRequestorID=%s&CodigoLocalidade=%s&Format=json&Moeda=%s&Locale=%s&Environment=app";
	
	public static String getUrlPesquisa(final int requestorID, int codigoLocalidade, final String moeda, final String locale) {
		return String.format(PESQUISA, String.valueOf(requestorID), String.valueOf(codigoLocalidade), moeda, locale);
	}
	
	
	
	public static final SimpleDateFormat FORMAT = new SimpleDateFormat("dd/MM/yy HH:mm");
	public static String currentData() {
		return FORMAT.format(System.currentTimeMillis());
	}
	
	
	
	
}
