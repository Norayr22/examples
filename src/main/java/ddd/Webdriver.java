package ddd;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;




	public class Webdriver {
		protected WebDriver driver;
		@BeforeMethod
		public void setup() throws InterruptedException{
		

			System.setProperty(Constants.CHROMEDRIVER, Constants.CHROMEDRIVER_EXE);
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications", 2);
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
			options.addArguments("disable-infobars");
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			
			
			driver.get("https://www.facebook.com");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		}
		 @AfterMethod()
		  public void close(){
			  driver.quit();
		  }

	}


