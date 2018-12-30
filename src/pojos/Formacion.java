package pojos;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name = "FORMACION")
public class Formacion implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@OneToOne
	@JoinColumn(name = "ID_USU")
	private Usuario usuario;
	
	@Column(name = "BACH", length = 45)
	private String bach;
	
	@Column(name = "CENTRO_BACH", length = 45)
	private String centroBach;
	
	@Column(name = "FECH_FIN_BACH")
	private LocalDate fechFinBach;
	
	@Column(name = "CENTRO_SEC", length = 45)
	private String centroSec;
	
	@Column(name = "FECH_FIN_SEC")
	private LocalDate fechFinSec;
	
	@Column(name = "DEIDECA", length = 45)
	private String deideca;
	
	@Column(name = "FECH_FIN_DEIDECA")
	private LocalDate fechFinDeideca;
	
}
