package pojos;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "MATERIA_PROFESOR")
public class MateriaProfesor implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@OneToOne
	@JoinColumn(name = "ID_USU")
	private Usuario idUsuario;
	
	@Column(name = "CARGO_MAT", length = 45)
	private String cargoMat;
	
	@Column(name = "CURSO", length = 45)
	private String curso;
	
	@Column(name = "ETAPA", length = 45)
	private String etapa;
	
	@Column(name = "HORAS")
	private int horas;
	
	public MateriaProfesor() {
		
	}

	public MateriaProfesor(Usuario idUsuario, String cargoMat, String curso, String etapa, int horas) {
		
		this.idUsuario = idUsuario;
		this.cargoMat = cargoMat;
		this.curso = curso;
		this.etapa = etapa;
		this.horas = horas;
		
	}

	public Usuario getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getCargoMat() {
		return cargoMat;
	}

	public void setCargoMat(String cargoMat) {
		this.cargoMat = cargoMat;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getEtapa() {
		return etapa;
	}

	public void setEtapa(String etapa) {
		this.etapa = etapa;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	@Override
	public String toString() {
		return "MateriaProfesor [idUsuario=" + idUsuario.getIdUsuario() + ", cargoMat=" + cargoMat + ", curso=" + curso + ", etapa="
				+ etapa + ", horas=" + horas + "]";
	}

}
