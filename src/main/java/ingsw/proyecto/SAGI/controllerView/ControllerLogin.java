package ingsw.proyecto.SAGI.controllerView;

import java.net.URL;
import java.util.ResourceBundle;

import ingsw.proyecto.SAGI.proxy.impl.IProcessEjecutor;
import ingsw.proyecto.SAGI.proxy.impl.ProcessEjecutorProxy;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
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
	private TextField txtUser;

	@FXML
	private PasswordField passwordUser;

	@FXML
	void close_app(MouseEvent event) {
		// System.exit(0);
	}

	@FXML
	void btnIniciarSesionAction(ActionEvent event) {

		IProcessEjecutor processEjecutor = new ProcessEjecutorProxy();
		try {
			processEjecutor.ejecuteProcess(txtUser.getText(), passwordUser.getText());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		ChangeScenes change = new ChangeScenes();
		change.changeScenes("/Menu.fxml",btnIniciarSesion);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// Stage stage = (Stage) parent.getScene().getWindow();
		// stage.centerOnScreen();
	}

}
