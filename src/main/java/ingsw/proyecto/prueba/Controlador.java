package ingsw.proyecto.prueba;




import java.io.IOException;
//----------------------------------
import java.net.URL;//1
import java.util.ResourceBundle;//2
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.fxml.Initializable;//3
import javafx.event.ActionEvent;//4
import javafx.fxml.FXML;//5
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;//6
import javafx.scene.control.TextField;//7
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

//----------------------------------------



public class Controlador implements Initializable {

    @FXML
    private Button BtnNext;

    @FXML
    private TextField txtText;

    @FXML
    private Button BtnSendText;
    

    @FXML
    void BtnNextAction(ActionEvent event) throws IOException {
    	FXMLLoader Loader = new FXMLLoader();
    	Loader.setLocation(getClass().getResource("/view2.fxml"));
    	try {
    		Loader.load();
    	}catch(IOException ex) {
    		Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
    	}
    	Controlador2 controlador = Loader.getController();
    	controlador.setText(txtText.getText());
    	Parent p = Loader.getRoot();
    	Stage stage = (Stage) BtnNext.getScene().getWindow();
    	//Stage stage = new Stage();
    	stage.setScene(new Scene(p));
    	//stage.showAndWait();
    	stage.show();
    	
    }

    @FXML
    void BtnSendTextAction(ActionEvent event) {
    	
    }

	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
    @FXML
    void Entered(MouseEvent event) {
    	//BtnSendText.setStyle(value);
    	
    }

    @FXML
    void moved(MouseEvent event) {
    	
    }

    @FXML
    void pressend(MouseEvent event) {
    	BtnSendText.setStyle("fx-background-color: #FFFFFF");
    }

}