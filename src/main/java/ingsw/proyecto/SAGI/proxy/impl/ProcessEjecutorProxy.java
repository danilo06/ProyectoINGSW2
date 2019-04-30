package ingsw.proyecto.SAGI.proxy.impl;

import org.controlsfx.control.Notifications;
import ingsw.proyecto.SAGI.proxy.services.SecurityService;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.util.Duration;

/**
 * 
 */
public class ProcessEjecutorProxy implements IProcessEjecutor {

	@Override
	public void ejecuteProcess(String user, String password) throws Exception {
		SecurityService securityService = new SecurityService();
		if (!securityService.authorization(user, password)) {
			Notifications notificationBuilder = Notifications.create().title("AVISO")
					.text("Usuario o Contraseña incorrecetos").graphic(null).hideAfter(Duration.seconds(5))
					.position(Pos.CENTER).onAction(new EventHandler<ActionEvent>() {

						public void handle(ActionEvent event) {
							System.out.println("error");
						}
					});
			notificationBuilder.darkStyle();
			notificationBuilder.showInformation();
			throw new Exception("El usuario '" + user + "' no tiene privilegios para ejecutar el proceso");
		}

	}
}