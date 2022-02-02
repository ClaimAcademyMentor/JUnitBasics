package jUnit;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class TestJunit1 {
	 String message = "Robert";	
	   StringBuffer messageUtil = new StringBuffer(message);
	   
	   @Test
	   public void testPrintMessage() {	
	      System.out.println("Inside testPrintMessage()");    
	      assertEquals(message, messageUtil);     
	   }
}
