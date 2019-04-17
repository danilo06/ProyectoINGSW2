package ingsw.proyecto.SAGI.controllerView;

import java.net.URL;
import java.util.ResourceBundle;

import animatefx.animation.BounceIn;
import animatefx.animation.FadeIn;
import animatefx.animation.Flash;
import animatefx.animation.Jello;
import animatefx.animation.Pulse;
import animatefx.animation.Swing;
import animatefx.animation.Tada;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
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

public class MenuController implements Initializable {

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
	private GridPane pnResidentes;

	@FXML
	private GridPane pnVisitantes;

	@FXML
	private GridPane pnPersonal;

	@FXML
	private GridPane pnAdministracion;

	@FXML
	private GridPane pnParqueaderos;

	@FXML
	private GridPane pnConfiguracion;

	@FXML
	private GridPane pnCerrarSesion;

	private boolean fullScreen = false;

	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}

	@FXML
	private void handleClicks(ActionEvent event) {
		if (event.getSource() == btnResidentes) {
			lblStatusMin.setText("/home/Residentes");
			lblStatus.setText("Residentes");
			pnlStatus.setBackground(
					new Background(new BackgroundFill(Color.rgb(78, 145, 214), CornerRadii.EMPTY, Insets.EMPTY)));
			pnResidentes.toFront();
			// animate the status panel
			new FadeIn(pnlStatus).play();
		} else if (event.getSource() == btnVisitantes) {
			lblStatusMin.setText("/home/Visitantes");
			lblStatus.setText("Visitantes");
			pnlStatus.setBackground(
					new Background(new BackgroundFill(Color.rgb(43, 63, 99), CornerRadii.EMPTY, Insets.EMPTY)));
			pnVisitantes.toFront();
			// animate the status panel
			new Jello(pnlStatus).play();

		} else if (event.getSource() == btnPersonal) {
			lblStatusMin.setText("/home/Personal");
			lblStatus.setText("Personal");
			pnlStatus.setBackground(
					new Background(new BackgroundFill(Color.rgb(43, 99, 63), CornerRadii.EMPTY, Insets.EMPTY)));
			pnPersonal.toFront();
			// animate the status panel
			new BounceIn(pnlStatus).play();

		} else if (event.getSource() == btnAdministracion) {
			lblStatusMin.setText("/home/Administración");
			lblStatus.setText("Administración");
			pnlStatus.setBackground(
					new Background(new BackgroundFill(Color.rgb(99, 43, 63), CornerRadii.EMPTY, Insets.EMPTY)));
			pnAdministracion.toFront();
			// animate the status panel
			new Flash(pnlStatus).play();

		} else if (event.getSource() == btanParqueaderos) {
			lblStatusMin.setText("/home/Parqueaderos");
			lblStatus.setText("Parqueaderos");
			pnlStatus.setBackground(
					new Background(new BackgroundFill(Color.rgb(25, 145, 56), CornerRadii.EMPTY, Insets.EMPTY)));
			pnParqueaderos.toFront();
			// animate the status panel
			new Pulse(pnlStatus).play();

		} else if (event.getSource() == btnConfiguracion) {
			lblStatusMin.setText("/home/Configuración");
			lblStatus.setText("Configuración");
			pnlStatus.setBackground(
					new Background(new BackgroundFill(Color.rgb(150, 156, 22), CornerRadii.EMPTY, Insets.EMPTY)));
			pnConfiguracion.toFront();
			// animate the status panel
			new Swing(pnlStatus).play();

		}
		if (event.getSource() == btnCerrarSesion) {
			lblStatusMin.setText("/home/CerrarSesión");
			lblStatus.setText("Cerrar Sesión");
			pnlStatus.setBackground(
					new Background(new BackgroundFill(Color.rgb(156, 22, 57), CornerRadii.EMPTY, Insets.EMPTY)));
			pnCerrarSesion.toFront();
			// animate the status panel
			new Tada(pnlStatus).play();

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
}
