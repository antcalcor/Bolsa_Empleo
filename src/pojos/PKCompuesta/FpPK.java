package pojos.PKCompuesta;

import java.io.Serializable;

import pojos.FpLista;
import pojos.Usuario;

public class FpPK implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Usuario idUsuario;
	
	private FpLista idFp;
	
	public FpPK() {
		
	}

	public FpPK(Usuario idUsuario, FpLista idFp) {
		
		this.idUsuario = idUsuario;
		this.idFp = idFp;
		
	}

}
