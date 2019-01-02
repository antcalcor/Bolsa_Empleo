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

	public Master() {
		
	}

	public Master(Usuario idUsuario, String tituloMaster, LocalDate fechFin, String centro) {
		
		this.idUsuario = idUsuario;
		this.tituloMaster = tituloMaster;
		this.fechFin = fechFin;
		this.centro = centro;
		
	}

	public Usuario getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getTituloMaster() {
		return tituloMaster;
	}

	public void setTituloMaster(String tituloMaster) {
		this.tituloMaster = tituloMaster;
	}

	public LocalDate getFechFin() {
		return fechFin;
	}

	public void setFechFin(LocalDate fechFin) {
		this.fechFin = fechFin;
	}

	public String getCentro() {
		return centro;
	}

	public void setCentro(String centro) {
		this.centro = centro;
	}

	@Override
	public String toString() {
		return "Master [idUsuario=" + idUsuario.getIdUsuario() + ", tituloMaster=" + tituloMaster + ", fechFin=" + fechFin
				+ ", centro=" + centro + "]";
	}
	
}
