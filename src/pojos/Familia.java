package pojos;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@IdClass(pojos.PKCompuesta.FamiliaPK.class)
@Table(name = "FAMILIA")
public class Familia implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "ID_USU")
	private Usuario idUsuario;
	
	@Id
	@Column(name = "PARENTESCO", length = 45)
	private String parentesco;
	
	@Id
	@Column(name = "EDAD")
	private int edad;
	
	@Column(name = "PROFESION", length = 45)
	private String profesion;
	
	@Column(name = "SITU_LAB", length = 45)
	private String situ_lab;
	
	public Familia() {
		
	}

	public Familia(Usuario usuario, String parentesco, int edad, String profesion, String situ_lab) {
		this.idUsuario = usuario;
		this.parentesco = parentesco;
		this.edad = edad;
		this.profesion = profesion;
		this.situ_lab = situ_lab;
	}
	
	public Usuario getUsuario() {
		return idUsuario;
	}

	public void setUsuario(Usuario usuario) {
		this.idUsuario = usuario;
	}

	public String getParentesco() {
		return parentesco;
	}

	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public String getSitu_lab() {
		return situ_lab;
	}

	public void setSitu_lab(String situ_lab) {
		this.situ_lab = situ_lab;
	}

	@Override
	public String toString() {
		return "Familia [parentesco=" + parentesco + ", edad=" + edad + ", profesion=" + profesion + ", situ_lab="
				+ situ_lab + ", idUsuario=" + idUsuario.getIdUsuario() + "]";
	}
	
}