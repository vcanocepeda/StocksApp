package com.isaacs.webservices;

import com.isaacs.model.Price;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes; 


public interface StocksWebServiceRest {
	@GET
	@Path("/helloWorld")
	@Produces("text/html")
	public String getHelloWorld();
	
	@GET
	@Path("/getPrice/{id}")
	@Produces("text/html")
	public String getLastPriceFromStock(@PathParam("id") Integer id);

}
