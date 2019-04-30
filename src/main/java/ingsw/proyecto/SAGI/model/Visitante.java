package ingsw.proyecto.SAGI.model;


import java.util.*;

import ingsw.proyecto.SAGI.builder.IBuilder;

/**
 * 
 */
public class Visitante extends Persona {

	/**
	 * Default constructor
	 */
	public Visitante() {
	}

	/**
	 * 
	 */
	private String tipoDocumento;

	/**
	 * 
	 */
	private Date fechaIngreso;

	/**
	 * 
	 */
	private Date fechaSalida;

	/**
	 * 
	 */
	private String torreVisita;

	/**
	 * 
	 */
	private Boolean IngresaVehiculo;

	/**
	 * 
	 */
	private String apartamentoVisita;

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Date getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public String getTorreVisita() {
		return torreVisita;
	}

	public void setTorreVisita(String torreVisita) {
		this.torreVisita = torreVisita;
	}

	public Boolean getIngresaVehiculo() {
		return IngresaVehiculo;
	}

	public void setIngresaVehiculo(Boolean ingresaVehiculo) {
		IngresaVehiculo = ingresaVehiculo;
	}

	public String getApartamentoVisita() {
		return apartamentoVisita;
	}

	public void setApartamentoVisita(String apartamentoVisita) {
		this.apartamentoVisita = apartamentoVisita;
	}

	/**
	 * @param tipoDocumento
	 * @param fechaIngreso
	 * @param fechaSalida
	 * @param torreVisita
	 * @param ingresaVehiculo
	 * @param apartamentoVisita
	 */
	private Visitante(String nombre, String numDocumento, String celular, String tipoDocumento, Date fechaIngreso,
			Date fechaSalida, String torreVisita, Boolean ingresaVehiculo, String apartamentoVisita) {
		this.nombre = nombre;
		this.numDocumento = numDocumento;
		this.celular = celular;
		this.tipoDocumento = tipoDocumento;
		this.fechaIngreso = fechaIngreso;
		this.fechaSalida = fechaSalida;
		this.torreVisita = torreVisita;
		this.IngresaVehiculo = ingresaVehiculo;
		this.apartamentoVisita = apartamentoVisita;
	}

	@Override
	public String toString() {
		return "Visitante [tipoDocumento=" + tipoDocumento + ", fechaIngreso=" + fechaIngreso + ", fechaSalida="
				+ fechaSalida + ", torreVisita=" + torreVisita + ", IngresaVehiculo=" + IngresaVehiculo
				+ ", apartamentoVisita=" + apartamentoVisita + "]";
	}

	public static class VisitanteBuilder implements IBuilder<Visitante> {
		private String tipoDocumento;
		private Date fechaIngreso;
		private Date fechaSalida;
		private String torreVisita;
		private Boolean IngresaVehiculo;
		private String apartamentoVisita;
		private String nombre;
		private String numDocumento;
		private String celular;

		public VisitanteBuilder() {
		}

		public VisitanteBuilder setTipoDocumento(String tipoDocumento) {
			this.tipoDocumento = tipoDocumento;
			return this;
		}

		public VisitanteBuilder setFechaIngreso(Date fechaIngreso) {
			this.fechaIngreso = fechaIngreso;
			return this;
		}

		public VisitanteBuilder setFechaSalida(Date fechaSalida) {
			this.fechaSalida = fechaSalida;
			return this;
		}

		public VisitanteBuilder setTorreVisita(String torreVisita) {
			this.torreVisita = torreVisita;
			return this;
		}

		public VisitanteBuilder setIngresaVehiculo(Boolean ingresaVehiculo) {
			IngresaVehiculo = ingresaVehiculo;
			return this;
		}

		public VisitanteBuilder setApartamentoVisita(String apartamentoVisita) {
			this.apartamentoVisita = apartamentoVisita;
			return this;
		}

		public VisitanteBuilder setNombre(String nombre) {
			this.nombre = nombre;
			return this;
		}

		public VisitanteBuilder setNumDocumento(String numDocumento) {
			this.numDocumento = numDocumento;
			return this;
		}

		public VisitanteBuilder setCelular(String celular) {
			this.celular = celular;
			return this;
		}

		@Override
		public Visitante build() {
			return new Visitante(nombre, numDocumento, celular, tipoDocumento, fechaIngreso, fechaSalida, torreVisita,
					IngresaVehiculo, apartamentoVisita);
		}
	}
}