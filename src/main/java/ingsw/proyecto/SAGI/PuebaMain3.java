package ingsw.proyecto.SAGI;

import ingsw.proyecto.SAGI.model.*;

public class PuebaMain3 {

	public static void main(String[] args) {
		Persona persona = new Persona();
		Apartamento apartamento = new Apartamento.ApartamentoBuilder().setCantResidente(5).setIdApartamento("AP1")
				.setIdPropietario("cc1").setIdResidenteACargo("res1").setIdTorre("to1").addResidente(persona).build();
		
		System.out.println(apartamento);
	}
}
