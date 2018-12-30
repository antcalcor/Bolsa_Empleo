package pojos.PKCompuesta;

import java.io.Serializable;

import pojos.Usuario;;;

public class FamiliaPK implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
    private Usuario idUsuario;
 
    private String parentesco;
    
    private int edad;
 
    public FamiliaPK() {
    }
 
    public FamiliaPK(Usuario id, String parentesco, int edad) {
    	this.idUsuario = id;
    	this.parentesco = parentesco;
    	this.edad = edad;
    }
 
}

