package pojos.PKCompuesta;

import java.io.Serializable;
import java.time.LocalDate;

import pojos.Usuario;

public class ExperienciaNoRegladaPK implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Usuario idUsuario;
	
	private LocalDate fechaIni;
	
	private String entidad;
	
	public ExperienciaNoRegladaPK() {
		
	}

	public ExperienciaNoRegladaPK(Usuario idUsuario, LocalDate fechaIni, String entidad) {
		
		this.idUsuario = idUsuario;
		this.fechaIni = fechaIni;
		this.entidad = entidad;
		
	}

}
