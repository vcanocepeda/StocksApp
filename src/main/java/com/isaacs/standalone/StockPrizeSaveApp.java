package com.isaacs.standalone;

import com.isaacs.model.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
//import javax.persistence.PersistenceUnit;
//import org.eclipse.persistence.config.PersistenceUnitProperties;
//import org.apache.openjpa.persistence.PersistenceProviderImpl;
//import oracle.toplink.essentials.ejb.cmp3.EntityManager;

public class StockPrizeSaveApp {

	// @PersistenceUnit(unitName = "stocksApp")
	//private EntityManagerFactory factory;

	public static void main(String... args) {
		StockPrizeSaveApp app = new StockPrizeSaveApp();
		app.createMarket();

	}

	private void createMarket() {
		// props.put(PersistenceUnitProperties.JDBC_USER, "user-name");
		// props.put(PersistenceUnitProperties.JDBC_PASSWORD, "password");
		try {
			EntityManagerFactory emf = Persistence
					.createEntityManagerFactory("stocksApp");

			EntityManager entityManager = emf.createEntityManager();
			entityManager.getTransaction().begin();

			Market market = new Market();
			market.setCode("NIKKEI");
			market.setCity("Tokyo");
			entityManager.persist(market);
			Stock stock = new Stock();
			stock.setCode("JP:6758");
			stock.setName("SONY");
			stock.setMarket(market);
			entityManager.persist(stock);
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}