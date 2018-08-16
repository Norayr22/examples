import org.apache.commons.mail.EmailException;
import org.testng.annotations.Test;

import ddd.FacebookTesting;
import ddd.Webdriver;

public class FbTest extends Webdriver{
	@Test
	public void begin() throws InterruptedException, EmailException {
		
		FacebookTesting fb = new FacebookTesting(driver);
		fb.startTest();
		
		
		
	}
	
	
	

}
