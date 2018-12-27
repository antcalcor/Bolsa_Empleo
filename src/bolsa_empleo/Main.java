package bolsa_empleo;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
            .createEntityManagerFactory("bolsa_empleo");
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		
		
		ENTITY_MANAGER_FACTORY.close();
	}
}
