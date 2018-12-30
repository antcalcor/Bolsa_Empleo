package pojos;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

@Entity
//@IdClass(pojos.PKCompuesta.IdiomaPK.class)
@Table(name = "IDIOMA")
public class Idioma implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@OneToOne
	@JoinColumn(name = "ID_USU")
	private Usuario idUsuario;
	
//	@Id
//	@OneToMany(mappedBy = "idioma")
//	@JoinColumn(name = "ID_TIPO")
//	private List<IdiomaTipo> Tipo;
//	
//	@Id
//	@OneToMany(mappedBy = "idioma")
//	@JoinColumn(name = "ID_NIVEL")
//	private List<IdiomaNivel> Nivel;
	
	@Column(name = "ENTIDAD")
	private String entidad;
	
	@Column(name = "FECH_FIN")
	private LocalDate fechFin;
	
}
