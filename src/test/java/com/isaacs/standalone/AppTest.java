package com.isaacs.standalone;

import org.junit.Test;
import org.junit.Assert;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.isaacs.dao.impl.*;
import com.isaacs.model.Market;
import com.isaacs.model.Stock;
import com.isaacs.standalone.App;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	private StockDaoJPAImpl stockDao;
	private MarketDaoJPAImpl marketDao;
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
        stockDao = new StockDaoJPAImpl();
		marketDao = new MarketDaoJPAImpl();
    }

    /**
     * @return the suite of tests being tested
     */
    public static junit.framework.Test suite()
    {
        return new TestSuite( AppTest.class );
    }

	@Test
	public void testCRUD() {
					
		Market market = new Market();
		market = marketDao.findByMarketCode("IBEX35");
			
		Stock stock = new Stock();
		stock.setCode("REP");
		stock.setName("REPSOL");
		stock.setMarket(market);
		stockDao.save(stock);
			
		assertEquals("REP", stockDao.findByStockCode("REP").getCode());
		assertEquals("REPSOL", stockDao.findByStockCode("REP").getName());
	
		stock.setCode("REP2");
		stock.setName("REPSOL2");
		stockDao.update(stock, "REP");
			
		assertEquals("REP2", stockDao.findByStockCode("REP2").getCode());
		assertEquals("REPSOL2", stockDao.findByStockCode("REP2").getName());
	
		stockDao.delete(stock);

		assertNull(stockDao.findByStockCode("REP2").getId());
		
		stockDao.CloseEntityManager();
 
	}
    
}
