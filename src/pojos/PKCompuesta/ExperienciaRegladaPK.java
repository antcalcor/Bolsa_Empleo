package pojos.PKCompuesta;

import java.io.Serializable;
import java.time.LocalDate;

import pojos.Usuario;

public class ExperienciaRegladaPK implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Usuario idUsuario;
	
	private String centro;
	
	private LocalDate fechaIni;

	public ExperienciaRegladaPK() {
		
	}

	public ExperienciaRegladaPK(Usuario idUsuario, String centro, LocalDate fechaIni) {
		
		this.idUsuario = idUsuario;
		this.centro = centro;
		this.fechaIni = fechaIni;
		
	}

}
