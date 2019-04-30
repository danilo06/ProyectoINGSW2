package ingsw.proyecto.SAGI.model;

import java.util.*;

import ingsw.proyecto.SAGI.builder.IBuilder;

/**
 * 
 */
public class Empleado extends Persona {

	/**
	 * Default constructor
	 */
	public Empleado() {
	}

	/**
	 * 
	 */
	private String idEmpleado;

	/**
	 * 
	 */
	private Double salario;

	/**
	 * 
	 */
	private String cargo;

	/**
	 * 
	 */
	private Date fechaIngreso;

	/**
	 * 
	 */
	private Date fechaNacimiento;

	/**
	 * 
	 */
	private String legajo;

	/**
	 * 
	 */
	private String sector;

	/**
	 * 
	 */
	private String email;

	/**
	 * 
	 */
	private String estado;

	/**
	 * 
	 */
	private String genero;

	/**
	 * 
	 */
	private String turnoTrabajo;

	/**
	 * @param idEmpleado
	 * @param salario
	 * @param cargo
	 * @param fechaIngreso
	 * @param fechaNacimiento
	 * @param legajo
	 * @param sector
	 * @param email
	 * @param estado
	 * @param genero
	 * @param turnoTrabajo
	 */
	private Empleado(String nombre, String numDocumento, String celular, String idEmpleado, Double salario,
			String cargo, Date fechaIngreso, Date fechaNacimiento, String legajo, String sector, String email,
			String estado, String genero, String turnoTrabajo) {
		this.nombre = nombre;
		this.numDocumento = numDocumento;
		this.celular = celular;
		this.idEmpleado = idEmpleado;
		this.salario = salario;
		this.cargo = cargo;
		this.fechaIngreso = fechaIngreso;
		this.fechaNacimiento = fechaNacimiento;
		this.legajo = legajo;
		this.sector = sector;
		this.email = email;
		this.estado = estado;
		this.genero = genero;
		this.turnoTrabajo = turnoTrabajo;
	}

	public String getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getTurnoTrabajo() {
		return turnoTrabajo;
	}

	public void setTurnoTrabajo(String turnoTrabajo) {
		this.turnoTrabajo = turnoTrabajo;
	}

	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", salario=" + salario + ", cargo=" + cargo + ", fechaIngreso="
				+ fechaIngreso + ", fechaNacimiento=" + fechaNacimiento + ", legajo=" + legajo + ", sector=" + sector
				+ ", email=" + email + ", estado=" + estado + ", genero=" + genero + ", turnoTrabajo=" + turnoTrabajo
				+ "]";
	}

	public static class EmpleadoBuilder implements IBuilder<Empleado> {

		private String idEmpleado;
		private Double salario;
		private String cargo;
		private Date fechaIngreso;
		private Date fechaNacimiento;
		private String legajo;
		private String sector;
		private String email;
		private String estado;
		private String genero;
		private String turnoTrabajo;
		private String nombre;
		private String numDocumento;
		private String celular;

		public EmpleadoBuilder() {
		}

		public EmpleadoBuilder setIdEmpleado(String idEmpleado) {
			this.idEmpleado = idEmpleado;
			return this;
		}

		public EmpleadoBuilder setSalario(Double salario) {
			this.salario = salario;
			return this;
		}

		public EmpleadoBuilder setCargo(String cargo) {
			this.cargo = cargo;
			return this;
		}

		public EmpleadoBuilder setFechaIngreso(Date fechaIngreso) {
			this.fechaIngreso = fechaIngreso;
			return this;
		}

		public EmpleadoBuilder setFechaNacimiento(Date fechaNacimiento) {
			this.fechaNacimiento = fechaNacimiento;
			return this;
		}

		public EmpleadoBuilder setLegajo(String legajo) {
			this.legajo = legajo;
			return this;
		}

		public EmpleadoBuilder setSector(String sector) {
			this.sector = sector;
			return this;
		}

		public EmpleadoBuilder setEmail(String email) {
			this.email = email;
			return this;
		}

		public EmpleadoBuilder setEstado(String estado) {
			this.estado = estado;
			return this;
		}

		public EmpleadoBuilder setGenero(String genero) {
			this.genero = genero;
			return this;
		}

		public EmpleadoBuilder setTurnoTrabajo(String turnoTrabajo) {
			this.turnoTrabajo = turnoTrabajo;
			return this;
		}

		public EmpleadoBuilder setNombre(String nombre) {
			this.nombre = nombre;
			return this;
		}

		public EmpleadoBuilder setNumDocumento(String numDocumento) {
			this.numDocumento = numDocumento;
			return this;
		}

		public EmpleadoBuilder setCelular(String celular) {
			this.celular = celular;
			return this;
		}

		@Override
		public Empleado build() {
			return new Empleado(nombre, numDocumento, celular, idEmpleado, salario, cargo, fechaIngreso,
					fechaNacimiento, legajo, sector, email, estado, genero, turnoTrabajo);
		}

	}

}