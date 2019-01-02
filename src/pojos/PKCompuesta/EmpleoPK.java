package pojos.PKCompuesta;

import java.io.Serializable;

import pojos.EmpleoLista;
import pojos.Usuario;

public class EmpleoPK implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Usuario idUsuario;
	
	private EmpleoLista idEmpleo;
	
	public EmpleoPK() {
		
	}

	public EmpleoPK(Usuario idUsuario, EmpleoLista idEmpleo) {
		
		this.idUsuario = idUsuario;
		this.idEmpleo = idEmpleo;
		
	}

}
