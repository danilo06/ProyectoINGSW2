package ingsw.proyecto.SAGI.controllerView;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.fxml.Initializable;

public class ControllerLogin implements Initializable {

	@FXML
	private AnchorPane parent;

	@FXML
	private Button btnIniciarSesion;

	@FXML
	void close_app(MouseEvent event) {
		// System.exit(0);
	}

	@FXML
	void btnIniciarSesionAction(ActionEvent event) {
		ChangeScenes change = new ChangeScenes();
		change.changeScenes("/Menu.fxml", parent);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Stage stage = (Stage) parent.getScene().getWindow();
		stage.centerOnScreen();
	}

}
