package pojos;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idUsuario")
	private int idUsuario;

	@Column(name = "dni", length = 45)
	private String dni;
	
	@Column(name = "password", length = 45)
	private String password;

	@Column(name ="nombre", length = 45)
	private String nombre;
	
	@Column(name = "apellido1", length = 45)
	private String apellido1;
	
	@Column(name = "apellido2", length = 45)
	private String apellido2;
	
	@Column(name = "direccion", length = 45)
	private String direccion;
	
	@Column(name = "localidad", length = 45)
	private String localidad;
	
	@Column(name = "cp")
	private int cp;
	
	@Column(name = "provincia", length = 45)
	private String provincia;
	
	@Column(name = "telef")
	private int telef;
	
	@Column(name = "movil")
	private int movil;

	@Column(name = "email", length = 45, unique = true)
	private String email;
	
	@Column(name = "estado", length = 45)
	private String estado;

	@Column(name = "fecha_nac")
	@Temporal(TemporalType.DATE)
	private LocalDate fecha_nac;
	
	@Column(name = "idUser")
	private int idUser;
	
	@Column(name = "ult_modif")
	@Temporal(TemporalType.DATE)
	private LocalDate ult_modif;
	
	@Column(name = "seg_soc", length = 45)
	private String seg_soc;
	
	@Column(name = "cuenta_seg_soc", length = 45)
	private String cuenta_seg_soc;
	
	@Column(name = "fech_alta")
	@Temporal(TemporalType.DATE)
	private LocalDate fech_alta;
	
	@Column(name = "foto", length = 45)
	private String foto;
	
	@Column(name = "cv", length = 45)
	private String cv;
	
	@Column(name = "elegido")
	private boolean elegido = false;
	
	//-----------------------------------------------------
	
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
	private List<Familia> familiares;

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
		return "Usuario:\nid: " + idUsuario + "\ndni: " + dni + "\npassword: " + password + "\nnombre: " + nombre + "\napellido1: "
				+ apellido1 + "\napellido2: " + apellido2 + "\ndireccion: " + direccion + "\nlocalidad: " + localidad
				+ "\ncp: " + cp + "\nprovincia: " + provincia + "\ntelef: " + telef + "\nmovil: " + movil + "\nemail: "
				+ email + "\nestado: " + estado + "\nfecha_nac: " + fecha_nac + "\nult_modif: "
				+ ult_modif + "\nseg_soc: " + seg_soc + "\ncuenta_seg_soc: " + cuenta_seg_soc + "\nfech_alta: " + fech_alta
				+ "\nfoto: " + foto + "\ncv: " + cv + "\nelegido: " + elegido;
	}

}
