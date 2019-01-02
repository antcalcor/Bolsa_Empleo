package pojos;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "COMPETENCIAS")
public class Competencias implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@OneToOne
	@JoinColumn(name = "ID_USU")
	private Usuario idUsuario;
	
	@Column(name = "COMP_1")
	private boolean comp1;
	
	@Column(name = "COMP_2")
	private boolean comp2;
	
	@Column(name = "COMP_3")
	private boolean comp3;
	
	@Column(name = "COMP_4")
	private boolean comp4;
	
	@Column(name = "COMP_5")
	private boolean comp5;
	
	@Column(name = "COMP_6")
	private boolean comp6;
	
	public Competencias() {
		
	}

	public Competencias(Usuario idUsuario, boolean comp1, boolean comp2, boolean comp3, boolean comp4, boolean comp5,
			boolean comp6) {
		
		this.idUsuario = idUsuario;
		this.comp1 = comp1;
		this.comp2 = comp2;
		this.comp3 = comp3;
		this.comp4 = comp4;
		this.comp5 = comp5;
		this.comp6 = comp6;
		
	}

	public Usuario getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}

	public boolean isComp1() {
		return comp1;
	}

	public void setComp1(boolean comp1) {
		this.comp1 = comp1;
	}

	public boolean isComp2() {
		return comp2;
	}

	public void setComp2(boolean comp2) {
		this.comp2 = comp2;
	}

	public boolean isComp3() {
		return comp3;
	}

	public void setComp3(boolean comp3) {
		this.comp3 = comp3;
	}

	public boolean isComp4() {
		return comp4;
	}

	public void setComp4(boolean comp4) {
		this.comp4 = comp4;
	}

	public boolean isComp5() {
		return comp5;
	}

	public void setComp5(boolean comp5) {
		this.comp5 = comp5;
	}

	public boolean isComp6() {
		return comp6;
	}

	public void setComp6(boolean comp6) {
		this.comp6 = comp6;
	}

	@Override
	public String toString() {
		return "Competencias [idUsuario=" + idUsuario.getIdUsuario() + ", comp1=" + comp1 + ", comp2=" + comp2 + ", comp3=" + comp3
				+ ", comp4=" + comp4 + ", comp5=" + comp5 + ", comp6=" + comp6 + "]";
	}

}
