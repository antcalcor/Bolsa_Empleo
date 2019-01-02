package pojos;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "COLEGIO")
public class Colegio implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_COLEGIO")
	private int idColegio;
	
	@Column(name = "COLEGIO", length = 45)
	private String colegio;
	
	@Column(name = "LOCALIDAD", length = 45)
	private String localidad;
	
	public Colegio() {
		
	}

	public Colegio(int idColegio, String colegio, String localidad) {
		
		this.idColegio = idColegio;
		this.colegio = colegio;
		this.localidad = localidad;
		
	}

	public int getIdColegio() {
		return idColegio;
	}

	public void setIdColegio(int idColegio) {
		this.idColegio = idColegio;
	}

	public String getColegio() {
		return colegio;
	}

	public void setColegio(String colegio) {
		this.colegio = colegio;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	@Override
	public String toString() {
		return "Colegio [idColegio=" + idColegio + ", colegio=" + colegio + ", localidad=" + localidad + "]";
	}

}
