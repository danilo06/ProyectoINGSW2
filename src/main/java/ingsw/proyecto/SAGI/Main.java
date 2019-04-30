package ingsw.proyecto.SAGI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Main extends Application {

    public static Stage stage = null;

    @Override
    public void start(Stage stage) throws Exception {
 //       Parent root = FXMLLoader.load(getClass().getResource("PantallaCarga.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("/PantallaCarga.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);
        Main.stage = stage;
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
