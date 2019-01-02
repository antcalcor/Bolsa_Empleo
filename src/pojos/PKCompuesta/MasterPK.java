package pojos.PKCompuesta;

import java.io.Serializable;

import pojos.Usuario;

public class MasterPK implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Usuario idUsuario;
	
	private String tituloMaster;
	
	public MasterPK() {
		
	}

	public MasterPK(Usuario idUsuario, String tituloMaster) {
		
		this.idUsuario = idUsuario;
		this.tituloMaster = tituloMaster;
		
	}
	
}
