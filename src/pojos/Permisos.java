package pojos;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "PERMISOS")
public class Permisos implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PERMISO")
	private int idPermiso;
	
	@Column(name = "DESCRIPCION")
	private String descripcion;

	public Permisos() {
		
	}
	
	public Permisos(int idPermiso, String descripcion) {
		
		this.idPermiso = idPermiso;
		this.descripcion = descripcion;
		
	}

	public int getIdPermiso() {
		return idPermiso;
	}

	public void setIdPermiso(int idPermiso) {
		this.idPermiso = idPermiso;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Permisos [idPermiso=" + idPermiso + ", descripcion=" + descripcion + "]";
	}

}
