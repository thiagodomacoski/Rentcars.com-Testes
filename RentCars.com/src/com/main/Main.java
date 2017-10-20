
package com.main;

import com.connect.Connect;
import com.connect.request.CadastrarRequest;
import com.connect.response.CadastrarResponse;
import com.utils.Constants;	

public class Main {

	

	public static void main(String[] args) {
		try {
			final CadastrarRequest requestObject = CadastrarRequest.inflate();
			System.out.println(requestObject.toJson());
			final String dataPost = Connect.post(Constants.CADASTRAR ,requestObject);
			System.out.println(dataPost);
			final CadastrarResponse responseObject = Constants.GSON.fromJson(dataPost, CadastrarResponse.class);

			if (null != responseObject) {
				final String email = responseObject.contato.email;
				final String senha = requestObject.senha;
				final String urlVisualizarCliente = Constants.getUrlCadastroVisualizar(email, senha);
				System.out.println("connect: " + urlVisualizarCliente);
				final String dataVisualizar = Connect.get(urlVisualizarCliente);
				System.out.println(dataVisualizar);
			}

		} catch (final Exception e) {
			e.printStackTrace();
		}
	}
	
	
	


}
