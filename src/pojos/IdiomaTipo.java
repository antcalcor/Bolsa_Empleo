package pojos;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "IDIOMA_TIPO")
public class IdiomaTipo implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_TIPO")
	private int idTipo;
	
	@Column(name = "DESC_TIPO", length = 45)
	private String descTipo;
	
	public IdiomaTipo() {
		
	}

	public IdiomaTipo(int idTipo, String descTipo) {
		
		this.idTipo = idTipo;
		this.descTipo = descTipo;
		
	}

	public int getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}

	public String getDescTipo() {
		return descTipo;
	}

	public void setDescTipo(String descTipo) {
		this.descTipo = descTipo;
	}

	@Override
	public String toString() {
		return "IdiomaTipo [idTipo=" + idTipo + ", descTipo=" + descTipo + "]";
	}
	
}
