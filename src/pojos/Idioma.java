package pojos;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;

@Entity
@IdClass(pojos.PKCompuesta.IdiomaPK.class)
@Table(name = "IDIOMA")
public class Idioma implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@ManyToOne
	@JoinColumn(name = "ID_USU")
	private Usuario idUsuario;
	
	@Id
	@OneToOne
	@JoinColumn(name = "ID_TIPO")
	private IdiomaTipo idTipo;
	
	@Id
	@OneToOne
	@JoinColumn(name = "ID_NIVEL")
	private IdiomaNivel idNivel;
	
	@Column(name = "ENTIDAD", length = 45)
	private String entidad;
	
	@Column(name = "FECH_FIN")
	private LocalDate fechFin;
	
	public Idioma() {
		
	}

	public Idioma(Usuario idUsuario, IdiomaTipo idTipo, IdiomaNivel idNivel, String entidad, LocalDate fechFin) {
		
		this.idUsuario = idUsuario;
		this.idTipo = idTipo;
		this.idNivel = idNivel;
		this.entidad = entidad;
		this.fechFin = fechFin;
		
	}

	public Usuario getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}

	public IdiomaTipo getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(IdiomaTipo idTipo) {
		this.idTipo = idTipo;
	}

	public IdiomaNivel getIdNivel() {
		return idNivel;
	}

	public void setIdNivel(IdiomaNivel idNivel) {
		this.idNivel = idNivel;
	}

	public String getEntidad() {
		return entidad;
	}

	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}

	public LocalDate getFechFin() {
		return fechFin;
	}

	public void setFechFin(LocalDate fechFin) {
		this.fechFin = fechFin;
	}

	@Override
	public String toString() {
		return "Idioma [idUsuario=" + idUsuario.getIdUsuario() + ", idTipo=" + idTipo + ", idNivel=" + idNivel + ", entidad=" + entidad
				+ ", fechFin=" + fechFin + "]";
	}
	
}
