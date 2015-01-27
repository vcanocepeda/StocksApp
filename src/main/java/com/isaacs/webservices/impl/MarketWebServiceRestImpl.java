package com.isaacs.webservices.impl;

import java.net.URI;
import java.util.List;

import javax.ws.rs.core.Response;

import com.isaacs.dao.MarketDao;
import com.isaacs.dao.impl.MarketDaoJPAImpl;
import com.isaacs.model.Market;
import com.isaacs.webservices.MarketWebServiceRest;

public class MarketWebServiceRestImpl implements MarketWebServiceRest {
	
	private static MarketDao marketDao = new MarketDaoJPAImpl();
	
	//This example returns a javax.ws.rs.core.Response built using javax.ws.rs.core.ResponseBuilder. 
	//response = Response.status(Response.Status.ACCEPTED).entity( 
	public Market getMarketXml(String code ) {// throws OrderNotFoundException{
//		MarketDao marketDao = new MarketDaoJPAImpl();
		Market market = marketDao.findByMarketCode(code);
		return market;
	}
	
	public List<Market> getMarketsXml() {
//		MarketDao marketDao = new MarketDaoJPAImpl(); 
		List<Market> markets = marketDao.getMarketList();
		
		return markets;
	}
	
	public Response addMarketXml(Market market) {
		String error = marketDao.save(market);
		//Response resp = Response.serverError().
		return Response.ok(error).build();
		// I am capturing the error and have to return different responses
		// com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException
		//return Response.noContent().build();
		//final URI id = URI.create(market.getCode());
		//return Response.created(id).build();
		
	}
	
	public Response delMarketXml(Market market) {
	//	MarketDao marketDao = new MarketDaoJPAImpl();
		String error = marketDao.delete(market);
		// I am capturing the error and have to return different responses
		// com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException
		final URI id = URI.create(market.getCode());
		return Response.created(id).build();
		
	}

}
