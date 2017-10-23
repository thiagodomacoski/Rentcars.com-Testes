
package com.connect.response.cadastrar;

import com.google.gson.annotations.SerializedName;

public class Documento {
	@SerializedName("Numero")
	public String numero;
	@SerializedName("TipoDocumento")
	public String tipoDocumento;
}
