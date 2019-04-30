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
import javafx.scene.layout.AnchorPane;
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
	private AnchorPane panel21;

	@FXML
	private AnchorPane panel2111;

	@FXML
	private Button btnPanel1RegistrarVisitante;

	@FXML
	private JFXTimePicker SeleccionarHora;

	@FXML
	private JFXDatePicker SeleccionarFecha;

	@FXML
	private Button btnResidentes;

	@FXML
	private Button btnVisitantes;

	@FXML
	private Button btnPersonal;

	@FXML
	private Button btnPanel1REGISTRO;

	@FXML
	private Button btnAdministracion;

	@FXML
	private Button btanParqueaderos;

	@FXML
	private Button btnConfiguracion;

	@FXML
	private Button btnCerrarSesion;

	@FXML
	private Pane pnlStatus;

	@FXML
	private Label lblStatus;

	@FXML
	private Label lblStatusMin;

	@FXML
	private Button btnPanel1Reporte;

	@FXML
	private FontAwesomeIconView btnClose;

	@FXML
	private FontAwesomeIconView btnExpand;

	@FXML
	private AnchorPane panel211;

	@FXML
	private Button btnPanel2RetirarVisitante;

	@FXML
	private Button btnPanel2GenerarListado;

	@FXML
	private JFXTimePicker SeleccionarHora11;

	@FXML
	private JFXDatePicker SeleccionarFecha11;

	@FXML
	private Button btnPanel3Retirando;

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
		Notifications notificationBuilder = Notifications.create().title("AVISO")

				.text("Visitante Registrado").graphic(null).hideAfter(Duration.seconds(5)).position(Pos.CENTER)
				.onAction(new EventHandler<ActionEvent>() {

					public void handle(ActionEvent event) {
						System.out.println("Registrado");
					}
				});
		notificationBuilder.darkStyle();
		notificationBuilder.showInformation();

	}

	@FXML
	void btnPanel1ReporteAction(ActionEvent event) {
		panel211.toFront();
		panel21.toBack();
	}
	private void changePanel(AnchorPane panel) {
		panel.setLayoutX(300);
		panel.setLayoutY(220);
	}
	private void changePanel2(AnchorPane panel) {
		panel.setLayoutX(600);
		panel.setLayoutY(320);
	}

	@FXML
	void btnPanel2GenerarListadoAction(ActionEvent event) {

	}

	@FXML
	void btnPanel2RetirarVisitanteAction(ActionEvent event) {
		panel2111.toFront();
		changePanel2(panel2111);
		
	}

	@FXML
	void btnPanel3RetirandoAction(ActionEvent event) {
		panel2111.setLayoutX(2000);
		panel2111.setLayoutX(3000);
		Notifications notificationBuilder = Notifications.create().title("AVISO").text("Visitante Retirado")
				.graphic(null).hideAfter(Duration.seconds(5)).position(Pos.CENTER)
				.onAction(new EventHandler<ActionEvent>() {

					public void handle(ActionEvent event) {
						System.out.println("Retirado Visitante");
					}
				});
		notificationBuilder.darkStyle();
		notificationBuilder.showInformation();
	}

	@FXML
	void btnPanel1REGISTROAction(ActionEvent event) {
		panel21.toFront();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		changePanel(panel21);
		changePanel(panel211);
		changePanel2(panel2111);
		panel21.toFront();
		pnlStatus.setBackground(
				new Background(new BackgroundFill(Color.rgb(43, 63, 99), CornerRadii.EMPTY, Insets.EMPTY)));
		animated();

		SeleccionarHora.setValue(LocalTime.of(06, 00));

	}

}
