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
	
	@OneToOne
	@JoinColumn(name = "ID_PERMISO") //id_user es este campo lo he modificado para entenderlo mejor
	private Permisos idPermiso;
	
	@Column(name = "ULT_MODIF")
	private LocalDate ult_modif;
	
	@Column(name = "SEG_SOC", length = 45)
	private String seg_soc;
	
	@Column(name = "CUENTA_SEG_SOC", length = 45)
	private String cuenta_seg_soc;
	
	@Column(name = "FECHA_ALTA")
	private LocalDate fech_alta;
	
	@OneToOne
	@JoinColumn(name = "ID_COLEGIO")
	private Colegio idColegio; // no se si esto deberiamos de quitarlo del usuario
	
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
	
	@OneToMany(mappedBy = "idUsuario")
	private List<Idioma> idioma;
	
	@OneToMany(mappedBy = "idUsuario")
	private List<Universidad> universidad;
	
	@OneToMany(mappedBy = "idUsuario")
	private List<Master> master;
	
	@OneToOne(mappedBy = "idUsuario")
	@JoinColumn(name = "ID_USU")
	private Competencias compentencias;
	
	@OneToMany(mappedBy = "idUsuario")
	private List<Empleo> empleo;
	
	@OneToMany(mappedBy = "idUsuario")
	private List<Entrevista> entrevista;
	
	@OneToMany(mappedBy = "idUsuario")
	private List<ExperienciaNoDocente> expNoDocente;
	
	@OneToMany(mappedBy = "idUsuario")
	private List<ExperienciaNoReglada> expNoReglada;
	
	@OneToMany(mappedBy = "idUsuario")
	private List<ExperienciaReglada> expReglada;
	
	@OneToMany(mappedBy = "idUsuario")
	private List<CursoProfesor> cursoProfesor;
	
	@OneToOne(mappedBy = "idUsuario",cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_USU")
	private MateriaProfesor matProfesor;

	public Usuario() {
		
		this.familiares = new ArrayList<Familia>();
		this.idioma = new ArrayList<Idioma>();
		this.universidad = new ArrayList<Universidad>();
		this.master = new ArrayList<Master>();
		this.empleo = new ArrayList<Empleo>();
		this.entrevista = new ArrayList<Entrevista>();
		this.expNoDocente = new ArrayList<ExperienciaNoDocente>();
		this.expNoReglada = new ArrayList<ExperienciaNoReglada>();
		this.expReglada = new ArrayList<ExperienciaReglada>();
		this.cursoProfesor = new ArrayList<CursoProfesor>();
		
	}

	public Usuario(int idUsuario, String dni, String password, String nombre, String apellido1, String apellido2,
			String direccion, String localidad, int cp, String provincia, int telef, int movil, String email,
			String estado, LocalDate fecha_nac, Permisos idPermiso, LocalDate ult_modif, String seg_soc,
			String cuenta_seg_soc, LocalDate fech_alta, Colegio idColegio, String foto, String cv, boolean elegido,
			List<Familia> familiares, Formacion formacion, List<Idioma> idioma, List<Universidad> universidad,
			List<Master> master, Competencias compentencias, List<Empleo> empleo, List<Entrevista> entrevista,
			List<ExperienciaNoDocente> expNoDocente, List<ExperienciaNoReglada> expNoReglada,
			List<ExperienciaReglada> expReglada, List<CursoProfesor> cursoProfesor, MateriaProfesor matProfesor) {
		
		this.idUsuario = idUsuario;
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
		this.idPermiso = idPermiso;
		this.ult_modif = ult_modif;
		this.seg_soc = seg_soc;
		this.cuenta_seg_soc = cuenta_seg_soc;
		this.fech_alta = fech_alta;
		this.idColegio = idColegio;
		this.foto = foto;
		this.cv = cv;
		this.elegido = elegido;
		this.familiares = familiares;
		this.formacion = formacion;
		this.idioma = idioma;
		this.universidad = universidad;
		this.master = master;
		this.compentencias = compentencias;
		this.empleo = empleo;
		this.entrevista = entrevista;
		this.expNoDocente = expNoDocente;
		this.expNoReglada = expNoReglada;
		this.expReglada = expReglada;
		this.cursoProfesor = cursoProfesor;
		this.matProfesor = matProfesor;
		
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
	
	public Permisos getIdPermiso() {
		return idPermiso;
	}

	public void setIdPermiso(Permisos idPermiso) {
		this.idPermiso = idPermiso;
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

	public Formacion getFormacion() {
		return formacion;
	}

	public void setFormacion(Formacion formacion) {
		this.formacion = formacion;
	}

	public List<Idioma> getIdioma() {
		return idioma;
	}

	public void setIdioma(List<Idioma> idioma) {
		this.idioma = idioma;
	}

	public List<Universidad> getUniversidad() {
		return universidad;
	}

	public void setUniversidad(List<Universidad> universidad) {
		this.universidad = universidad;
	}

	public List<Master> getMaster() {
		return master;
	}

	public void setMaster(List<Master> master) {
		this.master = master;
	}

	public Colegio getIdColegio() {
		return idColegio;
	}

	public void setIdColegio(Colegio idColegio) {
		this.idColegio = idColegio;
	}

	public Competencias getCompentencias() {
		return compentencias;
	}

	public void setCompentencias(Competencias compentencias) {
		this.compentencias = compentencias;
	}

	public List<Empleo> getEmpleo() {
		return empleo;
	}

	public void setEmpleo(List<Empleo> empleo) {
		this.empleo = empleo;
	}

	public List<Entrevista> getEntrevista() {
		return entrevista;
	}

	public void setEntrevista(List<Entrevista> entrevista) {
		this.entrevista = entrevista;
	}

	public List<ExperienciaNoDocente> getExpNoDocente() {
		return expNoDocente;
	}

	public void setExpNoDocente(List<ExperienciaNoDocente> expNoDocente) {
		this.expNoDocente = expNoDocente;
	}

	public List<ExperienciaNoReglada> getExpNoReglada() {
		return expNoReglada;
	}

	public void setExpNoReglada(List<ExperienciaNoReglada> expNoReglada) {
		this.expNoReglada = expNoReglada;
	}

	public List<ExperienciaReglada> getExpReglada() {
		return expReglada;
	}

	public void setExpReglada(List<ExperienciaReglada> expReglada) {
		this.expReglada = expReglada;
	}

	public List<CursoProfesor> getCursoProfesor() {
		return cursoProfesor;
	}

	public void setCursoProfesor(List<CursoProfesor> cursoProfesor) {
		this.cursoProfesor = cursoProfesor;
	}

	public MateriaProfesor getMatProfesor() {
		return matProfesor;
	}

	public void setMatProfesor(MateriaProfesor matProfesor) {
		this.matProfesor = matProfesor;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", dni=" + dni + ", password=" + password + ", nombre=" + nombre
				+ ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", direccion=" + direccion + ", localidad="
				+ localidad + ", cp=" + cp + ", provincia=" + provincia + ", telef=" + telef + ", movil=" + movil
				+ ", email=" + email + ", estado=" + estado + ", fecha_nac=" + fecha_nac + ", idPermiso=" + idPermiso
				+ ", ult_modif=" + ult_modif + ", seg_soc=" + seg_soc + ", cuenta_seg_soc=" + cuenta_seg_soc
				+ ", fech_alta=" + fech_alta + ", idColegio=" + idColegio + ", foto=" + foto + ", cv=" + cv
				+ ", elegido=" + elegido + ", familiares=" + familiares + ", formacion=" + formacion + ", idioma="
				+ idioma + ", universidad=" + universidad + ", master=" + master + ", compentencias=" + compentencias
				+ ", empleo=" + empleo + ", entrevista=" + entrevista + ", expNoDocente=" + expNoDocente
				+ ", expNoReglada=" + expNoReglada + ", expReglada=" + expReglada + ", cursoProfesor=" + cursoProfesor
				+ ", matProfesor=" + matProfesor + "]";
	}

}
