package QA;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import junit.framework.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	@Test
	
    public void EX2_1_MIN(){
    	String Result = App.EX2_1_B(80);
    	String ExpectedResult = "B";
    	Assert.assertEquals(ExpectedResult, Result);
    }
	@Test
	
    public void EX2_1_MIN_PLUS_1(){
    	String Result = App.EX2_1_B(81);
    	String ExpectedResult = "B";
    	Assert.assertEquals(ExpectedResult, Result);
    }
	@Test
	
    public void EX2_1_NOMINAL(){
    	String Result = App.EX2_1_B(85);
    	String ExpectedResult = "B";
    	Assert.assertEquals(ExpectedResult, Result);
    }
	@Test
	
    public void EX2_1_MAX_MINUS_1(){
    	String Result = App.EX2_1_B(88);
    	String ExpectedResult = "B";
    	Assert.assertEquals(ExpectedResult, Result);
    }
	@Test
	
    public void EX2_1_MAX(){
    	String Result = App.EX2_1_B(89);
    	String ExpectedResult = "B";
    	Assert.assertEquals(ExpectedResult, Result);
    }
	
}
