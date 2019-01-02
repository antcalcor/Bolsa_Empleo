package pojos;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "IDIOMA_NIVEL")
public class IdiomaNivel implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_NIVEL")
	private int idNivel;
	
	@Column(name = "DESC_NIVEL", length = 45)
	private String descNivel;

	public IdiomaNivel() {
		
	}

	public IdiomaNivel(int idNivel, String descNivel) {
		
		this.idNivel = idNivel;
		this.descNivel = descNivel;
		
	}

	public int getIdNivel() {
		return idNivel;
	}

	public void setIdNivel(int idNivel) {
		this.idNivel = idNivel;
	}

	public String getDescNivel() {
		return descNivel;
	}

	public void setDescNivel(String descNivel) {
		this.descNivel = descNivel;
	}

	@Override
	public String toString() {
		return "IdiomaNivel [idNivel=" + idNivel + ", descNivel=" + descNivel + "]";
	}
	
}
