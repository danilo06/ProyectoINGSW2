package ingsw.proyecto.SAGI.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class EmpleadoTest extends TestCase{
	
		//Prueba de implementacion de Patron Builder. 
		//Prueba de uso de sistema de control de versiones GitHb y git. 

    	Empleado empleado = new Empleado.EmpleadoBuilder().setCargo("Vigilante").setCelular("345839583").setEmail("carlos@uan.edu.co")
            .setEstado("Activo").setFechaIngreso(null).setFechaNacimiento(null).setGenero("Hombre")
            .setIdEmpleado("EMP1001").setLegajo("1000412").setNombre("Calos Altamar").setNumDocumento("123123")
            .setSalario(null).setSector("Vigilancia").setTurnoTrabajo("Tarde").build();

	    @Test
	    public void crearEmpleadoBuilderNumeroTestFail() {
	        assertFalse(empleado.getNumDocumento().equals("000000"));
	    }

	    @Test
	    public void crearEmpleadoBuilderNombreTest() {
	        assertTrue(empleado.getNombre().equals("Calos Altamar"));
	    }

	    @Test
	    public void crearEmpleadoBuilderNullTest() {
	        assertNull(empleado.getFechaIngreso());

	    }

}
