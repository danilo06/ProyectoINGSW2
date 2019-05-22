package ingsw.proyecto.prueba;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

public class Controlador2 implements Initializable {

	@FXML
	private Button BtnAnterior;

	@FXML
	private TextField txtText;

	@FXML
	private Button BtnClear;
	
	@FXML
	private BarChart<?, ?> idGrafica;

	@FXML
	private CategoryAxis idCategory;

	@FXML
	private NumberAxis idNumber;

	@FXML
	void BtnAnteriorAction(ActionEvent event) throws IOException {
		Stage stage = (Stage) BtnAnterior.getScene().getWindow();
		Parent root = FXMLLoader.load(getClass().getResource("/view1.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void setText(String text) {
		txtText.setText(text);
	}

	@FXML
	void BtnClearAction(ActionEvent event) {
		//XYChart.Series set1 = new XYChart.Series<X, Y>(data)
		XYChart.Series set1 = new XYChart.Series<>();
		XYChart.Series set2 = new XYChart.Series<>();
		XYChart.Series set3 = new XYChart.Series<>();
		set1.getData().add(new XYChart.Data("Joven",30));
		set2.getData().add(new XYChart.Data("adulto",20));
		set3.getData().add(new XYChart.Data("nino",10));
		idGrafica.getData().addAll(set1);
		idGrafica.getData().addAll(set2);
		idGrafica.getData().addAll(set3);
		

	}

	public void initialize(URL location, ResourceBundle resources) {
		/*
		XYChart.Series set1 = new XYChart.Series<>();
		set1.getData().add(new XYChart.Data("Joven",4));
		set1.getData().add(new XYChart.Data("niño",5));
		idGrafica.getData().addAll(set1);
		*/

	}

}