package ingsw.proyecto.prueba;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
/**
 * Declaracion de la clase Main, Clase principal del sistema
 * @author Danilo Beleño
 * @version 15/11/2018
 */
public class MainTest extends Application {
	/**
	 * Inicializa la interfaz la cual contiene los paneles del sistema para poder trabajar
	 */
	@Override
	public void start(Stage PrimaryStage) throws Exception {
	    Parent root = FXMLLoader.load(getClass().getResource("/Administracion.fxml"));
	    Scene scene = new Scene(root);
	    PrimaryStage.setScene(scene);
	    PrimaryStage.initStyle(StageStyle.UNDECORATED); // para eliminar bordes del sistema
	    //PrimaryStage.setFullScreen(true);
	    PrimaryStage.show();
	}
	/**
	 * Metodo Principal
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	
	}
	
}

