package co.com.screenplay.citamedica.model;

import java.util.List;

public class Persona {
	
	private String nombres;
	private String apellidos;
	private String telefono;
	private String tipoDocumento;
	private String documento;
	
	public Persona(List<String> datos) {
		this.nombres = datos.get(0).trim();
		this.apellidos = datos.get(1).trim();
		this.telefono = datos.get(2).trim();
		this.tipoDocumento = datos.get(3).trim();
		this.documento = datos.get(4).trim();
	}

	public String getNombres() {
		return nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public String getDocumento() {
		return documento;
	}

	
	
}
