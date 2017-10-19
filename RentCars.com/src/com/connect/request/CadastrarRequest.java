
package com.connect.request;

import com.google.gson.annotations.SerializedName;
import com.utils.Util;

public class CadastrarRequest extends RequestModel{
    @SerializedName("Celular")
    public String celular;
    @SerializedName("CodigoPais")
    public String codigoPais;
    @SerializedName("CodigoPaisNacionalidade")
    public int codigoPaisNacionalidade;
    @SerializedName("DataNascimento")
    public String dataNascimento;
    @SerializedName("Documento")
    public String documento;
    @SerializedName("Email")
    public String email;
    @SerializedName("MobicarRequestorID")
    public String mobicarRequestorID;
    @SerializedName("Newsletter")
    public String newsletter;
    @SerializedName("Nome")
    public String nome;
    @SerializedName("SendWelcomeEmail")
    public int sendWelcomeEmail;
    @SerializedName("Senha")
    public String senha;
    @SerializedName("Sobrenome")
    public String sobrenome;
    @SerializedName("TipoDocumento")
    public String tipoDocumento;
    @SerializedName("Tratamento")
    public String tratamento;
    
    
    public static CadastrarRequest inflate() {
    	final CadastrarRequest cadastrarRequest = new CadastrarRequest();
    	cadastrarRequest.celular = "+55 41 999999999";
    	cadastrarRequest.tratamento = "M";
    	cadastrarRequest.nome = Util.generateString(33);
    	cadastrarRequest.sobrenome = Util.generateString(30);
    	cadastrarRequest.dataNascimento  = "1974-01-12";
    	cadastrarRequest.email = (Util.generateString(7).toLowerCase()+"@mail.com");
    	cadastrarRequest.newsletter = "0";
    	cadastrarRequest.documento = Util.generateCPF();
    	cadastrarRequest.tipoDocumento = "CPF";
    	cadastrarRequest.senha = "12345678";
    	cadastrarRequest.codigoPaisNacionalidade = 1;
    	cadastrarRequest.sendWelcomeEmail = 1;
    	cadastrarRequest.codigoPais = "US";
    	cadastrarRequest.mobicarRequestorID = "198";
    	return cadastrarRequest;
    }


	@Override
	public String toString() {
		return "CadastrarRequest [celular=" + celular + ", codigoPais=" + codigoPais + ", codigoPaisNacionalidade="
				+ codigoPaisNacionalidade + ", dataNascimento=" + dataNascimento + ", documento=" + documento
				+ ", email=" + email + ", mobicarRequestorID=" + mobicarRequestorID + ", newsletter=" + newsletter
				+ ", nome=" + nome + ", sendWelcomeEmail=" + sendWelcomeEmail + ", senha=" + senha + ", sobrenome="
				+ sobrenome + ", tipoDocumento=" + tipoDocumento + ", tratamento=" + tratamento + "]";
	}
    
    
    
}