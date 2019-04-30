package ingsw.proyecto.SAGI.proxy.services;

import ingsw.proyecto.SAGI.model.BaseDatos;

public class SecurityService {
	public boolean authorization(String user, String password) {
		BaseDatos bd = new BaseDatos();
		bd.cargeLista();
		if (bd.validarUserLogin(user)) {
			if (bd.getUserLogin(user).getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}
	
}