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
	
}
