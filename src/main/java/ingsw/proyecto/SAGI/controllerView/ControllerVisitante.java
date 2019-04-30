package ingsw.proyecto.SAGI.controllerView;

import java.net.URL;
import java.time.LocalTime;
import java.util.ResourceBundle;

import org.controlsfx.control.Notifications;

import animatefx.animation.BounceIn;
import animatefx.animation.FadeIn;
import animatefx.animation.Flash;
import animatefx.animation.Jello;
import animatefx.animation.Pulse;
import animatefx.animation.Swing;
import animatefx.animation.Tada;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTimePicker;

public class ControllerVisitante implements Initializable {

	@FXML
	private Button btnResidentes;

	@FXML
	private Button btnVisitantes;

	@FXML
	private Button btnPersonal;

	@FXML
	private Button btnAdministracion;

	@FXML
	private Button btanParqueaderos;

	@FXML
	private Button btnConfiguracion;

	@FXML
	private Button btnCerrarSesion;

	@FXML
	private GridPane pnParqueaderos;

	@FXML
	private Pane pnlStatus;

	@FXML
	private Label lblStatus;

	@FXML
	private Label lblStatusMin;

	@FXML
	private FontAwesomeIconView btnClose;

	@FXML
	private FontAwesomeIconView btnExpand;
	
	@FXML
	private JFXTimePicker SeleccionarHora;

	@FXML
	private JFXDatePicker SeleccionarFecha;
	
	 @FXML
	private Button btnPanel1RegistrarVisitante;
	 

	private Boolean fullScreen = false;

	@FXML
	private void handleClicks(ActionEvent event) {
		ChangeScenes change = new ChangeScenes();
		if (event.getSource() == btnResidentes) {
			change.changeScenes("/Menu.fxml", btnVisitantes);
		} else if (event.getSource() == btnVisitantes) {
			animated();
		} else if (event.getSource() == btnPersonal) {
			change.changeScenes("/Personal.fxml", btnVisitantes);
		} else if (event.getSource() == btnAdministracion) {
			change.changeScenes("/Administracion.fxml", btnVisitantes);
		} else if (event.getSource() == btanParqueaderos) {
			change.changeScenes("/Parqueadero.fxml", btnVisitantes);
		} else if (event.getSource() == btnConfiguracion) {
			change.changeScenes("/Configuracion.fxml", btnVisitantes);
		} else if (event.getSource() == btnCerrarSesion) {
			change.changeScenes("/CerrarSesion.fxml", btnVisitantes);
		}
	}

	@FXML
	public void handleClose(MouseEvent event) {
		if (event.getSource() == btnClose) {
			System.exit(0);
		}
	}

	@FXML
	void handleExpand(MouseEvent event) {
		if (event.getSource() == btnExpand) {
			Stage stage = (Stage) pnlStatus.getScene().getWindow();
			if (fullScreen == false) {
				stage.setFullScreen(true);
				fullScreen = true;
			} else {
				stage.setFullScreen(false);
				fullScreen = false;
			}
		}
	}

	private void animated() {
		new Jello(pnlStatus).play();
	}
	
	@FXML
	 void btnPanel1RegistrarVisitanteAction(ActionEvent event) {
		Notifications notificationBuilder = Notifications.create()
				.title("AVISO")
				.text("Visitante Registrado")
				.graphic(null)
				.hideAfter(Duration.seconds(5))
				.position(Pos.CENTER)
				.onAction(new EventHandler<ActionEvent>() {
					
			public void handle(ActionEvent event) {
				System.out.println("Registrado");
			}
		});
		notificationBuilder.darkStyle();
		notificationBuilder.showInformation();

	 }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		pnlStatus.setBackground(
				new Background(new BackgroundFill(Color.rgb(43, 63, 99), CornerRadii.EMPTY, Insets.EMPTY)));
		animated();
		
		SeleccionarHora.setValue(LocalTime.of(06, 00));
		
	}

}
