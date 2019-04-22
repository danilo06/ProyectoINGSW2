package ingsw.proyecto.SAGI.controllerView;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ChangeScenes {

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
    	stage.show();	
	}
}
