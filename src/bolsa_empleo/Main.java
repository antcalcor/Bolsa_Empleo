package bolsa_empleo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import pojos.Usuario;

public class Main {
    
	private static EntityManager manager;

	private static EntityManagerFactory emf;
	
	public static void main(String[] args) {
		
		emf = Persistence.createEntityManagerFactory("bolsa_empleo");
		
		manager = emf.createEntityManager();
		
		List<Usuario> usuarios = (List<Usuario>) manager.createQuery("FROM usuario").getResultList();
		
		System.out.println("hay " + usuarios.size() + " empleados");
		

	}
}
