package com.isaacs.standalone;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AppInit {

	private static EntityManagerFactory emf;
	private static String urlWebservice = "http://localhost:9002";
	
	public AppInit() {
		emf = Persistence.createEntityManagerFactory("stocksApp");
		Properties prop = new Properties();
		InputStream in = getClass().getClassLoader().getResourceAsStream(
				"app.properties");
		try {
			prop.load(in);
			
			if (urlWebservice == null) {
				urlWebservice = prop.getProperty("url.webservice");
			}

		} catch (IOException | NumberFormatException e) {
			// NumberFormatException is a RuntimeException and we don´t need to
			// catch it but since we are using Java 7 we can catch several exc with |
			e.printStackTrace();
		}
	}
		
	public static EntityManager createEntityManager() {
		if (emf == null) {
			throw new IllegalStateException("EntityManagerFactory is not initialized yet.");
		}

		return emf.createEntityManager();
	}
	
	public String getUrlWebservice() {
		return urlWebservice;
	}
	
}