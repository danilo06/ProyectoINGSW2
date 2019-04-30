package ingsw.proyecto.SAGI;

import java.util.List;

import ingsw.proyecto.SAGI.factoryMethod.*;
import ingsw.proyecto.SAGI.factoryMethod.dao.*;
import ingsw.proyecto.SAGI.model.*;

public class PuebaMain3 {

	public static void main(String[] args) {
		/*
		Persona persona = new Persona();
		Apartamento apartamento = new Apartamento.ApartamentoBuilder().setCantResidente(5).setIdApartamento("AP1")
				.setIdPropietario("cc1").setIdResidenteACargo("res1").setIdTorre("to1").addResidente(persona).build();
		
		System.out.println(apartamento);
		
		ProductDAO consulta = new ProductDAO();
		consulta.ConsultarConsolaUsuarios();
		*/
		BaseDatos base = new BaseDatos();
		base.cargeLista();
		
		List<Residente> list = base.getResidentes();
		
		System.out.println(list);
		
		
	}
}
