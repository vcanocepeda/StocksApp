package com.isaacs.webservices;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.isaacs.model.Market;

@Path("/MarketService")
public interface MarketWebServiceRest {
	@GET
	@Path("/getMarketXml/{code}")
	@Produces(MediaType.APPLICATION_XML)
	public Market getMarketXml(@PathParam("code") String code );
	
	@POST
	@Path("/addMarketXml")
	@Produces(MediaType.APPLICATION_XML)
	public String addMarketXml(Market market);

}
