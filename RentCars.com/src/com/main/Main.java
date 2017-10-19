package com.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import com.connect.Connect;	

public class Main {

	
	
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
	private static final String USER_AGENT = "Mobile app dev";

	public static void main(String[] args) {
		try {
 
			for(final String url : URLS) {
				final String data = connect(url);
				System.out.println(data);
				System.out.println("\n\n\n==-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=--=\n");
			}
			
			
			final String dataPost = Connect.post("http://rest.stage.rentcars.com/api/cliente/Cadastrar?Moeda=BRL&Locale=pt_BR&Environment=app&Format=json", null);
//			final String json = post("http://rest.stage.rentcars.com/api/cliente/Cadastrar?Moeda=BRL&Locale=pt_BR&Environment=app&Format=json", 
//					"{\"MobicarRequestorID\": \"198\",\"Tratamento\": \"M\",\"Nome\": \"Teste\",\"Sobrenome\": \"Decadastro\",\"DataNascimento\": \"1990-01-11\",\"Celular\": \"+55 41 99958-8960\",\"Email\": \"em@mail.com\",\"Newsletter\": \"0\",\"Documento\": \"123.456.789-09\",\"TipoDocumento\": \"CPF\",\"Senha\": \"12345678\",\"CodigoPaisNacionalidade\": 1,\"SendWelcomeEmail\": 1,\"CodigoPais\": \"US\"}");
//			System.out.println(json);
		} catch (final Exception e) {
			e.printStackTrace();
		}

	}
	
	public static String post(final String _url, final String data) throws Exception {
		final URL url = new URL(_url);
		final HttpURLConnection connection = HttpURLConnection.class.cast(url.openConnection());
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setRequestProperty("Format", "json");
		connection.setRequestProperty("User-Agent", USER_AGENT);
		connection.setRequestProperty("cache-control", "no-cache");
		connection.setDoOutput(true);
		
		if(data != null) {
			final OutputStream os = connection.getOutputStream();
			os.write(data.getBytes());
			os.flush();
			os.close();			
		}
		
		
		int responseCode = connection.getResponseCode();
		System.out.println("Response code: "+responseCode);
		System.out.println(connection.getResponseMessage());
		
		System.out.println("TYPE: "+connection.getHeaderField("content-type"));
		final BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		final StringBuffer buffer = new StringBuffer();
		String line;
		while ((line = reader.readLine()) != null) {
			buffer.append(line);
		}
		reader.close();
		return buffer.toString();
	}
	
	

	public static String connect(final String _url) throws Exception {
		final URL url = new URL(_url);
		final HttpURLConnection connection = HttpURLConnection.class.cast(url.openConnection());
		connection.setRequestMethod("GET");
		connection.setRequestProperty("Content-Type", "json");
		connection.setRequestProperty("Format", "json");
		connection.setRequestProperty("User-Agent", USER_AGENT);
		connection.setRequestProperty("cache-control", "no-cache");
		connection.setDoOutput(true);
		connection.setReadTimeout(33 * 1000);
		connection.connect();
		
		int responseCode = connection.getResponseCode();
		System.out.println("Response code: "+responseCode);
		System.out.println("TYPE: "+connection.getHeaderField("content-type"));

		final BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		final StringBuffer buffer = new StringBuffer();
		String line;
		while ((line = reader.readLine()) != null) {
			buffer.append(line);
		}
		reader.close();
		return buffer.toString();
	}

}
