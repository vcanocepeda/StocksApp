package com.isaacs.webservices.impl;

import com.isaacs.dao.MarketDao;
import com.isaacs.dao.impl.MarketDaoJPAImpl;
import com.isaacs.model.Market;
import com.isaacs.webservices.MarketWebServiceRest;

public class MarketWebServiceRestImpl implements MarketWebServiceRest {
	public Market getMarketXml(String code ) {
		MarketDao marketDao = new MarketDaoJPAImpl();
		Market market = marketDao.findByMarketCode(code);
		return market;
	}
	
	public String addMarketXml(Market market) {
		String result = "";
		MarketDao marketDao = new MarketDaoJPAImpl();
		marketDao.save(market);
		return result;
	}

}
