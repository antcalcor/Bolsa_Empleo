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

}
