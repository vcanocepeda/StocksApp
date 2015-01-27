package com.isaacs.webservices;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.isaacs.model.Market;

@Path("/MarketService")
public interface MarketWebServiceRest {
	@GET
	@Path("/getMarketXml/{code}")
	@Produces(MediaType.APPLICATION_XML)
	public Market getMarketXml(@PathParam("code") String code );
	
	@GET
	@Path("/getMarketsXml")
	@Produces(MediaType.APPLICATION_XML)
	public List<Market> getMarketsXml();
	
	@POST
	@Path("/addMarketXml")
	@Produces(MediaType.APPLICATION_XML)
	public Response addMarketXml(Market market);
	
	@POST
	@Path("/delMarketXml")
	@Produces(MediaType.APPLICATION_XML)
	public Response delMarketXml(Market market);

}
