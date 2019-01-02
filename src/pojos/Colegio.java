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
	
	public Colegio() {
		
	}

	public Colegio(int idColegio, String colegio) {
		
		this.idColegio = idColegio;
		this.colegio = colegio;
		
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

	@Override
	public String toString() {
		return "Colegio [idColegio=" + idColegio + ", colegio=" + colegio + "]";
	}

}
