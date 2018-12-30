package bolsa_empleo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import pojos.*;

public class Main {
    
	private static EntityManager manager;

	private static EntityManagerFactory emf;
	
	public static void main(String[] args) {
		
		emf = Persistence.createEntityManagerFactory("bolsa_empleo");
		
		manager = emf.createEntityManager();
		
		List<Usuario> usuarios;
		
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		
		Usuario a = new Usuario();
		
		a.setEmail("prueba@gmail.com");
		a.setPassword("1234");
		a.setNombre("Paco");
		a.setApellido1("Gil");
		a.setApellido2("Leon");
		a.setFecha_nac(LocalDate.of(1987, 03, 20));
		Familia b = new Familia();
		
//		b.setIdFamilia(new IdFamilia(a,"hermano",20));
		b.setUsuario(a);
		b.setEdad(20);
		b.setParentesco("hermano");
		a.getFamiliares().add(b);
		manager.persist(a);
//		manager.persist(b);
		Usuario d = manager.find(Usuario.class, 1);
//		Familia c = manager.find(Familia.class, new IdFamilia(d,"hermano",20));
		
//		manager.remove(c);
		
		usuarios = manager.createQuery("FROM Usuario",Usuario.class).getResultList();
		
		transaction.commit();
		
		System.out.println(usuarios.get(0));
		System.out.println("hay " + usuarios.size() + " empleados");
		
	}
}
