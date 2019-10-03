package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTest {
	
      @Test
	  public static void testassertclass(){
		  
		 // Assert.assertEquals(actual, expected);
    	  
    	//  Assert.assertEquals("rahul", "rahul1");
    	//  Assert.assertEquals(true, true);
    	 // Assert.assertEquals(true, false);
    	  
    	  try {
		 // Assert.fail("Expected text not found webpage");
		  Assert.assertEquals("Rahul", "Rahul");
		  System.out.println("I am in try block");
    	  }
    	  
    	  catch (Exception e) {
    		  System.out.println(e.getMessage());
    	  }
		  
		  finally {
			  System.out.println("I am finally block and can be executed every time");
		  }
	  }

}