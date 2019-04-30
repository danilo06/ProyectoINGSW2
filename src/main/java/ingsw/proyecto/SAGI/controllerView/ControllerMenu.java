package ingsw.proyecto.SAGI.controllerView;

import java.net.URL;
import java.util.ResourceBundle;
import org.controlsfx.control.Notifications;
import animatefx.animation.FadeIn;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import ingsw.proyecto.SAGI.model.Residente;
import ingsw.proyecto.SAGI.model.ZonaResidencial;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
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

	@FXML
	private TableView<Residente> tableResidente;

	@FXML
	private TableColumn<Residente, String> columTipoDoc;

	@FXML
	private TableColumn<Residente, String> columDoc;

	@FXML
	private TableColumn<Residente, String> columNombre;

	@FXML
	private TableColumn<Residente, String> columMovil;

	@FXML
	private TableColumn<Residente, String> columTipoResidente;

	@FXML
	private TableColumn<Residente, String> columGenero;

	@FXML
	private TableColumn<Residente, String> columTorre;

	@FXML
	private TableColumn<Residente, String> columApartamento;

	@FXML
	private TextField panel2txtNombreResidente;

	@FXML
	private TextField panel2txtTelResidente;

	@FXML
	private TextField panel2txtTipoResidente;

	@FXML
	private TextField panel2txtDocumentoResidente;

	@FXML
	private TextField panel2txtEdad;

	@FXML
	private TextField panel2txtApartamento;

	@FXML
	private TextField panel2txtTorre;

	@FXML
	private ComboBox<String> panel2cboxTipoDocumento;

	@FXML
	private TextField panel3txtBusqResidenteDoc;

	@FXML
	private TextField panel3txtNombreResidente;

	@FXML
	private TextField panel3txtTipoDocumento;

	@FXML
	private TextField panel3txtTelefonoResidente;

	@FXML
	private TextField panel3txtTipoResidente;

	@FXML
	private TextField panel3txtDocumentoResidente;

	@FXML
	private TextField panel3txtEdadResidente;

	@FXML
	private TextField panel3txtApartamento;

	@FXML
	private TextField panel3txtTorre;

	@FXML
	private Button Panel3btnBuscar;

	ObservableList<Residente> residentes1;

	ZonaResidencial zonaResidencial = ZonaResidencial.getInstance();

	private boolean fullScreen = false;

	@FXML
	void Panel3btnBuscarAction(ActionEvent event) {
		Residente residente = zonaResidencial.busResidente(panel3txtBusqResidenteDoc.getText());
		if (residente == null) {
			Notifications notificationBuilder = Notifications.create().title("AVISO").text("Residente no registrado")
					.graphic(null).hideAfter(Duration.seconds(5)).position(Pos.CENTER)
					.onAction(new EventHandler<ActionEvent>() {
						public void handle(ActionEvent event) {
							System.out.println("No Econtrado");
						}
					});
			notificationBuilder.darkStyle();
			notificationBuilder.showInformation();
		} else {
			panel3txtNombreResidente.setText(residente.getNombre());
			panel3txtTipoDocumento.setText(residente.getTipoDocumento());
			panel3txtTelefonoResidente.setText(residente.getCelular());
			panel3txtTipoResidente.setText(residente.getTipoResidente());
			panel3txtApartamento.setText(residente.getApartamento());
			panel3txtDocumentoResidente.setText(residente.getNumDocumento());
			panel3txtEdadResidente.setText(String.valueOf(residente.getEdad()));
			panel3txtTorre.setText(residente.getTorre());
			if (residente.getGenero().equals("Hombre")) {
				rbpnl3Hombre.setDisable(true);
			} else {
				rbpnl3Mujer.setDisable(true);
			}

		}
	}

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

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@FXML
	void btnPanel4GenerarAction(ActionEvent event) {
		zonaResidencial.generarSegmentos();

		XYChart.Series setl = new XYChart.Series();
		XYChart.Series set2 = new XYChart.Series();
		XYChart.Series set3 = new XYChart.Series();
		XYChart.Series set4 = new XYChart.Series();
		setl.setName("Niños 0 - 14");
		set2.setName("Jovenes 15 - 24");
		set3.setName("Adultos 25 - 49");
		set4.setName("Adultos Mayores 50 - 80");
		setl.getData().add(new XYChart.Data<>("", zonaResidencial.getSegmentoA()));
		set2.getData().add(new XYChart.Data<>("", zonaResidencial.getSegmentoB()));
		set3.getData().add(new XYChart.Data<>("", zonaResidencial.getSegmentoC()));
		set4.getData().add(new XYChart.Data<>("", zonaResidencial.getSegmentoD()));
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
		this.inicializarTablaResidentes();
		for (int i = 0; i < zonaResidencial.getResidente().size(); i++) {
			residentes1.add(zonaResidencial.getResidente().get(i));
		}
		
		panel2cboxTipoDocumento.getItems().add("CC");
		panel2cboxTipoDocumento.getItems().add("PAS");
		panel2cboxTipoDocumento.getItems().add("TI");
		panel2cboxTipoDocumento.getItems().add("RC");
		panel2cboxTipoDocumento.getItems().add("CE");
		panel2cboxTipoDocumento.getItems().add("CD");
		panel2cboxTipoDocumento.getItems().add("CV");
		panel2cboxTipoDocumento.getItems().add("NUIP");
	}

	@FXML
	void btnPanel2AgregarResidenteAction(ActionEvent event) {
		Residente residente = new Residente();
		if (panel2txtDocumentoResidente.getText().equals("") || panel2cboxTipoDocumento.getAccessibleText().equals("")
				|| panel2txtNombreResidente.getText().equals("") || panel2txtApartamento.getText().equals("")
				|| panel2txtTorre.getText().equals("")) {

			Notifications notificationBuilder = Notifications.create().title("AVISO").text("Digite los campos")
					.graphic(null).hideAfter(Duration.seconds(5)).position(Pos.CENTER)
					.onAction(new EventHandler<ActionEvent>() {

						public void handle(ActionEvent event) {
							System.out.println("Campos vacios");
						}
					});
			notificationBuilder.darkStyle();
			notificationBuilder.showInformation();
		} else {
			residente = new Residente.ResidenteBuilder().setNombre(panel2txtNombreResidente.getText())
					.setNumDocumento(panel2txtDocumentoResidente.getText())
					.setTipoDocumento(panel2cboxTipoDocumento.getAccessibleText())
					.setCelular(panel2txtTelResidente.getText()).setEdad(Integer.parseInt(panel2txtEdad.getText()))
					.setTipoResidente(panel2txtTipoResidente.getText()).setApartamento(panel2txtApartamento.getText())
					.setTorre(panel2txtTorre.getText()).build();
			residentes1.add(residente);
		}

	}

	private void inicializarTablaResidentes() {

		columTipoDoc.setCellValueFactory(new PropertyValueFactory<Residente, String>("tipoDocumento"));
		columDoc.setCellValueFactory(new PropertyValueFactory<Residente, String>("numDocumento"));
		columNombre.setCellValueFactory(new PropertyValueFactory<Residente, String>("nombre"));
		columMovil.setCellValueFactory(new PropertyValueFactory<Residente, String>("celular"));
		columTipoResidente.setCellValueFactory(new PropertyValueFactory<Residente, String>("tipoResidente"));
		columGenero.setCellValueFactory(new PropertyValueFactory<Residente, String>("genero"));
		columTorre.setCellValueFactory(new PropertyValueFactory<Residente, String>("torre"));
		columApartamento.setCellValueFactory(new PropertyValueFactory<Residente, String>("apartamento"));
		residentes1 = FXCollections.observableArrayList();
		tableResidente.setItems(residentes1);
	}

}
