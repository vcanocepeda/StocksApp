package com.isaacs.standalone;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

import com.isaacs.dao.impl.*;
import com.isaacs.model.*;
import com.isaacs.webservices.impl.MarketWebServiceRestImpl;
import com.isaacs.webservices.impl.StocksWebServiceRestImpl;


public class StockPrizeSaveApp {

	public static void main(String... args) {
		AppInit init = new AppInit();
		String urlWebservice = init.getUrlWebservice();
		JAXRSServerFactoryBean sf = new JAXRSServerFactoryBean();
		sf.setResourceClasses(StocksWebServiceRestImpl.class, MarketWebServiceRestImpl.class);
		sf.setAddress(urlWebservice);
		sf.create();

	}
}

