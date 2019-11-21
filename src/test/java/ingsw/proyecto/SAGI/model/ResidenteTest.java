package ingsw.proyecto.SAGI.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ResidenteTest {

	Residente residente = new Residente();
	
	@Test
	public void testResidenteNumeroDocumento() {
		
		residente = new Residente.ResidenteBuilder().setApartamento("402").setCelular("3112541112").setEdad(0)
				.setGenero("Hombre").setNombre("Danilo Beleño").setNumDocumento("1030123123").setTipoDocumento("CC")
				.setTipoResidente("Propietario").setTorre("TO1").build();
		
		assertTrue(residente.getNumDocumento().endsWith("1030123123"));
		
	}
	

}
