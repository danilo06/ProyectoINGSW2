package ingsw.proyecto.SAGI.controllerView;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class ChangeScenes {
	
	private double xOffset = 0;
	private double yOffset = 0;

	public static Stage stage = null;

	public void changeScenes(String direccion,Button btn) {
		FXMLLoader Loader = new FXMLLoader();
    	Loader.setLocation(getClass().getResource(direccion));
    	try {
    		Loader.load();
    	}catch(IOException ex) {
    		//Agregar ventana de error al cargar scene
    	}
    	Parent p = Loader.getRoot();
    	Stage stage = (Stage) btn.getScene().getWindow();
    	stage.setScene(new Scene(p));
    	stage.centerOnScreen();
    	stage.show();	
	}
	
	public void changeScenes(String direccion,Parent parent) {
		FXMLLoader Loader = new FXMLLoader();
    	Loader.setLocation(getClass().getResource(direccion));
    	try {
    		Loader.load();
    	}catch(IOException ex) {
    		//Agregar ventana de error al cargar scene
    	}
    	Parent p = Loader.getRoot();
    	Stage stage = (Stage) parent.getScene().getWindow();
    	//-----------------------------------
    	p.setOnMousePressed(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent event) {
				xOffset = event.getSceneX();
				yOffset = event.getSceneY();
			}
		});
		// move around here
		p.setOnMouseDragged(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent event) {
				stage.setX(event.getScreenX() - xOffset);
				stage.setY(event.getScreenY() - yOffset);
			}
		});
    	//-----------------------------------
    	stage.setScene(new Scene(p));
    	stage.centerOnScreen();
    	stage.show();	
	}
}
