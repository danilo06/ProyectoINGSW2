package ingsw.proyecto.SAGI.factoryMethod.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;
import ingsw.proyecto.SAGI.factoryMethod.*;
import ingsw.proyecto.SAGI.model.*;

public class ProductDAO {

	private IDBAdapter dbAdapter;

	public ProductDAO() {
		dbAdapter = DBFactory.getDefaultDBAdapter();
	}

	public void ConsultarConsolaUsuarios() {
		Connection connection = dbAdapter.getConnection();
		try {
			PreparedStatement statement = connection.prepareStatement("SELECT * FROM login");
			ResultSet results = statement.executeQuery();
			
			ResultSetMetaData metaData = results.getMetaData();
			int numberOfColumns = metaData.getColumnCount();
			System.out.println("Table Empleado\n");
			for (int i = 1; i <= numberOfColumns; i++)
				System.out.printf("%-8s\t", metaData.getColumnName(i));
			System.out.println();

			while (results.next()) {
				for (int i = 1; i <= numberOfColumns; i++)
					System.out.printf("%-8s\t", results.getObject(i));
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();

		} finally {

			try {
				connection.close();

			} catch (Exception e) {
			}
		}
	}
	/*
	 * public List<Product> findAllProducts() { Connection connection =
	 * dbAdapter.getConnection(); List<Product> productList = new
	 * ArrayList<Product>();
	 * 
	 * try { PreparedStatement statement = connection
	 * 
	 * .prepareStatement("SELECT idProductos,productName" +
	 * ",productPrice FROM Productos");
	 * 
	 * ResultSet results = statement.executeQuery(); while (results.next()) {
	 * 
	 * productList.add(new Product(results.getLong(1), results.getString(2),
	 * results.getDouble(3)));
	 * 
	 * } return productList;
	 * 
	 * } catch (Exception e) { e.printStackTrace();
	 * 
	 * return null; } finally {
	 * 
	 * try { connection.close();
	 * 
	 * } catch (Exception e) { } }
	 * 
	 * }
	 * 
	 * public boolean saveProduct(Product product) { Connection connection =
	 * dbAdapter.getConnection();
	 * 
	 * try { PreparedStatement statement = connection.prepareStatement(
	 * "INSERT INTO Productos(idProductos," +
	 * "productName, productPrice) VALUES (?,?,?)"); statement.setLong(1,
	 * product.getIdProduct()); statement.setString(2, product.getProductName());
	 * statement.setDouble(3, product.getPrice()); statement.executeUpdate();
	 * 
	 * return true; } catch (Exception e) {
	 * 
	 * e.printStackTrace(); return false;
	 * 
	 * } finally { try {
	 * 
	 * connection.close(); } catch (Exception e) { } } }
	 */
}