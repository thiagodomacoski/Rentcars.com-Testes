package com.tests;


import static org.junit.Assert.*;

import com.connect.Connect;
import com.connect.request.CadastrarRequest;
import com.connect.response.cadastrar.CadastrarResponse;
import com.io.WriteObject;
import com.utils.Constants;

public class ClienteTest {

	@org.junit.Test
	public void testCadastro() {
		try {
			final CadastrarRequest requestObject = CadastrarRequest.inflate();
			
			assertNotNull(requestObject);
			
			
			System.out.println("Dados do Cliente : "+requestObject.toJson());
			
			final String dataPost = Connect.post(Constants.CADASTRAR, requestObject);
			
			assertNotNull(dataPost, "Resultado da conexão nula!");

			final CadastrarResponse responseObject = Constants.GSON.fromJson(dataPost, CadastrarResponse.class);

			assertNotNull(responseObject);
			
			assertNotNull(responseObject.contato.email);
			final String email = responseObject.contato.email;
			
			assertNotNull(requestObject.senha);
			final String senha = requestObject.senha;
			final String urlVisualizarCliente = Constants.getUrlCadastroVisualizar(email, senha);
			final String dataVisualizar = Connect.get(urlVisualizarCliente);
			final CadastrarResponse responseVisualizar = Constants.GSON.fromJson(dataVisualizar, CadastrarResponse.class);
			assertEquals(responseVisualizar.token, responseObject.token);
			assertEquals(responseVisualizar.nome, responseObject.nome);
			assertEquals(responseVisualizar.sobrenome, responseObject.sobrenome);
			
			// Salva as informações
			WriteObject.write(CadastrarResponse.class, dataVisualizar);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
