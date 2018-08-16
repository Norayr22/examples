package ddd;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.mail.EmailException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class FacebookTesting {
	WebDriver driver;
	@FindBy(xpath = "//div[contains(text(),'Work')]//a[@class = 'profileLink']")
	List<WebElement> worked_at;
	@FindBy(xpath = "(//div[text() = 'Lives in ']//a[@class = 'profileLink'])[2]")
	List<WebElement> lives_in;
	@FindBy(xpath = "//div/span[contains(text(),'@')]")
	List<WebElement> email;
	@FindBy(xpath = "(//div[contains(text(),'Studied')]//a[@class = 'profileLink'])[2]")
	List<WebElement> studied_at;
	@FindBy(xpath = "//span[@class = '_c24 _2ieq']/div[contains(text(),' ')]")
	List<WebElement> birthday;
	public  FacebookTesting(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void startTest() throws InterruptedException, EmailException {




		WebElement username = driver.findElement(By.id("email")); 
		username.sendKeys(Constants.USERNAME);
		Thread.sleep(1500);
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys(Constants.PASSWORD);
		Thread.sleep(1500);
		WebElement login_button = driver.findElement(By.xpath("//input[@value = 'Log In']"));
		login_button.click();
		Thread.sleep(3000);
		WebElement search_field = driver.findElement(By.xpath("//input[@class = '_1frb']"));
		String users[] = {"Vache Hambardzumyan","Artash Mardoyan","Arthur Darbinyan","Gago Alixanyan","Aram Harutyunyan","Armen Ghambaryan","Shushanik Avetisyan",};
		for(int i = 0; i<users.length; i++) {
			search_field.click();
			search_field.clear();
			search_field.sendKeys(users[i]);
			Thread.sleep(1500);
			WebElement search_button = driver.findElement(By.xpath("//i[@class = '_585_']"));
			search_button.click();
			Thread.sleep(1500);
			WebElement searched_user = driver.findElement(By.xpath("(//div[@class = '_52eh _5bcu'])[1]"));
			searched_user.click();
			Thread.sleep(1500);
			WebElement about = driver.findElement(By.xpath("//a[@class = '_6-6' and @data-tab-key='about']"));
			about.click();
			Thread.sleep(1500);
			System.out.println("Full Name is - "+users[i]);

			if(worked_at.size()!= 0) {
				System.out.println("Worked in - "+ worked_at.get(0).getText());
			}

			else{
				System.out.println("no work");
			}


			if(birthday.size()!= 0) {
				System.out.println("Birthday - " + birthday.get(0).getText());
			}

			else{
				System.out.println("no birthday");
			}



			if(email.size()!= 0) {
				System.out.println("Email - " +email.get(0).getText());
			}

			else{
				System.out.println("no email");
			}



			if(studied_at.size()!= 0) {
				System.out.println("Studied at - " + studied_at.get(0).getText());
			}

			else {
				System.out.println("no study");
			}



			if(lives_in.size()!= 0) {
				System.out.println("Lives in - " +lives_in.get(0).getText());
			}

			else{
				System.out.println("no live");
			}








		}
		driver.quit();

	}



}
