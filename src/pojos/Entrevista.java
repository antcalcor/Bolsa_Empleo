package pojos;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;

@Entity
@IdClass(pojos.PKCompuesta.EntrevistaPK.class)
@Table(name = "ENTREVISTAS")
public class Entrevista implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "ID_USU")
	private Usuario idUsuario;
	
	@Id
	@OneToOne
	@JoinColumn(name = "COLEGIO")
	private ColegioLista idColegio;
	
	@Id
	@Column(name = "FECH_ENTREV")
	private LocalDate fechEntrevista;
	
	@Column(name = "ENTREVISTADOR", length = 45)
	private String entrevistardor;
	
	@Column(name = "OBSERVACIONES", length = 45)
	private String observaciones;
	
	public Entrevista() {
		
	}

	public Entrevista(Usuario idUsuario, ColegioLista idColegio, LocalDate fechEntrevista, String entrevistardor,
			String observaciones) {
		
		this.idUsuario = idUsuario;
		this.idColegio = idColegio;
		this.fechEntrevista = fechEntrevista;
		this.entrevistardor = entrevistardor;
		this.observaciones = observaciones;
		
	}

	public Usuario getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}

	public ColegioLista getIdColegio() {
		return idColegio;
	}

	public void setIdColegio(ColegioLista idColegio) {
		this.idColegio = idColegio;
	}

	public LocalDate getFechEntrevista() {
		return fechEntrevista;
	}

	public void setFechEntrevista(LocalDate fechEntrevista) {
		this.fechEntrevista = fechEntrevista;
	}

	public String getEntrevistardor() {
		return entrevistardor;
	}

	public void setEntrevistardor(String entrevistardor) {
		this.entrevistardor = entrevistardor;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Override
	public String toString() {
		return "Entrevista [idUsuario=" + idUsuario.getIdUsuario() + ", idColegio=" + idColegio.getIdColegio() + ", fechEntrevista=" + fechEntrevista
				+ ", entrevistardor=" + entrevistardor + ", observaciones=" + observaciones + "]";
	}

}
