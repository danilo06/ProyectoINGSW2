package ingsw.proyecto.SAGI.model;


import ingsw.proyecto.SAGI.builder.IBuilder;

/**
 * 
 */
public class Residente extends Persona {

	/**
	 * Default constructor
	 */
	public Residente() {
	}

	/**
	 * 
	 */
	private String tipoDocumento;

	/**
	 * 
	 */
	private Integer edad;

	/**
	 * 
	 */
	private String tipoResidente;

	/**
	 * 
	 */
	private String torre;

	/**
	 * 
	 */
	private String apartamento;

	/**
	 * 
	 */
	private String genero;

	/**
	 * @param tipoDocumento
	 * @param edad
	 * @param tipoResidente
	 * @param torre
	 * @param apartamento
	 * @param genero
	 */
	private Residente(String nombre, String numDocumento, String celular, String tipoDocumento, Integer edad,
			String tipoResidente, String torre, String apartamento, String genero) {
		this.nombre = nombre;
		this.numDocumento = numDocumento;
		this.celular = celular;
		this.tipoDocumento = tipoDocumento;
		this.edad = edad;
		this.tipoResidente = tipoResidente;
		this.torre = torre;
		this.apartamento = apartamento;
		this.genero = genero;
	}
	
	

	public String getTipoDocumento() {
		return tipoDocumento;
	}



	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}



	public Integer getEdad() {
		return edad;
	}



	public void setEdad(Integer edad) {
		this.edad = edad;
	}



	public String getTipoResidente() {
		return tipoResidente;
	}



	public void setTipoResidente(String tipoResidente) {
		this.tipoResidente = tipoResidente;
	}



	public String getTorre() {
		return torre;
	}



	public void setTorre(String torre) {
		this.torre = torre;
	}



	public String getApartamento() {
		return apartamento;
	}



	public void setApartamento(String apartamento) {
		this.apartamento = apartamento;
	}



	public String getGenero() {
		return genero;
	}



	public void setGenero(String genero) {
		this.genero = genero;
	}

	

	@Override
	public String toString() {
		return "Residente [tipoDocumento=" + tipoDocumento + ", edad=" + edad + ", tipoResidente=" + tipoResidente
				+ ", torre=" + torre + ", apartamento=" + apartamento + ", genero=" + genero + "]";
	}



	public static class ResidenteBuilder implements IBuilder<Residente> {
		
		private String tipoDocumento;
		private Integer edad;
		private String tipoResidente;
		private String torre;
		private String apartamento;
		private String genero;
		private String nombre;
		private String numDocumento;
		private String celular;
		
		public ResidenteBuilder() {
		}

		public ResidenteBuilder setTipoDocumento(String tipoDocumento) {
			this.tipoDocumento = tipoDocumento;
			return this;
		}

		public ResidenteBuilder setEdad(Integer edad) {
			this.edad = edad;
			return this;
		}

		public ResidenteBuilder setTipoResidente(String tipoResidente) {
			this.tipoResidente = tipoResidente;
			return this;
		}

		public ResidenteBuilder setTorre(String torre) {
			this.torre = torre;
			return this;
		}

		public ResidenteBuilder setApartamento(String apartamento) {
			this.apartamento = apartamento;
			return this;
		}

		public ResidenteBuilder setGenero(String genero) {
			this.genero = genero;
			return this;
		}

		public ResidenteBuilder setNombre(String nombre) {
			this.nombre = nombre;
			return this;
		}

		public ResidenteBuilder setNumDocumento(String numDocumento) {
			this.numDocumento = numDocumento;
			return this;
		}

		public ResidenteBuilder setCelular(String i) {
			this.celular = i;
			return this;
		}
		
		@Override
		public Residente build() {
			return new Residente (nombre, numDocumento,celular, tipoDocumento, edad,
					 tipoResidente,  torre,  apartamento,  genero); 
		}
		
	}

}