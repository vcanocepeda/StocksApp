package com.isaacs.webservices.impl;

//import com.isaacs.model.Stock; http://localhost:9000/getPrice/1
//how to create a wadl page
import com.isaacs.model.Price;
import com.isaacs.dao.PriceDao;
import com.isaacs.dao.impl.PriceDaoJPAImpl;
import com.isaacs.webservices.StocksWebServiceRest;

public class StocksWebServiceRestImpl implements StocksWebServiceRest {
	public String getHelloWorld() {
		return "<html lang=\"en\"><body><h1>Hello, World!!</body></h1></html>";
	}

	public String getLastPriceFromStock(Integer id) {
		PriceDao priceDao = new PriceDaoJPAImpl();
		Price price = priceDao.findByPriceId(id);
		return "<html lang=\"en\"><body><h1>Price is " +price.getValue() + "</body></h1></html>";
	}

}
