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
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ControllerAdministracion implements Initializable {

	private Boolean fullScreen = false;

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
    private AnchorPane panel1;

    @FXML
    private TextField txtNombreResidente;

    @FXML
    private TextField txtDocumento;

    @FXML
    private Button btnGenerarPago;

    @FXML
    private Button btnReporteEstadistico;

    @FXML
    private ComboBox<?> cboxConcepto;

    @FXML
    private AnchorPane panel2;

    @FXML
    private Button btnSiguienteMorososPagos;

    @FXML
    private AreaChart<?, ?> chartMorososPagos;

    @FXML
    private CategoryAxis ChartXMorosos;

    @FXML
    private NumberAxis ChartYMorosos;

    @FXML
    private AnchorPane panel3;

    @FXML
    private Button btnSiguienteFrecuenciaVisitas;

    @FXML
    private LineChart<?, ?> chartFrecuenciaVisitantes;

    @FXML
    private CategoryAxis chartXFrecienciaVisitas;

    @FXML
    private NumberAxis chartYFrecienciaVisitas;

    @FXML
    private AnchorPane panel4;

    @FXML
    private Button btnIngresoConcepto;

    @FXML
    private BarChart<?, ?> chatConcepto;

    @FXML
    private CategoryAxis chatXConcepto;

    @FXML
    private NumberAxis chatYConcepto;

    @FXML
    private PieChart pieChart;

    @FXML
    void btnGenerarPagoAction(ActionEvent event) {

    }

    @FXML
    void btnIngresoConceptoAction(ActionEvent event) {
    	panel1.toFront();
    }

    @FXML
    void btnReporteEstadisticoAction(ActionEvent event) {
    	panel2.toFront();
    }

    @FXML
    void btnSiguienteFrecuenciaVisitasAction(ActionEvent event) {
    	panel4.toFront();
    }

    @FXML
    void btnSiguienteMorososPagosAction(ActionEvent event) {
    	panel3.toFront();
    }

	@FXML
	private void handleClicks(ActionEvent event) {
		ChangeScenes change = new ChangeScenes();
		if (event.getSource() == btnResidentes) {
			change.changeScenes("/Menu.fxml", btnVisitantes);
		} else if (event.getSource() == btnVisitantes) {
			change.changeScenes("/Visitante.fxml", btnVisitantes);
		} else if (event.getSource() == btnPersonal) {
			change.changeScenes("/Personal.fxml", btnVisitantes);
		} else if (event.getSource() == btnAdministracion) {
			animated();
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
		new Flash(pnlStatus).play();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		pnlStatus.setBackground(
				new Background(new BackgroundFill(Color.rgb(99, 43, 63), CornerRadii.EMPTY, Insets.EMPTY)));
		animated();
		changePanel(panel2);
		changePanel(panel3);
		changePanel(panel4);
		changePanel(panel1);
		panel1.toFront();
	}
	
	private void changePanel(AnchorPane panel) {
		panel.setLayoutX(300);
		panel.setLayoutY(220);
	}
	

}
