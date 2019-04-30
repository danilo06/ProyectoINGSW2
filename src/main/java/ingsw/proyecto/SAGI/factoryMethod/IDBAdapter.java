package ingsw.proyecto.SAGI.factoryMethod;

import java.sql.Connection;

public interface IDBAdapter {
	public Connection getConnection();
}