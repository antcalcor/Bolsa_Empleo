package pojos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "usuario")
public class Usuario implements Serializable{
	
	@Id
	@Column(name = "dni")
	private String dni;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellido1")
	private String apellido1;
	
	@Column(name = "apellido2")
	private String apellido2;
	
	@Column(name = "fecha_nac")
	private String fecha_nac;
	
	@Column(name = "email")
	private String email;
	
	public Usuario() {
	}
	
	public Usuario (String dni, String nombre, String ape1, String ape2, String fech, String email) {
		this.dni = dni;
		this.nombre = nombre;
		apellido1 = ape1;
		apellido2 = ape2;
		fecha_nac = fech;
		this.email = email;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido1() {
		return apellido1;
	}
	
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	
	public String getApellido2() {
		return apellido2;
	}
	
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	
	public String getFecha_nac() {
		return fecha_nac;
	}
	
	public void setFecha_nac(String fecha_nac) {
		this.fecha_nac = fecha_nac;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Usuario :\n D.N.I: " + dni + "\nNombre: " + nombre + " " + apellido1 + " " + apellido2 
				+ "\nFecha Nacimiento: " + fecha_nac	+ "\nEmail: " + email;
	}

}