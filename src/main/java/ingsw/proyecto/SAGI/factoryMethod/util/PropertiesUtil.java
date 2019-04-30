package ingsw.proyecto.SAGI.factoryMethod.util;

import java.io.InputStream;
import java.security.AuthProvider;
import java.util.Properties;

/** * cargar propiedades */
public class PropertiesUtil {

	public static Properties loadProperty(String propertiesURL) {
		try {

			Properties properties = new Properties();
			InputStream inputStream = PropertiesUtil.class.getClassLoader().getResourceAsStream(propertiesURL);

			properties.load(inputStream);
			return properties;

		} catch (Exception e) {
			e.printStackTrace();

			return null;
		}

	}
}