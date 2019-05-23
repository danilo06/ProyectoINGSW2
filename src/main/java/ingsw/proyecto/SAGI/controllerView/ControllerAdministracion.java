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
import ingsw.proyecto.SAGI.model.ZonaResidencial;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
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
import javafx.util.Duration;

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
	private ComboBox<String> cboxConcepto;

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

	private ZonaResidencial zonaResidencial = ZonaResidencial.getInstance();

	@FXML
	void btnGenerarPagoAction(ActionEvent event) {
		Notifications notificationBuilder = Notifications.create().title("BIEN!").text("Pago Registrado")
				.graphic(null).hideAfter(Duration.seconds(5)).position(Pos.CENTER)
				.onAction(new EventHandler<ActionEvent>() {

					public void handle(ActionEvent event) {
						System.out.println("Pago Registrado");
					}
				});
		notificationBuilder.darkStyle();
		notificationBuilder.showInformation();

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

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		pnlStatus.setBackground(
				new Background(new BackgroundFill(Color.rgb(99, 43, 63), CornerRadii.EMPTY, Insets.EMPTY)));
		cboxConcepto.getItems().add("Parqueadero - Motos");
		cboxConcepto.getItems().add("Parqueadero - Carros");
		cboxConcepto.getItems().add("Parqueadero - Administracion");
		cboxConcepto.getItems().add("Otros");
		animated();
		changePanel(panel2);
		changePanel(panel3);
		changePanel(panel4);
		changePanel(panel1);
		panel1.toFront();
		// ------------------------------------------------------
		ChartXMorosos = new CategoryAxis();
		ChartYMorosos = new NumberAxis(0, 15, 2.5);
		XYChart.Series series1 = new XYChart.Series();
		series1.setName("Al día");
		XYChart.Series series2 = new XYChart.Series();
		series2.setName("En Mora");
		for (int i = 0; i < zonaResidencial.getCuenta().size(); i++) {
			series1.getData().add(new XYChart.Data((zonaResidencial.getCuenta().get(i).getMes()),
					zonaResidencial.getCuenta().get(i).getAportes()));
			series2.getData().add(new XYChart.Data((zonaResidencial.getCuenta().get(i).getMes()),
					zonaResidencial.getCuenta().get(i).getDeuda()));
		}
		chartMorososPagos.getData().addAll(series1, series2);
		// ------------------------------------------------------
		chartXFrecienciaVisitas = new CategoryAxis();
		chartYFrecienciaVisitas = new NumberAxis();
		XYChart.Series series3 = new XYChart.Series();
		series3.setName("Ingreso");
		for (int i = 0; i < zonaResidencial.getSemana().size(); i++) {
			series3.getData().add(new XYChart.Data((zonaResidencial.getSemana().get(i).getMes()),
					zonaResidencial.getSemana().get(i).getAportes()));
		}
		chartFrecuenciaVisitantes.getData().addAll(series3);
		// ------------------------------------------------------
		ObservableList<PieChart.Data> data = FXCollections.observableArrayList();
		for (int i = 0; i < zonaResidencial.getPlata().size(); i++) {
			data.add(new PieChart.Data(zonaResidencial.getPlata().get(i).getMes(),
					zonaResidencial.getPlata().get(i).getAportes()));
		}
		pieChart.getData().addAll(data);
		pieChart.setTitle("Grafica por concepto");
		// ----------------------------------------------------------------
		chatXConcepto = new CategoryAxis();
		chatYConcepto = new NumberAxis();
		XYChart.Series series4 = new XYChart.Series();
		series4.setName("Concepto");
		for (int i = 0; i < zonaResidencial.getPlata().size(); i++) {
			series4.getData().add(new XYChart.Data(zonaResidencial.getPlata().get(i).getMes(),
					zonaResidencial.getPlata().get(i).getAportes()));
		}
		chatConcepto.getData().addAll(series4);

	}

	private void changePanel(AnchorPane panel) {
		panel.setLayoutX(300);
		panel.setLayoutY(220);
	}

}
