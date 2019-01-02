package pojos;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;

@Entity
@IdClass(pojos.PKCompuesta.ColegioPK.class)
@Table(name = "COLEGIO")
public class Colegio implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "ID_USU")
	private Usuario idUsuario;
	
	@Id
	@OneToOne
	@JoinColumn(name = "ID_COLEGIO")
	private ColegioLista idColegio;
	
	@Column(name = "TIPO_CONTRATO", length = 45)
	@Enumerated(EnumType.STRING)
	private TipoContrato tipoContrato;
	
	@Column(name = "FECH_ALTA")
	private LocalDate fechAlta;
	
	@Column(name = "FECH_BAJA")
	private LocalDate fechBaja;
	
	@Column(name = "OBSERV_PRACTICAS", length = 45)
	@Enumerated(EnumType.STRING)
	private ObservacionPracticas obsPracticas;
	
	public Colegio() {
		
	}

	public Colegio(Usuario idUsuario, ColegioLista idColegio, TipoContrato tipoContrato, LocalDate fechAlta,
			LocalDate fechBaja, ObservacionPracticas obsPracticas) {

		this.idUsuario = idUsuario;
		this.idColegio = idColegio;
		this.tipoContrato = tipoContrato;
		this.fechAlta = fechAlta;
		this.fechBaja = fechBaja;
		this.obsPracticas = obsPracticas;
		
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

	public TipoContrato getTipoContrato() {
		return tipoContrato;
	}

	public void setTipoContrato(TipoContrato tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

	public LocalDate getFechAlta() {
		return fechAlta;
	}

	public void setFechAlta(LocalDate fechAlta) {
		this.fechAlta = fechAlta;
	}

	public LocalDate getFechBaja() {
		return fechBaja;
	}

	public void setFechBaja(LocalDate fechBaja) {
		this.fechBaja = fechBaja;
	}

	public ObservacionPracticas getObsPracticas() {
		return obsPracticas;
	}

	public void setObsPracticas(ObservacionPracticas obsPracticas) {
		this.obsPracticas = obsPracticas;
	}

	@Override
	public String toString() {
		return "Colegio [idUsuario=" + idUsuario.getIdUsuario() + ", idColegio=" + idColegio + ", tipoContrato=" + tipoContrato
				+ ", fechAlta=" + fechAlta + ", fechBaja=" + fechBaja + ", obsPracticas=" + obsPracticas + "]";
	}

}
