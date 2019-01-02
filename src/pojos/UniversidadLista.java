package pojos;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "UNIVERSIDAD_LISTA")
public class UniversidadLista implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_TITULO")
	private int idTitulo;
	
	@Column(name = "TITULO", length = 45,unique	 = true, nullable = false)
	private String titulo; // no lo he hecho id porque no es necesario y con hibernate se complica 'un poco' si lo pongo
	
	public UniversidadLista(int idLista, String titulo) {
		
		this.idTitulo = idLista;
		this.titulo = titulo;
		
	}

	public int getIdLista() {
		return idTitulo;
	}

	public void setIdLista(int idLista) {
		this.idTitulo = idLista;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "UniversidadLista [idLista=" + idTitulo + ", titulo=" + titulo + "]";
	}

}
