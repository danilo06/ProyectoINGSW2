package ingsw.proyecto.SAGI.model;

import java.util.ArrayList;
import java.util.List;

public class BaseDatos {

	public static List<Empleado> empleados = new ArrayList<Empleado>();
	public static List<Residente> residentes = new ArrayList<Residente>();
	public static List<Visitante> visitantes = new ArrayList<Visitante>();
	public static List<UserLogin> users = new ArrayList<UserLogin>();

	public BaseDatos() {
	}

	public void cargeLista() {
		generateResidente();
		generateEmpleado();
		generateUsers();
	}

	public boolean validarUserLogin(String user) {
		for (int i = 0; i < users.size(); i++) {
			if (user.equals(users.get(i).getUser())) {
				return true;
			}
		}
		return false;
	}

	public UserLogin getUserLogin(String user) {
		UserLogin user1 = null;
		for (int i = 0; i < users.size(); i++) {
			if (user1.equals(users.get(i).getUser())) {
				user1 = users.get(i);
			}
		}
		return user1;
	}

	public void addResidentes(Residente residente) {
		residentes.add(residente);
	}

	public void addEmpleados(Empleado emp) {
		empleados.add(emp);
	}

	public void addVisitante(Visitante vist) {
		visitantes.add(vist);
	}

	public void addUsers(UserLogin user) {
		users.add(user);
	}

	public static List<Empleado> getEmpleados() {
		return empleados;
	}

	public static void setEmpleados(List<Empleado> empleados) {
		BaseDatos.empleados = empleados;
	}

	public static List<Residente> getResidentes() {
		return residentes;
	}

	public static void setResidentes(List<Residente> residentes) {
		BaseDatos.residentes = residentes;
	}

	public static List<Visitante> getVisitantes() {
		return visitantes;
	}

	public static void setVisitantes(List<Visitante> visitantes) {
		BaseDatos.visitantes = visitantes;
	}

	private void generateUsers() {
		UserLogin user;
		user = new UserLogin("root", "root");
		addUsers(user);
		user = new UserLogin("root2", "root2");
		addUsers(user);
		user = new UserLogin("roo3", "root3");
		addUsers(user);

	}

	private void generateResidente() {
		Residente res;
		res = new Residente.ResidenteBuilder().setApartamento("402").setCelular("3112541112").setEdad(40)
				.setGenero("Hombre").setNombre("Danilo Beleño").setNumDocumento("1030123123").setTipoDocumento("CC")
				.setTipoResidente("Propietario").setTorre("TO1").build();
		residentes.add(res);
		res = new Residente.ResidenteBuilder().setApartamento("450").setCelular("3112312312").setEdad(60)
				.setGenero("Mujer").setNombre("Sonia Mancipe").setNumDocumento("1320123123").setTipoDocumento("CC")
				.setTipoResidente("Propietario").setTorre("TO2").build();
		residentes.add(res);
		res = new Residente.ResidenteBuilder().setApartamento("406").setCelular("3232251112").setEdad(23)
				.setGenero("Hombre").setNombre("Alejandro Buitrago").setNumDocumento("143123123").setTipoDocumento("CC")
				.setTipoResidente("Arrendatario").setTorre("TO1").build();
		residentes.add(res);
		res = new Residente.ResidenteBuilder().setApartamento("408").setCelular("3112341112").setEdad(10)
				.setGenero("Mujer").setNombre("Sara").setNumDocumento("10303123").setTipoDocumento("TI")
				.setTipoResidente("Propietario").setTorre("TO1").build();
		residentes.add(res);
		res = new Residente.ResidenteBuilder().setApartamento("409").setCelular("4532541112").setEdad(4)
				.setGenero("Hombre").setNombre("Andres").setNumDocumento("123123").setTipoDocumento("RC")
				.setTipoResidente("Arrendatario").setTorre("TO3").build();
		residentes.add(res);
		res = new Residente.ResidenteBuilder().setApartamento("402").setCelular("1232541112").setEdad(8)
				.setGenero("Mujer").setNombre("Clara").setNumDocumento("1033123").setTipoDocumento("TI")
				.setTipoResidente("Propietario").setTorre("TO3").build();
		residentes.add(res);
		res = new Residente.ResidenteBuilder().setApartamento("202").setCelular("1232541112").setEdad(34)
				.setGenero("Hombre").setNombre("Juan").setNumDocumento("10432430123123").setTipoDocumento("CC")
				.setTipoResidente("Propietario").setTorre("TO2").build();
		residentes.add(res);
		res = new Residente.ResidenteBuilder().setApartamento("302").setCelular("3452541112").setEdad(23)
				.setGenero("Mujer").setNombre("Katalina").setNumDocumento("10423430123123").setTipoDocumento("CV")
				.setTipoResidente("Residente").setTorre("TO4").build();
		residentes.add(res);
		res = new Residente.ResidenteBuilder().setApartamento("102").setCelular("5322541112").setEdad(45)
				.setGenero("Hombre").setNombre("Daniel").setNumDocumento("OE30123123").setTipoDocumento("CD")
				.setTipoResidente("Residente").setTorre("TO2").build();
		residentes.add(res);
		res = new Residente.ResidenteBuilder().setApartamento("702").setCelular("5672541112").setEdad(23)
				.setGenero("Mujer").setNombre("Esteban").setNumDocumento("PE123123").setTipoDocumento("PAS")
				.setTipoResidente("Propietario").setTorre("TO1").build();
		residentes.add(res);
	}

