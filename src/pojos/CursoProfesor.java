package pojos;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;

@Entity
@IdClass(pojos.PKCompuesta.CursoProfesorPK.class)
@Table(name = "CURSO_PROFESOR")
public class CursoProfesor implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@ManyToOne
	@JoinColumn(name = "ID_USU")
	private Usuario idUsuario;
	
	@Id
	@Column(name = "CURSO", length = 45)
	private String curso;
	
	@Column(name = "FECH_FIN")
	private LocalDate fechaFin;
	
	@Column(name = "INSPECTORIA")
	private boolean inspectoria;
	
	public CursoProfesor() {
		
	}

	public CursoProfesor(Usuario idUsuario, String curso, LocalDate fechaFin, boolean inspectoria) {
		
		this.idUsuario = idUsuario;
		this.curso = curso;
		this.fechaFin = fechaFin;
		this.inspectoria = inspectoria;
		
	}

	public Usuario getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public boolean isInspectoria() {
		return inspectoria;
	}

	public void setInspectoria(boolean inspectoria) {
		this.inspectoria = inspectoria;
	}

	@Override
	public String toString() {
		return "CursoProfesor [idUsuario=" + idUsuario.getIdUsuario() + ", curso=" + curso + ", fechaFin=" + fechaFin
				+ ", inspectoria=" + inspectoria + "]";
	}
	
}
