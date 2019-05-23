package ingsw.proyecto.prueba;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.BubbleChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.StackedAreaChart;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;

public class Controlador3 implements Initializable{

	@FXML
	private AreaChart<?, ?> AreaChart;

	@FXML
	private CategoryAxis AreaChartX;

	@FXML
	private NumberAxis AreaChartY;

	@FXML
	private BubbleChart<?, ?> BubbleChart;

	@FXML
	private NumberAxis BubbleChartX;

	@FXML
	private NumberAxis BubbleChartY;

	@FXML
	private LineChart<?, ?> LineChart;

	@FXML
	private CategoryAxis LineChartX;

	@FXML
	private NumberAxis LineChartY;

	@FXML
	private PieChart PieChart;

	@FXML
	private StackedAreaChart<?, ?> StackedAreaChart;

	@FXML
	private NumberAxis StackedAreaChartX;

	@FXML
	private NumberAxis StackedAreaChartY;

	@FXML
	private StackedBarChart<?, ?> StackedBarChart;

	@FXML
	private CategoryAxis StackedBarChartX;

	@FXML
	private NumberAxis StackedBarChartY;
	

    @FXML
    private Button btn;

    @SuppressWarnings({ "unchecked", "rawtypes" })
	@FXML
    void btn(ActionEvent event) {
    
    	AreaChartX = new CategoryAxis();
    	AreaChartY = new NumberAxis(0, 15, 2.5); 
    	//AreaChart<String, Number> areaChart = new AreaChart(AreaChartX, AreaChartY);
    	
    	XYChart.Series series1 = new XYChart.Series();  
    	series1.setName("John"); 
    	series1.getData().add(new XYChart.Data("Enero", 3)); 
    	series1.getData().add(new XYChart.Data("Febrero", 4)); 
    	series1.getData().add(new XYChart.Data("Marzo", 3)); 
    	series1.getData().add(new XYChart.Data("Abril", 5)); 
    	series1.getData().add(new XYChart.Data("Mayo", 4)); 
    	series1.getData().add(new XYChart.Data("Junio", 10)); 
    	series1.getData().add(new XYChart.Data("Julio", 12));  

    	XYChart.Series series2 = new XYChart.Series();    	
    	series2.setName("Jane"); 
    	series2.getData().add(new XYChart.Data("Enero", -1)); 
    	series2.getData().add(new XYChart.Data("Febrero", -3)); 
    	series2.getData().add(new XYChart.Data("Marzo", -4)); 
    	series2.getData().add(new XYChart.Data("Abril", -3)); 
    	series2.getData().add(new XYChart.Data("Mayo", -3)); 
    	series2.getData().add(new XYChart.Data("Junio", -5)); 
    	series2.getData().add(new XYChart.Data("Julio", -4));  
        
        AreaChart.getData().addAll(series1,series2);

    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}

}
