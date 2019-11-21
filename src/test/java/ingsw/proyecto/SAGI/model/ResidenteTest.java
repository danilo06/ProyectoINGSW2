package ingsw.proyecto.SAGI.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class ResidenteTest extends TestCase{

	Residente residente = new Residente();
	
	@Test
	public void testResidenteNumeroDocumento() {
		
		Residente residente = new Residente.ResidenteBuilder().setApartamento("402").setCelular("3112541112").setEdad(0)
				.setGenero("Hombre").setNombre("Danilo Beleño").setNumDocumento("1030123123").setTipoDocumento("CC")
				.setTipoResidente("Propietario").setTorre("TO1").build();
		
		assertTrue(residente.getNumDocumento().equals(("1030123123")));
		
	}
	
	@Test
	public void testResidenteApartamento() {
		
		Residente residente = new Residente.ResidenteBuilder().setApartamento("402").setCelular("3112541112").setEdad(0)
				.setGenero("Hombre").setNombre("Danilo Beleño").setNumDocumento("1030123123").setTipoDocumento("CC")
				.setTipoResidente("Propietario").setTorre("TO1").build();
		
		assertTrue(residente.getApartamento().equals(("402")));
	}	
		
	@Test
	public void testResidenteTipoResidente() {
		
		Residente residente = new Residente.ResidenteBuilder().setApartamento("402").setCelular("3112541112").setEdad(0)
				.setGenero("Hombre").setNombre("Danilo Beleño").setNumDocumento("1030123123").setTipoDocumento("CC")
				.setTipoResidente("Propietario").setTorre("TO1").build();
	
		assertFalse(residente.getTipoResidente().equals("Camionero"));
	}
	
	@Test
	public void testResidenteGenero() {
		
		Residente residente = new Residente.ResidenteBuilder().setApartamento("402").setCelular("3112541112").setEdad(0)
				.setGenero("Hombre").setNombre("Danilo Beleño").setNumDocumento("1030123123").setTipoDocumento("CC")
				.setTipoResidente("Propietario").setTorre("TO1").build();
		
		assertFalse(residente.getGenero().equals("Mascota"));
	}
	
	

}
