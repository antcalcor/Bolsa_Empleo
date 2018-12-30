package bolsa_empleo;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import pojos.*;

public class Main {
    
	private static EntityManager manager;

	private static EntityManagerFactory emf;
	
	private static EntityTransaction t;
	
	public static void main(String[] args) {
		
		emf = Persistence.createEntityManagerFactory("bolsa_empleo");
		
		manager = emf.createEntityManager();
		
		t = manager.getTransaction();
		
		List<Usuario> usuarios;
		
		t.begin();
		
		Usuario a = new Usuario();
		
		a.setEmail("prueba@gmail.com");
		a.setPassword("1234");
		a.setNombre("Paco");
		a.setApellido1("Gil");
		a.setApellido2("Leon");
		a.setFecha_nac(LocalDate.of(1987, 03, 20));
		Familia b = new Familia();
		

		b.setUsuario(a);
		b.setEdad(20);
		b.setParentesco("hermano");
		a.getFamiliares().add(b);
		manager.persist(a); // esta bien la relacion porque al guardar el usuario guarda la familia del arralist en su tabla

		Usuario d = manager.find(Usuario.class, 1);
//		Familia c = manager.find(Familia.class, new IdFamilia(d,"hermano",20));
		
		
		usuarios = manager.createQuery("FROM Usuario",Usuario.class).getResultList();
		
		t.commit();
		manager.close();
		
		System.out.println(usuarios.get(0));
		System.out.println("hay " + usuarios.size() + " empleados");
		
	}
}
