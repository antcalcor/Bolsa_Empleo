package pojos.PKCompuesta;

import java.io.Serializable;
import java.time.LocalDate;

import pojos.Colegio;
import pojos.Usuario;

public class EntrevistaPK implements Serializable{

	private static final long serialVersionUID = 1L;

	private Usuario idUsuario;
	
	private Colegio idColegio;
	
	private LocalDate fechEntrevista;
	
	public EntrevistaPK() {
		
	}

	public EntrevistaPK(Usuario idUsuario, Colegio idColegio, LocalDate fechEntrevista) {
		
		this.idUsuario = idUsuario;
		this.idColegio = idColegio;
		this.fechEntrevista = fechEntrevista;
		
	}
	
}
