package ingsw.proyecto.SAGI.controllerView;

import java.net.URL;
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
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ControllerPersonal implements Initializable {

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
    private RadioButton rbpnl1Masculino;

    @FXML
    private ToggleGroup tgpnl1Genero;

    @FXML
    private RadioButton rbpnl1Femenino;

    @FXML
    private RadioButton rbpnl1Otro;
    
    @FXML
    private Button btnPanel1Guardar;

	private Boolean fullScreen = false;

	@FXML
	private void handleClicks(ActionEvent event) {
		ChangeScenes change = new ChangeScenes();
		if (event.getSource() == btnResidentes) {
			change.changeScenes("/Menu.fxml", btnVisitantes);
		} else if (event.getSource() == btnVisitantes) {
			change.changeScenes("/Visitante.fxml", btnVisitantes);
		} else if (event.getSource() == btnPersonal) {
			animated();
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
		new BounceIn(pnlStatus).play();
	}
	
	@FXML
    void btnPanel1GuardarAction(ActionEvent event) {
		Notifications notificationBuilder = Notifications.create()
				.title("AVISO")
				
				.text("Datos Guardados")
				.graphic(null)
				.hideAfter(Duration.seconds(5))
				.position(Pos.TOP_RIGHT)
				.onAction(new EventHandler<ActionEvent>() {
					
			public void handle(ActionEvent event) {
				System.out.println("Registrado");
			}
		});
		notificationBuilder.darkStyle();
		notificationBuilder.showInformation();

    }

	@Override
	public void initialize(URL location, ResourceBundle resources){
	pnlStatus.setBackground(
			new Background(new BackgroundFill(Color.rgb(43, 99, 63), CornerRadii.EMPTY, Insets.EMPTY)));
	animated();
	}

}
