package pojos;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;

@Entity
@IdClass(pojos.PKCompuesta.UniversidadPK.class)
@Table(name = "UNIVERSIDAD")
public class Universidad implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "ID_USU")
	private Usuario idUsuario;
	
	@Id
	@OneToOne
	@JoinColumn(name = "ID_TITULO")
	private UniversidadLista idTitulo;
	
	@Column(name = "UNIVERSIDAD", length = 45)
	private String universidad;
	
	@Column(name = "FECH_FIN")
	private LocalDate fechFin;
	
	public Universidad() {
		
	}

	public Universidad(Usuario idUsuario, UniversidadLista idTitulo, String universidad, LocalDate fechFin) {
		
		this.idUsuario = idUsuario;
		this.idTitulo = idTitulo;
		this.universidad = universidad;
		this.fechFin = fechFin;
		
	}

	public Usuario getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}

	public UniversidadLista getIdTitulo() {
		return idTitulo;
	}

	public void setIdTitulo(UniversidadLista idTitulo) {
		this.idTitulo = idTitulo;
	}

	public String getUniversidad() {
		return universidad;
	}

	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}

	public LocalDate getFechFin() {
		return fechFin;
	}

	public void setFechFin(LocalDate fechFin) {
		this.fechFin = fechFin;
	}

	@Override
	public String toString() {
		return "Universidad [idUsuario=" + idUsuario.getIdUsuario() + ", idTitulo=" + idTitulo + ", universidad=" + universidad
				+ ", fechFin=" + fechFin + "]";
	}

}
