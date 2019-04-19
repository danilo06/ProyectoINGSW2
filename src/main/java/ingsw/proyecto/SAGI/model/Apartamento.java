package ingsw.proyecto.SAGI.model;

import java.util.*;

import ingsw.proyecto.SAGI.builder.IBuilder;

/**
 * 
 */
public class Apartamento {

	/**
	 * 
	 */
	private String idApartamento;

	/**
	 * 
	 */
	private String idTorre;

	/**
	 * 
	 */
	private String idPropietario;

	/**
	 * 
	 */
	private String idResidenteACargo;

	/**
	 * 
	 */
	private Integer cantResidente;

	/**
	 * 
	 */
	private List<Persona> residentes;

	/**
	 * Default constructor
	 */
	public Apartamento() {
	}

	/**
	 * Constructor
	 */
	private Apartamento(String idApartamento, String idTorre, String idPropietario, String idResidenteACargo,
			Integer cantResidente, List<Persona> residentes) {
		this.idApartamento = idApartamento;
		this.idTorre = idTorre;
		this.idPropietario = idPropietario;
		this.idResidenteACargo = idResidenteACargo;
		this.cantResidente = cantResidente;
		this.residentes = residentes;
	}

	/**
	 * Constructor
	 */
	public Apartamento(String idApartamento, String idTorre, String idPropietario) {
		super();
		this.idApartamento = idApartamento;
		this.idTorre = idTorre;
		this.idPropietario = idPropietario;
	}

	public String getIdApartamento() {
		return idApartamento;
	}

	public void setIdApartamento(String idApartamento) {
		this.idApartamento = idApartamento;
	}

	public String getIdTorre() {
		return idTorre;
	}

	public void setIdTorre(String idTorre) {
		this.idTorre = idTorre;
	}

	public String getIdPropietario() {
		return idPropietario;
	}

	public void setIdPropietario(String idPropietario) {
		this.idPropietario = idPropietario;
	}

	public String getIdResidenteACargo() {
		return idResidenteACargo;
	}

	public void setIdResidenteACargo(String idResidenteACargo) {
		this.idResidenteACargo = idResidenteACargo;
	}

	public Integer getCantResidente() {
		return cantResidente;
	}

	public void setCantResidente(Integer cantResidente) {
		this.cantResidente = cantResidente;
	}

	public List<Persona> getResidentes() {
		return residentes;
	}

	public void setResidentes(List<Persona> residentes) {
		this.residentes = residentes;
	}

	public static class ApartamentoBuilder implements IBuilder<Apartamento> {

		private String idApartamento;
		private String idTorre;
		private String idPropietario;
		private String idResidenteACargo;
		private Integer cantResidente;
		private final List<Persona> residentes = new ArrayList<>();

		public ApartamentoBuilder() {
		}

		public ApartamentoBuilder setIdApartamento(String idApartamento) {
			this.idApartamento = idApartamento;
			return this;
		}

		public ApartamentoBuilder setIdTorre(String idTorre) {
			this.idTorre = idTorre;
			return this;
		}

		public ApartamentoBuilder setIdPropietario(String idPropietario) {
			this.idPropietario = idPropietario;
			return this;
		}

		public ApartamentoBuilder setIdResidenteACargo(String idResidenteACargo) {
			this.idResidenteACargo = idResidenteACargo;
			return this;
		}

		public ApartamentoBuilder setCantResidente(Integer cantResidente) {
			this.cantResidente = cantResidente;
			return this;
		}

		public ApartamentoBuilder addResidente(Persona persona) {
			residentes.add(persona);
			return this;
		}

		@Override
		public Apartamento build() {
			return new Apartamento(idApartamento, idTorre, idPropietario, idResidenteACargo, cantResidente, residentes);
		}

	}

}