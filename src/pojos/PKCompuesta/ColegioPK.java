package pojos.PKCompuesta;

import java.io.Serializable;

import pojos.ColegioLista;
import pojos.Usuario;

public class ColegioPK implements Serializable{

	private static final long serialVersionUID = 1L;

	private Usuario idUsuario;
	
	private ColegioLista idColegio;
	
	public ColegioPK() {
		
	}

	public ColegioPK(Usuario idUsuario, ColegioLista idColegio) {
		
		this.idUsuario = idUsuario;
		this.idColegio = idColegio;
		
	}
	
}
