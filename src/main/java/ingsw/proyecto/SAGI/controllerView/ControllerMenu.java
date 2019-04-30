package ingsw.proyecto.SAGI.controllerView;

import java.net.URL;
import java.util.ResourceBundle;

import org.controlsfx.control.Notifications;

import animatefx.animation.FadeIn;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ControllerMenu implements Initializable {

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
	private Button btnPanel1BuscarResidente;

	@FXML
	private Button btnPanel1AgregarResidente;

	@FXML
	private Button btnPanel4Generar;

	@FXML
	private Button btnPanel1Reporte;

	@FXML
	private Button btnPanel1PoblacionResidentes;

	@FXML
	private FontAwesomeIconView btnClose;

	@FXML
	private FontAwesomeIconView btnExpand;

	@FXML
	private AnchorPane panel4;

	@FXML
	private BarChart<?, ?> PoblaciónConjuntoResidencial;

	@FXML
	private CategoryAxis lblEdad;

	@FXML
	private NumberAxis lblPersonas;

	@FXML
	private AnchorPane panel1;

	@FXML
	private Button btnPanel1GenerarReporte;

	@FXML
	private AnchorPane panel2;

	@FXML
	private AnchorPane panel3;
	
	@FXML
    private RadioButton rbpnl2Hombre;

    @FXML
    private RadioButton rbpnl2Mujer;
    
    @FXML
    private ToggleGroup tgpnl2Genero;
    
    @FXML
    private RadioButton rbpnl3Hombre;

    @FXML
    private RadioButton rbpnl3Mujer;
    
    @FXML
    private ToggleGroup tgpnl3Genero;
    
    @FXML
    private Button btnPanel2AgregarResidente;

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

	private void changePanel(AnchorPane panel) {
		panel.setLayoutX(300);
		panel.setLayoutY(220);
	}

	@FXML
	void btnPanel1ReporteAction(ActionEvent event) {
		panel1.toFront();
	}

	@FXML
	void btnPanel1BuscarResidenteAction(ActionEvent event) {
		panel2.toFront();
	}

	@FXML
	void btnPanel1AgregarResidenteAction(ActionEvent event) {
		panel3.toFront();
	}

	@FXML
	void btnPanel1PoblacionResidentesAction(ActionEvent event) {
		panel4.toFront();
	}

	@FXML
	void btnPanel1GenerarReporteAction(ActionEvent event) {
	}

	@FXML
	void btnPanel4GenerarAction(ActionEvent event) {	
		XYChart.Series setl = new XYChart.Series();
		XYChart.Series set2 = new XYChart.Series();
		XYChart.Series set3 = new XYChart.Series();
		XYChart.Series set4 = new XYChart.Series();
		setl.setName("Niños 0 - 14");
		set2.setName("Jovenes 15 - 24");
		set3.setName("Adultos 25 - 49");
		set4.setName("Adultos Mayores 50 - 80");
		setl.getData().add(new XYChart.Data<>("", 20));
		set2.getData().add(new XYChart.Data<>("", 10));
		set3.getData().add(new XYChart.Data<>("", 30));
		set4.getData().add(new XYChart.Data<>("", 60));
		PoblaciónConjuntoResidencial.getData().addAll(setl);
		PoblaciónConjuntoResidencial.getData().addAll(set2);
		PoblaciónConjuntoResidencial.getData().addAll(set3);
		PoblaciónConjuntoResidencial.getData().addAll(set4);
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		animated();
		changePanel(panel2);
		changePanel(panel3);
		changePanel(panel4);
		changePanel(panel1);
		panel1.toFront();
	}
	 @FXML
	    void btnPanel2AgregarResidenteAction(ActionEvent event) {
		 Notifications notificationBuilder = Notifications.create()
					.title("AVISO")
					.text("Residente Registrado")
					.graphic(null)
					.hideAfter(Duration.seconds(3))
					.position(Pos.BASELINE_RIGHT)
					.onAction(new EventHandler<ActionEvent>() {
						
				public void handle(ActionEvent event) {
					System.out.println("Registrado");
				}
			});
			notificationBuilder.darkStyle();
			notificationBuilder.showInformation();
		 
	 }

}
