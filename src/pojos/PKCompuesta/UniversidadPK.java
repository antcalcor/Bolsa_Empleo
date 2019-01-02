package pojos.PKCompuesta;

import java.io.Serializable;

import pojos.UniversidadLista;
import pojos.Usuario;

public class UniversidadPK implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Usuario idUsuario;
	
	private UniversidadLista idTitulo;
	
	public UniversidadPK() {
		
	}

	public UniversidadPK(Usuario idUsuario, UniversidadLista idTitulo) {
		
		this.idUsuario = idUsuario;
		this.idTitulo = idTitulo;
		
	}

}
