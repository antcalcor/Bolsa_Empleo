package pojos;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "USUARIO")
public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_USU")
	private int idUsuario;

	@Column(name = "DNI", length = 45)
	private String dni;
	
	@Column(name = "PASS", length = 45)
	private String password;

	@Column(name ="NOMBRE", length = 45)
	private String nombre;
	
	@Column(name = "APELL1", length = 45)
	private String apellido1;
	
	@Column(name = "APELL2", length = 45)
	private String apellido2;
	
	@Column(name = "DIREC", length = 45)
	private String direccion;
	
	@Column(name = "LOCALIDAD", length = 45)
	private String localidad;
	
	@Column(name = "COD_POST")
	private int cp;
	
	@Column(name = "PROVINCIA", length = 45)
	private String provincia;
	
	@Column(name = "TELEF")
	private int telef;
	
	@Column(name = "MOVIL")
	private int movil;

	@Column(name = "EMAIL", length = 45, unique = true)
	private String email;
	
	@Column(name = "ESTADO", length = 45)
	private String estado;

	@Column(name = "FECHA_NAC")
	private LocalDate fecha_nac;
	
	@Column(name = "ID_USER")
	private int idUser;
	
	@Column(name = "ULT_MODIF")
	private LocalDate ult_modif;
	
	@Column(name = "SEG_SOC", length = 45)
	private String seg_soc;
	
	@Column(name = "CUENTA_SEG_SOC", length = 45)
	private String cuenta_seg_soc;
	
	@Column(name = "FECHA_ALTA")
	private LocalDate fech_alta;
	
	@Column(name = "FOTO", length = 45)
	private String foto;
	
	@Column(name = "CV", length = 45)
	private String cv;
	
	@Column(name = "ELEGIDO")
	private boolean elegido = false;
	
	//-----------------------------------------------------
	
	@OneToMany(mappedBy = "idUsuario", cascade = CascadeType.ALL)
	private List<Familia> familiares;
	
	@OneToOne(mappedBy = "idUsuario", cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_USU")
	private Formacion formacion;
	
	@OneToOne(mappedBy = "idUsuario")
	@JoinColumn(name = "ID_USU")
	private Idioma idioma;

	public Usuario() {
		this.familiares = new ArrayList<Familia>();
	}
	
	public Usuario(String dni, String password, String nombre, String apellido1, String apellido2, String direccion,
			String localidad, int cp, String provincia, int telef, int movil, String email, String estado,
			LocalDate fecha_nac, String seg_soc, String cuenta_seg_soc, LocalDate fech_alta, String foto, String cv) {
		
		this.dni = dni;
		this.password = password;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.direccion = direccion;
		this.localidad = localidad;
		this.cp = cp;
		this.provincia = provincia;
		this.telef = telef;
		this.movil = movil;
		this.email = email;
		this.estado = estado;
		this.fecha_nac = fecha_nac;
		this.seg_soc = seg_soc;
		this.cuenta_seg_soc = cuenta_seg_soc;
		this.fech_alta = fech_alta;
		this.foto = foto;
		this.cv = cv;
		this.familiares = new ArrayList<Familia>();
		
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int id) {
		this.idUsuario = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public int getTelef() {
		return telef;
	}

	public void setTelef(int telef) {
		this.telef = telef;
	}

	public int getMovil() {
		return movil;
	}

	public void setMovil(int movil) {
		this.movil = movil;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public LocalDate getFecha_nac() {
		return fecha_nac;
	}

	public void setFecha_nac(LocalDate fecha_nac) {
		this.fecha_nac = fecha_nac;
	}
	
	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public LocalDate getUlt_modif() {
		return ult_modif;
	}

	public void setUlt_modif(LocalDate ult_modif) {
		this.ult_modif = ult_modif;
	}

	public String getSeg_soc() {
		return seg_soc;
	}

	public void setSeg_soc(String seg_soc) {
		this.seg_soc = seg_soc;
	}

	public String getCuenta_seg_soc() {
		return cuenta_seg_soc;
	}

	public void setCuenta_seg_soc(String cuenta_seg_soc) {
		this.cuenta_seg_soc = cuenta_seg_soc;
	}

	public LocalDate getFech_alta() {
		return fech_alta;
	}

	public void setFech_alta(LocalDate fech_alta) {
		this.fech_alta = fech_alta;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getCv() {
		return cv;
	}

	public void setCv(String cv) {
		this.cv = cv;
	}

	public boolean isElegido() {
		return elegido;
	}

	public void setElegido(boolean elegido) {
		this.elegido = elegido;
	}
	
	public List<Familia> getFamiliares() {
		return familiares;
	}
	
	public void setFamiliares(List<Familia> familiares) {
		this.familiares = familiares;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", dni=" + dni + ", password=" + password + ", nombre=" + nombre
				+ ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", direccion=" + direccion + ", localidad="
				+ localidad + ", cp=" + cp + ", provincia=" + provincia + ", telef=" + telef + ", movil=" + movil
				+ ", email=" + email + ", estado=" + estado + ", fecha_nac=" + fecha_nac + ", idUser=" + idUser
				+ ", ult_modif=" + ult_modif + ", seg_soc=" + seg_soc + ", cuenta_seg_soc=" + cuenta_seg_soc
				+ ", fech_alta=" + fech_alta + ", foto=" + foto + ", cv=" + cv + ", elegido=" + elegido
				+ ", familiares=" + familiares + ", formacion=" + formacion + "]";
	}

}
