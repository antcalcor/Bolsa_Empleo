package pojos;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;

@Entity
@IdClass(pojos.PKCompuesta.MasterPK.class)
@Table(name = "MASTER")
public class Master implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@ManyToOne
	@JoinColumn(name = "ID_USU")
	private Usuario idUsuario;
	
	@Id
	@Column(name = "TITULO_MASTER", length = 45)
	private String tituloMaster;
	
	@Column(name = "FECH_FIN")
	private LocalDate fechFin;
	
	@Column(name = "CENTRO", length = 45)
	private String centro;

}
