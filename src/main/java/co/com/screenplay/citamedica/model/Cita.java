package co.com.screenplay.citamedica.model;

import java.util.List;

public class Cita {
	
	private String fecha;
	private String documentoPaciente;
	private String documentoDoctor;
	private String observaciones;
	
	public Cita(List<String> cita) {
		this.fecha = cita.get(0).trim();
		this.documentoPaciente = cita.get(1).trim();
		this.documentoDoctor = cita.get(2).trim();
		this.observaciones = cita.get(3).trim();
	}

	public String getFecha() {
		return fecha;
	}

	public String getDocumentoPaciente() {
		return documentoPaciente;
	}

	public String getDocumentoDoctor() {
		return documentoDoctor;
	}

	public String getObservaciones() {
		return observaciones;
	}
	
	
}
