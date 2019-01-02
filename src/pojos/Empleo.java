package pojos;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@IdClass(pojos.PKCompuesta.EmpleoPK.class)
@Table(name = "EMPLEO")
public class Empleo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "ID_USU")
	private Usuario idUsuario;
	
	@Id
	@OneToOne
	@JoinColumn(name = "ID_EMPLEO")
	private EmpleoLista idEmpleo;
	
	public Empleo() {
		
	}

	public Empleo(Usuario idUsuario, EmpleoLista idEmpleo) {
		
		this.idUsuario = idUsuario;
		this.idEmpleo = idEmpleo;
		
	}

	public Usuario getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}

	public EmpleoLista getIdEmpleo() {
		return idEmpleo;
	}

	public void setIdEmpleo(EmpleoLista idEmpleo) {
		this.idEmpleo = idEmpleo;
	}

	@Override
	public String toString() {
		return "Empleo [idUsuario=" + idUsuario.getIdUsuario() + ", idEmpleo=" + idEmpleo + "]";
	}

}
