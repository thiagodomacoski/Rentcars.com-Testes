package com.main;


import java.io.IOException;

import javax.print.DocFlavor.STRING;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class OKHttptest {

	public static String[] URLS  = {
			"http://rest.stage.rentcars.com/api/cliente/Visualizar?Email=tl.domacoski@gmail.com&MobicarRequestorID=198&Senha=100senha&Moeda=BRL&Locale=pt_BR&Environment=app",
			"http://rest.stage.rentcars.com/api/reserva/Filtros?MobicarRequestorID=198&CodigoLocalidade=4594&Format=json&Moeda=BRL&Locale=pt_BR&Environment=app",
			"http://rest.stage.rentcars.com/api/reserva/Configurar?CodigoCategoria=2369&CodigoGrupo=3726&CodigoLocadora=1&CodigoLocalidadeDevolucao=4594&CodigoLocalidadeRetirada=4594&CodigoLojaDevolucao=8602&CodigoLojaRetirada=8602&CodigoPlano=983&DataDevolucao=2017-07-13&DataRetirada=2017-07-12&Format=json&HoraDevolucao=10:00:00&HoraRetirada=10:00:00&MobicarRequestorID=198&CodigoProtecao=&Opcional=&PPNacional=true&Moeda=BRL&Locale=pt_BR&Environment=app",
			"http://rest.stage.rentcars.com/api/reserva/Configurar?CodigoCategoria=17&CodigoGrupo=3807&CodigoLocadora=686&CodigoLocalidadeDevolucao=1149&CodigoLocalidadeRetirada=1149&CodigoLojaDevolucao=17601&CodigoLojaRetirada=17601&CodigoPlano=949&DataDevolucao=2017-07-14&DataRetirada=2017-07-13&Format=json&HoraDevolucao=10:00:00&HoraRetirada=10:00:00&MobicarRequestorID=198&CodigoProtecao=&Opcional=&PPNacional=true&Moeda=BRL&Locale=pt_BR&Environment=app&CodigoResidencia=BR",
			"http://rest.stage.rentcars.com/api/reserva/Configurar?CodigoCategoria=17&CodigoGrupo=3807&CodigoLocadora=686&CodigoLocalidadeDevolucao=1149&CodigoLocalidadeRetirada=1149&CodigoLojaDevolucao=17601&CodigoLojaRetirada=17601&CodigoPlano=949&DataDevolucao=2017-07-14&DataRetirada=2017-07-13&Format=json&HoraDevolucao=10:00:00&HoraRetirada=10:00:00&MobicarRequestorID=198&CodigoProtecao=&Opcional=&PPNacional=true&Moeda=BRL&Locale=pt_BR&Environment=app&CodigoResidencia=BR",
			"http://rest.stage.rentcars.com/api/reserva/Pesquisar?CodigoCategoria=17&CodigoGrupo=3807&CodigoLocadora=686&CodigoLocalidadeDevolucao=1149&CodigoLocalidadeRetirada=1149&CodigoLojaDevolucao=17601&CodigoLojaRetirada=17601&CodigoPlano=226&DataDevolucao=2017-07-14&DataRetirada=2017-07-13&Format=json&HoraDevolucao=10:00:00&HoraRetirada=10:00:00&MobicarRequestorID=198&CodigoProtecao=&Opcional=&PPNacional=true&Moeda=BRL&Locale=pt_BR&Environment=app&CodigoResidencia=BR",
			"http://rest.stage.rentcars.com/api/moeda/UltimaCotacao?MobicarRequestorID=198&FromCurrency=ASD&ToCurrency=BRL",
			"http://rest.stage.rentcars.com/api/moeda/UltimaCotacao?MobicarRequestorID=198&FromCurrency=ASD&ToCurrency=BRL",
			"https://rest.stage.rentcars.com/api/geoip?ip=REMOTEADDR&Locale=en_US&Environment=app&Moeda=UYU"
	};
	
	public static void main(String[] args) {

		for(final String _url : URLS) {
			final String data = get(_url);
			System.out.println(data);
		}
	
	}
	public static String get(final String _url) {
		final OkHttpClient client = new OkHttpClient();
		final Request request = new Request.Builder()
		  .url(_url)
		  .get()
		  .addHeader("cache-control", "no-cache")
		  .build();

		try {
			Response response = client.newCall(request).execute();
			System.out.println("Response: "+response.code());
			return response.body().string();
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}

	}
	public static void load1() {
		
		OkHttpClient client = new OkHttpClient();

		Request request = new Request.Builder()
		  .url("http://rest.stage.rentcars.com/api/cliente/Visualizar?Email=tl.domacoski%40gmail.com&MobicarRequestorID=198&Senha=100senha&Moeda=BRL&Locale=pt_BR&Environment=app")
		  .get()
		  .addHeader("cache-control", "no-cache")
		  .addHeader("postman-token", "2121b86f-231a-ea6d-57dd-76deac716c14")
		  .build();

		try {
			Response response = client.newCall(request).execute();
			System.out.println("Response: "+response.code());
			System.out.println("Body: "+response.body().string());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
