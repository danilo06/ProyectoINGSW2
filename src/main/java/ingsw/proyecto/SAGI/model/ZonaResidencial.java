package ingsw.proyecto.SAGI.model;

import java.util.*;

/**
 * 
 */
public class ZonaResidencial {

	private static ZonaResidencial zonaResidencial;

	private String idZonaResidencial;

	private String nombre;

	private List<Residente> residente;

	private List<IUnidadResidencial> unidadResiencial;

	private List<Empleado> empleado;

	private List<UserLogin> users;

	private Parqueadero parqueadero;

	private List<Visitante> visitante;

	private BaseDatos baseDatos;

	private int segmentoA;
	private int segmentoB;
	private int segmentoC;
	private int segmentoD;

	@SuppressWarnings("static-access")
	private ZonaResidencial() {
		baseDatos = new BaseDatos();
		this.residente = baseDatos.getResidentes();
		this.empleado = baseDatos.getEmpleados();
		this.visitante = baseDatos.getVisitantes();
		this.users = baseDatos.getUsers();
	}

	private static synchronized void createInstance() {
		if (zonaResidencial == null) {
			zonaResidencial = new ZonaResidencial();
		}
	}

	public void generarSegmentos() {
		segmentoA = 0;
		segmentoB = 0;
		segmentoC = 0;
		segmentoD = 0;
		for (int i = 0; i < residente.size(); i++) {
			if (residente.get(i).getEdad() >= 0 && residente.get(i).getEdad() < 15) {
				segmentoA++;
			}
			if (residente.get(i).getEdad() >= 15 && residente.get(i).getEdad() < 25) {
				segmentoB++;
			}
			if (residente.get(i).getEdad() >= 25 && residente.get(i).getEdad() < 50) {
				segmentoC++;
			}
			if (residente.get(i).getEdad() >= 50) {
				segmentoD++;
			}
		}
	}

	public int getSegmentoA() {
		return segmentoA;
	}

	public int getSegmentoB() {
		return segmentoB;
	}

	public int getSegmentoC() {
		return segmentoC;
	}

	public int getSegmentoD() {
		return segmentoD;
	}

	public static ZonaResidencial getInstance() {
		if (zonaResidencial == null) {
			createInstance();
		}
		return zonaResidencial;
	}

	public static ZonaResidencial getZonaResidencial() {
		return zonaResidencial;
	}

	public static void setZonaResidencial(ZonaResidencial zonaResidencial) {
		ZonaResidencial.zonaResidencial = zonaResidencial;
	}

	public String getIdZonaResidencial() {
		return idZonaResidencial;
	}

	public void setIdZonaResidencial(String idZonaResidencial) {
		this.idZonaResidencial = idZonaResidencial;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Residente> getResidente() {
		return residente;
	}

	public void setResidente(List<Residente> residente) {
		this.residente = residente;
	}

	public List<IUnidadResidencial> getUnidadResiencial() {
		return unidadResiencial;
	}

	public void setUnidadResiencial(List<IUnidadResidencial> unidadResiencial) {
		this.unidadResiencial = unidadResiencial;
	}

	public List<Empleado> getEmpleado() {
		return empleado;
	}

	public void setEmpleado(List<Empleado> empleado) {
		this.empleado = empleado;
	}

	public List<UserLogin> getUsers() {
		return users;
	}

	public void setUsers(List<UserLogin> users) {
		this.users = users;
	}

	public Parqueadero getParqueadero() {
		return parqueadero;
	}

	public void setParqueadero(Parqueadero parqueadero) {
		this.parqueadero = parqueadero;
	}

	public List<Visitante> getVisitante() {
		return visitante;
	}

	public Residente busResidente(String doc) {
		for (int i = 0; i < residente.size(); i++) {
			if (doc.equals(residente.get(i).getNumDocumento())) {
				return residente.get(i);
			}
		}
		return null;
	}

	public void setVisitante(List<Visitante> visitante) {
		this.visitante = visitante;
	}

	public BaseDatos getBaseDatos() {
		return baseDatos;
	}

	public void setBaseDatos(BaseDatos baseDatos) {
		this.baseDatos = baseDatos;
	}
	
	public void addResidente(Residente residente) {
		this.residente.add(residente);
	}

}