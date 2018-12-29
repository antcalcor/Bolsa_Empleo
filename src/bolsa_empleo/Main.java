package bolsa_empleo;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import pojos.Usuario;

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
		
		manager.persist(a);
		
		usuarios = manager.createQuery("FROM Usuario",Usuario.class).getResultList();
		
		transaction.commit();
		
		System.out.println(usuarios.get(0));
		System.out.println("hay " + usuarios.size() + " empleados");
		
	}
}
