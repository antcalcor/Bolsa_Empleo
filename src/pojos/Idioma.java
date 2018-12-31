package pojos;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;

@Entity
@IdClass(pojos.PKCompuesta.IdiomaPK.class)
@Table(name = "IDIOMA")
public class Idioma implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@ManyToOne
	@JoinColumn(name = "ID_USU")
	private Usuario idUsuario;
	
	@Id
	@OneToOne
	@JoinColumn(name = "ID_TIPO")
	private IdiomaTipo idTipo;
	
	//no se como poner 3pk y cada una relacionada con una tabla, me da fallos por mas que lo intento
	
	@Id
	@OneToOne
	@JoinColumn(name = "ID_NIVEL")//
	private IdiomaNivel idNivel;
	
	@Column(name = "ENTIDAD", length = 45)
	private String entidad;
	
	@Column(name = "FECH_FIN")
	private LocalDate fechFin;
	
}
