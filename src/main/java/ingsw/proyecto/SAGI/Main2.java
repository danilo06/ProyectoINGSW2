package ingsw.proyecto.SAGI;

import animatefx.animation.FadeIn;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main2 extends Application {

	// define your offsets here
	private double xOffset = 0;
	private double yOffset = 0;

	public static Stage stage = null;

	@Override
	public void start(final Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("/Menu.fxml"));
		// agarrar raíz aquí
		root.setOnMousePressed(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent event) {
				xOffset = event.getSceneX();
				yOffset = event.getSceneY();
			}
		});
		// move around here
		root.setOnMouseDragged(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent event) {
				stage.setX(event.getScreenX() - xOffset);
				stage.setY(event.getScreenY() - yOffset);
			}
		});
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.initStyle(StageStyle.UNDECORATED);
		this.stage = stage;
		stage.show();

		// animate the stage
		new FadeIn(root).play();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
