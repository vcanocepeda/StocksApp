package com.isaacs.webservices.impl;

import java.net.URI;
import java.util.List;

import javax.ws.rs.core.Response;

import com.isaacs.dao.MarketDao;
import com.isaacs.dao.impl.MarketDaoJPAImpl;
import com.isaacs.model.Market;
import com.isaacs.webservices.MarketWebServiceRest;

public class MarketWebServiceRestImpl implements MarketWebServiceRest {
	
	//This example returns a javax.ws.rs.core.Response built using javax.ws.rs.core.ResponseBuilder. 
	//response = Response.status(Response.Status.ACCEPTED).entity( 
	public Market getMarketXml(String code ) {// throws OrderNotFoundException{
		MarketDao marketDao = new MarketDaoJPAImpl();
		Market market = marketDao.findByMarketCode(code);
		return market;
	}
	
/*	public Response getMarketsXml() {
		String result = "";
		MarketDao marketDao = new MarketDaoJPAImpl(); 
		List<Market> markets = marketDao.getMarketList();
		
		final URI id = URI.create("http://");
		return Response.created(id).build();
	}
*/
	
	public List<Market> getMarketsXml() {
		MarketDao marketDao = new MarketDaoJPAImpl(); 
		List<Market> markets = marketDao.getMarketList();
		
		return markets;
	}
	
	public Response addMarketXml(Market market) {
		String result = "";
		MarketDao marketDao = new MarketDaoJPAImpl();
		marketDao.save(market);
		
		final URI id = URI.create(market.getCode());
		return Response.created(id).build();
	}

}
