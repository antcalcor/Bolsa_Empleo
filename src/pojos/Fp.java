package pojos;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;

@Entity
@IdClass(pojos.PKCompuesta.FpPK.class)
@Table(name = "FP")
public class Fp implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "ID_USU")
	private Usuario idUsuario;
	
	@Id
	@OneToOne
	@JoinColumn(name = "ID_FP")
	private FpLista idFp;
	
	@Column(name = "CENTRO")
	private String centro;
	
	@Column(name = "FECH_FIN")
	private LocalDate fechFin;
	
	public Fp() {
		
	}

	public Fp(Usuario idUsuario, FpLista idFp, String centro, LocalDate fechFin) {
		
		this.idUsuario = idUsuario;
		this.idFp = idFp;
		this.centro = centro;
		this.fechFin = fechFin;
		
	}

	public Usuario getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}

	public FpLista getIdFp() {
		return idFp;
	}

	public void setIdFp(FpLista idFp) {
		this.idFp = idFp;
	}

	public String getCentro() {
		return centro;
	}

	public void setCentro(String centro) {
		this.centro = centro;
	}

	public LocalDate getFechFin() {
		return fechFin;
	}

	public void setFechFin(LocalDate fechFin) {
		this.fechFin = fechFin;
	}

	@Override
	public String toString() {
		return "Fp [idUsuario=" + idUsuario + ", idFp=" + idFp + ", centro=" + centro + ", fechFin=" + fechFin + "]";
	}

}