	private void generateEmpleado() {
		Empleado emp;
		emp = new Empleado.EmpleadoBuilder().setCargo("Vigilante").setCelular("345839583").setEmail("carlos@uan.edu.co")
				.setEstado("Activo").setFechaIngreso(null).setFechaNacimiento(null).setGenero("Hombre")
				.setIdEmpleado("EMP1001").setLegajo("1000412").setNombre("Calos Altamar").setNumDocumento("123123")
				.setSalario(null).setSector("Vigilancia").setTurnoTrabajo("Tarde").build();
		empleados.add(emp);
		emp = new Empleado.EmpleadoBuilder().setCargo("Enfermera").setCelular("23123123123")
				.setEmail("Laura@uan.edu.co").setEstado("Activo").setFechaIngreso(null).setFechaNacimiento(null)
				.setGenero("Mujer").setIdEmpleado("EMP1002").setLegajo("1000232").setNombre("Laura S.")
				.setNumDocumento("432423432").setSalario(null).setSector("Salud").setTurnoTrabajo("Tarde").build();
		empleados.add(emp);
		emp = new Empleado.EmpleadoBuilder().setCargo("Administrador").setCelular("4234324234")
				.setEmail("Esteban@uan.edu.co").setEstado("Activo").setFechaIngreso(null).setFechaNacimiento(null)
				.setGenero("Hombre").setIdEmpleado("EMP1003").setLegajo("1023412").setNombre("Esteban Ricardo")
				.setNumDocumento("234234").setSalario(null).setSector("Administrativo").setTurnoTrabajo("Noche")
				.build();
		empleados.add(emp);
		emp = new Empleado.EmpleadoBuilder().setCargo("Mecanico").setCelular("543534543543").setEmail("Jose@uan.edu.co")
				.setEstado("Activo").setFechaIngreso(null).setFechaNacimiento(null).setGenero("Hombre")
				.setIdEmpleado("EMP1004").setLegajo("3500412").setNombre("Jose David").setNumDocumento("2342346456")
				.setSalario(null).setSector("Labor").setTurnoTrabajo("Noche").build();
		empleados.add(emp);
		emp = new Empleado.EmpleadoBuilder().setCargo("Vigilante").setCelular("30023123123").setEmail("Snir@uan.edu.co")
				.setEstado("Activo").setFechaIngreso(null).setFechaNacimiento(null).setGenero("Mujer")
				.setIdEmpleado("EMP1005").setLegajo("9800422").setNombre("Snir Tatiana").setNumDocumento("6456456")
				.setSalario(null).setSector("Vigilancia").setTurnoTrabajo("Tarde").build();
		empleados.add(emp);
		emp = new Empleado.EmpleadoBuilder().setCargo("Administrador").setCelular("1231231231")
				.setEmail("Natalia@uan.edu.co").setEstado("Vacaciones").setFechaIngreso(null).setFechaNacimiento(null)
				.setGenero("Mujer").setIdEmpleado("EMP1006").setLegajo("1023412").setNombre("Natalia")
				.setNumDocumento("75675675").setSalario(null).setSector("Administrativo").setTurnoTrabajo("Mañana")
				.build();
		empleados.add(emp);
	}

	private void generateVisitante() {
	}

}
