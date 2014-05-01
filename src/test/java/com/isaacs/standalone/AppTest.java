package com.isaacs.standalone;

import org.junit.Test;
import org.junit.Assert;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import com.isaacs.standalone.App;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static junit.framework.Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    @Test
	public void testLengthOfTheUniqueKey() {
 
		App obj = new App();
		Assert.assertEquals(36, obj.generateUniqueKey().length());
 
	}
    
}
