package com.isaacs.webservices;

import com.isaacs.model.Price;
import com.isaacs.model.Stock;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;

@Path("/PriceService")
public interface StocksWebServiceRest {
	@GET
	@Path("/helloWorld")
	@Produces("text/html")
	public String getHelloWorld();
	
	@POST
	@Consumes("application/x-www-form-urlencoded")
	public String postHelloWorld(@FormParam("name") String name);

	@GET
	@Path("/getPrice/{id}")
	@Produces("text/html")
	public String getLastPriceFromId(@PathParam("id") Integer id);

	@GET
	@Path("/getStockPrice/{code}")
	@Produces("text/html")
	public String getLastPriceFromStock(@PathParam("code") String code);

	@GET
	@Path("/getStockXml/{code}")
	@Produces(MediaType.APPLICATION_XML)
	public Stock getStock(@PathParam("code") String code );	
	
	
//	public JAXBElement<Stock> getStock(@PathParam("code") String code);

	// Using JPA and JAXB Annotations in the Same Object
	// We should create more methods for JSON etc
	// @POST
	// @Consumes("application/x-www-form-urlencoded")
	// public void post(MultivaluedMap<String, String> formParams) {
	// Store the message
	// }
	// AddPriceToStock
	// @GET
	// public addPriceToStock(Price price);

}
