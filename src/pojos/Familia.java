package pojos;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "familia")
public class Familia implements Serializable{
	
	private static final long serialVersionUID = 1L;

//	@Id
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "id")
//	private Usuario id;
//	
//	@Id
//	@Column(name = "parentesco", length = 100)
//	private String parentesco;
//	
//	@Id
//	@Column(name = "edad")
//	private int edad;
	
	@EmbeddedId
	private IdFamilia id;
	
	@Column(name = "profesion")
	private String profesion;
	
	@Column(name = "situ_lab")
	private String situ_lab;
	
	public Familia() {
		
	}

	public Familia(IdFamilia id, String profesion, String situ_lab) {
		
//		this.id = id;
//		this.parentesco = parentesco;
//		this.edad = edad;
		this.id = id;
		this.profesion = profesion;
		this.situ_lab = situ_lab;
		
	}

//	public Usuario getId() {
//		return id;
//	}
//
//	public void setId(Usuario id) {
//		this.id = id;
//	}
//
//	public String getParentesco() {
//		return parentesco;
//	}
//
//	public void setParentesco(String parentesco) {
//		this.parentesco = parentesco;
//	}
//
//	public int getEdad() {
//		return edad;
//	}
//
//	public void setEdad(int edad) {
//		this.edad = edad;
//	}
	public IdFamilia getIdFamilia() {
		return id;
	}
	
	public void setIdFamilia(IdFamilia id) {
		this.id = id;
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

}