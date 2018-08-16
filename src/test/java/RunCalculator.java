import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class RunCalculator {
	AndroidDriver<MobileElement> driver;
    @BeforeSuite
    public void launAppium() throws MalformedURLException {
    	
	DesiredCapabilities capabilities = new DesiredCapabilities();
	
	//dumpsys window windows | grep -E ‘mCurrentFocus’
	capabilities.setCapability("deviceName", "ce051605c151cc3904");
	capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");
	capabilities.setCapability(CapabilityType.VERSION, "6");
	capabilities.setCapability("platformName", "Android");
//	capabilities.setCapability("appPackage", "com.sec.android.app.popupcalculator");
	capabilities.setCapability("appPackage", "am.ggtaxi.main");
//	capabilities.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
	capabilities.setCapability("appActivity", "am.ggtaxi.main.activities.GGIntroActivity");
//	capabilities.setCapability("noReset", true);
    driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);




}
@Test()
public void testCalculator() throws InterruptedException {
	 // Click on DELETE/CLR button to clear result text box before running test.
	  driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_backspace")).click();
      
	  // Click on number 2 button.
	  driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_02")).click();

	  // Click on + button.
	  driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_add")).click();

	  // Click on number 5 button.
	  driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_05")).click();
     
	  // Click on = button.
	  driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_equal")).click();

	  // Get result from result text box.
	  String result = driver.findElement(By.className("android.widget.EditText")).getText();
	  System.out.println("Number sum result is : " + result);
	  
	  Thread.sleep(3000);
	  
	  driver.closeApp();

	 }
	
	

}


