package pojos;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;

@Entity
@IdClass(pojos.PKCompuesta.ExperienciaNoRegladaPK.class)
@Table(name = "EXPER_NO_REGLADA")
public class ExperienciaNoReglada implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "ID_USU")
	private Usuario idUsuario;
	
	@Id
	@Column(name = "FECH_INI")
	private LocalDate fechaIni;
	
	@Id
	@Column(name = "ENTIDAD", length = 45)
	private String entidad;
	
	@Column(name = "FUNCION", length = 45)
	private String funcion;
	
	@Column(name = "FECH_FIN")
	private LocalDate fechaFin;
	
	public ExperienciaNoReglada() {
		
	}

	public ExperienciaNoReglada(Usuario idUsuario, LocalDate fechaIni, String entidad, String funcion,
			LocalDate fechaFin) {
		
		this.idUsuario = idUsuario;
		this.fechaIni = fechaIni;
		this.entidad = entidad;
		this.funcion = funcion;
		this.fechaFin = fechaFin;
		
	}

	public Usuario getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}

	public LocalDate getFechaIni() {
		return fechaIni;
	}

	public void setFechaIni(LocalDate fechaIni) {
		this.fechaIni = fechaIni;
	}

	public String getEntidad() {
		return entidad;
	}

	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}

	public String getFuncion() {
		return funcion;
	}

	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	@Override
	public String toString() {
		return "ExperienciaNoReglada [idUsuario=" + idUsuario.getIdUsuario() + ", fechaIni=" + fechaIni + ", entidad=" + entidad
				+ ", funcion=" + funcion + ", fechaFin=" + fechaFin + "]";
	}

}
