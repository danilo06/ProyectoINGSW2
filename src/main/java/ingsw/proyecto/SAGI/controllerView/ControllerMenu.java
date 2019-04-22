package ingsw.proyecto.SAGI.controllerView;

import java.net.URL;
import java.util.ResourceBundle;
import animatefx.animation.FadeIn;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ControllerMenu implements Initializable{

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
    private GridPane pnResidentes;

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
    private GridPane pnResidentes1;

    @FXML
    private GridPane pnResidentes2;

    @FXML
    private GridPane pnResidentes21;

    @FXML
    private GridPane pnResidentes3;

    @FXML
    private BarChart<?, ?> PoblaciónConjuntoResidencial;

    @FXML
    private CategoryAxis lblEdad;

    @FXML
    private NumberAxis lblPersonas;
    
    private boolean fullScreen = false;

    @FXML
	private void handleClicks(ActionEvent event) {
		ChangeScenes change = new ChangeScenes();
		if (event.getSource() == btnResidentes) {
			animated();
		} else if (event.getSource() == btnVisitantes) {
			change.changeScenes("/Visitante.fxml", btnVisitantes);
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
		new FadeIn(pnlStatus).play();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		animated();
		XYChart.Series setl = new XYChart.Series<>();

		setl.getData().add(new XYChart.Data("Niños", 0 - 14));
		setl.getData().add(new XYChart.Data("Jovenes", 15 - 24));
		setl.getData().add(new XYChart.Data("Adultos", 25 - 49));
		setl.getData().add(new XYChart.Data("Adultos Mayores", 50 - 80));

		PoblaciónConjuntoResidencial.getData().addAll(setl);
		// TODO Auto-generated method stub
		
	}

}
