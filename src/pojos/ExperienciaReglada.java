package pojos;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;

@Entity
@IdClass(pojos.PKCompuesta.ExperienciaRegladaPK.class)
@Table(name = "EXPER_REGLADA")
public class ExperienciaReglada implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@ManyToOne
	@JoinColumn(name = "ID_USU")
	private Usuario idUsuario;
	
	@Id
	@Column(name = "CENTRO", length = 45)
	private String centro;
	
	@Id
	@Column(name = "FECH_INI")
	private LocalDate fechaIni;
	
	@Column(name = "FUNCION", length = 45)
	private String funcion;
	
	@Column(name = "MATERIA", length = 45)
	private String materia;
	
	@Column(name = "PRACTICAS")
	private boolean practicas;
	
	@Column(name = "FECH_FIN")
	private LocalDate fechaFin;
	
	public ExperienciaReglada() {
		
	}

	public ExperienciaReglada(Usuario idUsuario, String centro, LocalDate fechaIni, String funcion, String materia,
			boolean practicas, LocalDate fechaFin) {
		
		this.idUsuario = idUsuario;
		this.centro = centro;
		this.fechaIni = fechaIni;
		this.funcion = funcion;
		this.materia = materia;
		this.practicas = practicas;
		this.fechaFin = fechaFin;
		
	}

	public Usuario getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getCentro() {
		return centro;
	}

	public void setCentro(String centro) {
		this.centro = centro;
	}

	public LocalDate getFechaIni() {
		return fechaIni;
	}

	public void setFechaIni(LocalDate fechaIni) {
		this.fechaIni = fechaIni;
	}

	public String getFuncion() {
		return funcion;
	}

	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public boolean isPracticas() {
		return practicas;
	}

	public void setPracticas(boolean practicas) {
		this.practicas = practicas;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	@Override
	public String toString() {
		return "ExperienciaReglada [idUsuario=" + idUsuario.getIdUsuario() + ", centro=" + centro + ", fechaIni=" + fechaIni
				+ ", funcion=" + funcion + ", materia=" + materia + ", practicas=" + practicas + ", fechaFin="
				+ fechaFin + "]";
	}
	
}
