package ingsw.proyecto.SAGI.model;


import java.util.*;

/**
 * 
 */
public class Persona {

    /**
     * Default constructor
     */
    public Persona() {
    }

    /**
     * 
     */
    protected String nombre;

    /**
     * 
     */
    protected String numDocumento;

    /**
     * 
     */
    protected String celular;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumDocumento() {
		return numDocumento;
	}

	public void setNumDocumento(String numDocumento) {
		this.numDocumento = numDocumento;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", numDocumento=" + numDocumento + ", celular=" + celular + "]";
	}
    
    

}