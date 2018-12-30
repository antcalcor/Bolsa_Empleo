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
	private Usuario idUsuario;
	
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

	public Formacion() {
		
	}
	
	public Formacion(Usuario idUsuario, String bach, String centroBach, LocalDate fechFinBach, String centroSec,
			LocalDate fechFinSec, String deideca, LocalDate fechFinDeideca) {
		
		this.idUsuario = idUsuario;
		this.bach = bach;
		this.centroBach = centroBach;
		this.fechFinBach = fechFinBach;
		this.centroSec = centroSec;
		this.fechFinSec = fechFinSec;
		this.deideca = deideca;
		this.fechFinDeideca = fechFinDeideca;
		
	}

	public String getBach() {
		return bach;
	}

	public void setBach(String bach) {
		this.bach = bach;
	}

	public String getCentroBach() {
		return centroBach;
	}

	public void setCentroBach(String centroBach) {
		this.centroBach = centroBach;
	}

	public LocalDate getFechFinBach() {
		return fechFinBach;
	}

	public void setFechFinBach(LocalDate fechFinBach) {
		this.fechFinBach = fechFinBach;
	}

	public String getCentroSec() {
		return centroSec;
	}

	public void setCentroSec(String centroSec) {
		this.centroSec = centroSec;
	}

	public LocalDate getFechFinSec() {
		return fechFinSec;
	}

	public void setFechFinSec(LocalDate fechFinSec) {
		this.fechFinSec = fechFinSec;
	}

	public String getDeideca() {
		return deideca;
	}

	public void setDeideca(String deideca) {
		this.deideca = deideca;
	}

	public LocalDate getFechFinDeideca() {
		return fechFinDeideca;
	}

	public void setFechFinDeideca(LocalDate fechFinDeideca) {
		this.fechFinDeideca = fechFinDeideca;
	}

	public Usuario getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}

	@Override
	public String toString() {
		return "Formacion [bach=" + bach + ", centroBach=" + centroBach + ", fechFinBach=" + fechFinBach
				+ ", centroSec=" + centroSec + ", fechFinSec=" + fechFinSec + ", deideca=" + deideca
				+ ", fechFinDeideca=" + fechFinDeideca + ", idUsuario=" + idUsuario.getIdUsuario() + "]";
	}
	
}
