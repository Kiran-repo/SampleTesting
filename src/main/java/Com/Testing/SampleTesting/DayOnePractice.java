package Com.Testing.SampleTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class DayOnePractice {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver();
		String password= getPassWord(driver);
		 driver.get("https://rahulshettyacademy.com/locatorspractice/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		 
		 
		 
		 Thread.sleep(3000);
	driver.findElementById("inputUsername").sendKeys("Kiran");
	driver.findElementByName("inputPassword").sendKeys(password);
	driver.findElementById("chkboxOne").click();
	driver.findElementByXPath("//button[@class='submit signInBtn']").click();
	Assert.assertEquals(driver.findElementByTagName("p").getText(), "You are successfully logged in.");
			
		
	//Assert.assertEquals(driver.findElementByTagName("p").getText(), "You are successfully logged in.");
	
	
	}
	
	public static String getPassWord(ChromeDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		 driver.manage().window().maximize();
		 
		 driver.findElementByLinkText("Forgot your password?").click();
		 Thread.sleep(3000);
		 
		 driver.findElementByXPath("//button[@class='reset-pwd-btn']").click();
		
		 String passWord=driver.findElementByCssSelector("p.infoMsg").getText();
		 String[] getPassword=passWord.split("'");
			String[] finalPassword= getPassword[1].split("'");
			String passwordnew=finalPassword[0];
			// System.out.println(passwordnew);
		
		return passwordnew;
		
	}

}
