package pojos.PKCompuesta;

import java.io.Serializable;

import pojos.Usuario;

public class CursoProfesorPK implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Usuario idUsuario;
	
	private String curso;
	
	public CursoProfesorPK() {
		
	}

	public CursoProfesorPK(Usuario usuario, String curso) {
		
		this.idUsuario = usuario;
		this.curso = curso;
		
	}

}
