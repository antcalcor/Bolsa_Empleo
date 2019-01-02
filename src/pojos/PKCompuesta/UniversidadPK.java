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

	public Usuario getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}

	public UniversidadLista getIdTitulo() {
		return idTitulo;
	}

	public void setIdTitulo(UniversidadLista idTitulo) {
		this.idTitulo = idTitulo;
	}

	@Override
	public String toString() {
		return "UniversidadPK [idUsuario=" + idUsuario + ", idTitulo=" + idTitulo + "]";
	}
	
}
