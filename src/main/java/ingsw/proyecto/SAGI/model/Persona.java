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
	 * @param nombre
	 * @param numDocumento
	 * @param tipoDocumnto
	 * @param genero
	 * @param celular
	 */
	public Persona(String nombre, String numDocumento, String tipoDocumnto, String genero, Double celular) {
		this.nombre = nombre;
		this.numDocumento = numDocumento;
		this.tipoDocumnto = tipoDocumnto;
		this.genero = genero;
		this.celular = celular;
	}

	/**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String numDocumento;

    /**
     * 
     */
    private String tipoDocumnto;

    /**
     * 
     */
    private String genero;

    /**
     * 
     */
    private Double celular;

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

	public String getTipoDocumnto() {
		return tipoDocumnto;
	}

	public void setTipoDocumnto(String tipoDocumnto) {
		this.tipoDocumnto = tipoDocumnto;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Double getCelular() {
		return celular;
	}

	public void setCelular(Double celular) {
		this.celular = celular;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", numDocumento=" + numDocumento + ", tipoDocumnto=" + tipoDocumnto
				+ ", genero=" + genero + ", celular=" + celular + "]";
	}
    
    
    

}