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
		
		LocalDate fecha = LocalDate.of(1987, 03, 20);
		
		//Usuario a = new Usuario("jjj","asdf","asdf","asdf",fecha,"asf");
		
		//manager.persist(a); // insertar usuarios lo hace bien
		
		usuarios = manager.createQuery("FROM Usuario",Usuario.class).getResultList(); // las consultas me dan fallos
		
		transaction.commit();
		
		System.out.println("hay " + usuarios.size() + " empleados");
		
	}
}
