package testcases;

import org.junit.Assert;
import org.junit.Test;


public class TestCase {
	
	 @Test
	    public void Failed_Testcase(){
	        System.out.println("This test case is supposed to be failed.");
	        Assert.assertEquals("Test assertion is failed", true,false);
	    }

	    @Test
	    public void Passed_Testcase(){
	        System.out.println("This test case is supposed to be passed.");
	        Assert.assertEquals("Test assertion is passed", true,true);
	    }

}
