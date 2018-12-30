package pojos;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.*;

public class IdFamilia implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
    private Usuario usuario;
 
    private String parentesco;
    
    private int edad;
 
    public IdFamilia() {
    }
 
    public IdFamilia(Usuario id, String parentesco, int edad) {
    	this.usuario = id;
    	this.parentesco = parentesco;
    	this.edad = edad;
    }
 
    public Usuario getUsuario() {
        return usuario;
    }
 
    public String getParentesco() {
        return parentesco;
    }
    
    public int getEdad() {
    	return edad;
    }
 
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IdFamilia)) return false;
        IdFamilia that = (IdFamilia) o;
        return Objects.equals(getUsuario(), that.getUsuario()) &&
                Objects.equals(getParentesco(), that.getParentesco()) &&
                Objects.equals(getEdad(), that.getEdad());
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(getUsuario(), getParentesco(),getEdad());
    }
}

