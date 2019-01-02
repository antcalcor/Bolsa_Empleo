package pojos;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "EMPLEO_LISTA")
public class EmpleoLista implements	Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_EMPLEO")
	private int idEmpleo;
	
	@Column(name = "EMPLEO")
	private String empleo;
	
	public EmpleoLista() {
		
	}

	public EmpleoLista(int idEmpleo, String empleo) {
		
		this.idEmpleo = idEmpleo;
		this.empleo = empleo;
		
	}

	public int getIdEmpleo() {
		return idEmpleo;
	}

	public void setIdEmpleo(int idEmpleo) {
		this.idEmpleo = idEmpleo;
	}

	public String getEmpleo() {
		return empleo;
	}

	public void setEmpleo(String empleo) {
		this.empleo = empleo;
	}

	@Override
	public String toString() {
		return "EmpleoLista [idEmpleo=" + idEmpleo + ", empleo=" + empleo + "]";
	}

}
