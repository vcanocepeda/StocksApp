package com.isaacs.webservices.impl;

//import com.isaacs.model.Stock; http://localhost:9000/getPrice/1
//how to create a wadl page
import java.util.List;
import com.isaacs.model.Stock;
import com.isaacs.model.Price;
import com.isaacs.dao.PriceDao;
import com.isaacs.dao.StockDao;
import com.isaacs.dao.impl.StockDaoJPAImpl;
import com.isaacs.dao.impl.PriceDaoJPAImpl;
import com.isaacs.webservices.StocksWebServiceRest;
import com.oracle.xmlns.internal.webservices.jaxws_databinding.ObjectFactory;

public class StocksWebServiceRestImpl implements StocksWebServiceRest {
	public String getHelloWorld() {
		return "<html lang=\"en\"><body><h1>Hello, World!!</body></h1></html>";
	}
	
	public String postHelloWorld(String name) {
		return "<html lang=\"en\"><body><h1>Hello, World!! " + name
				+ "</body></h1></html>";
	}

	public String getLastPriceFromId(Integer id) {
		PriceDao priceDao = new PriceDaoJPAImpl();
		Price price = priceDao.findByPriceId(id);
		return "<html lang=\"en\"><body><h1>Price is " + price.getValue()
				+ "</body></h1></html>";
	}

	public String getLastPriceFromStock(String code) {
		StockDao stockDao = new StockDaoJPAImpl();
		Stock stock = stockDao.findByStockCode(code);
		List<Price> prices = stock.getPrices();
		return "<html lang=\"en\"><body><h1>Price is "
				+ prices.get(0).getValue() + "</body></h1></html>";
	}

	
	public Stock getStock(String code ) {
		StockDao stockDao = new StockDaoJPAImpl();
		Stock stock = stockDao.findByStockCode(code);
		return stock;
	}
//	public JAXBElement<Stock> getStock(String code) {
//		StockDao stockDao = new StockDaoJPAImpl();
//		Stock stock = stockDao.findByStockCode(code);
//        return new ObjectFactory().createProduct(stock);
//    }
	// import org.eclipse.persistence.oxm.annotations.XmlInverseReference;
	//@XmlInverseReference(mappedBy="address")
    //public Customer getCustomer() {
    //    return customer;
   // }

}
