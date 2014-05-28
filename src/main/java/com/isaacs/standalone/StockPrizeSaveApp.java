package com.isaacs.standalone;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

import com.isaacs.dao.impl.*;
import com.isaacs.model.*;
import com.isaacs.webservices.impl.StocksWebServiceRestImpl;


public class StockPrizeSaveApp {

	public static void main(String... args) {
//		StockPrizeSaveApp app = new StockPrizeSaveApp();
//		app.createMarket();
		JAXRSServerFactoryBean sf = new JAXRSServerFactoryBean();
		sf.setResourceClasses(StocksWebServiceRestImpl.class);
		sf.setAddress("http://localhost:9000/");
		sf.create();

	}

	private void createMarket() {
		// props.put(PersistenceUnitProperties.JDBC_USER, "user-name");
		// props.put(PersistenceUnitProperties.JDBC_PASSWORD, "password");
		StockDaoJPAImpl stockDao = new StockDaoJPAImpl();
		MarketDaoJPAImpl marketDao = new MarketDaoJPAImpl();
		
		Market market = new Market();
		market = marketDao.findByMarketCode("IBEX35");
		
		Stock stock = new Stock();
		stock.setCode("REP");
		stock.setName("REPSOL");
		stock.setMarket(market);
		stockDao.save(stock);
		
		stock.setCode("REP2");
		stock.setName("REPSOL2");
		stockDao.update(stock, "REP");
		
		stockDao.delete(stock);
		
	    stockDao.CloseEntityManager();
		
	}
}

