package pojos;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "FP_LISTA")
public class FpLista implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_FP")
	private int idLista;
	
	@Column(name = "TITULO", length = 45, unique = true, nullable = false)
	private String titulo;// no lo he hecho id porque no es necesario y con hibernate se complica un poco si lo pongo

	public FpLista() {
		
	}

	public FpLista(int idFp, String titulo) {
		
		this.idLista = idFp;
		this.titulo = titulo;
		
	}

	public int getIdFp() {
		return idLista;
	}

	public void setIdFp(int idFp) {
		this.idLista = idFp;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "FpLista [idFp=" + idLista + ", titulo=" + titulo + "]";
	}
	
}
