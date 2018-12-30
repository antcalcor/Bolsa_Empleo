package pojos.PKCompuesta;

import java.io.Serializable;

import pojos.IdiomaNivel;
import pojos.IdiomaTipo;
import pojos.Usuario;

public class IdiomaPK implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Usuario idUsuario;
	
	private IdiomaTipo idTipo;
	
	private IdiomaNivel idNivel;
	
	public IdiomaPK() {
		
	}

	public IdiomaPK(Usuario idUsuario, IdiomaTipo idTipo, IdiomaNivel idNivel) {
		
		this.idUsuario = idUsuario;
		this.idTipo = idTipo;
		this.idNivel = idNivel;
		
	}

}
