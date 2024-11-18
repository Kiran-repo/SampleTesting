package Com.Testing.SampleTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumUIPages {
 public static void main (String [] args) throws InterruptedException {
	 
	 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 ChromeDriver driver=new ChromeDriver();
	 driver.get("https://rahulshettyacademy.com/locatorspractice/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 driver.findElementById("inputUsername").sendKeys("Kiran");
	 driver.findElementByName("inputPassword").sendKeys("Kituu@122");
	 driver.findElementByClassName("submit").click();
	// driver.findElementById("visitUsTwo").click();
	 
	 //CSS Selectors we use without using tagname alaso,just put '.' and calssname.
	 System.out.println(driver.findElementByCssSelector("p.error").getText());
	 driver.findElementByLinkText("Forgot your password?").click();
	 driver.findElementByXPath("//input[@placeholder='Name']").sendKeys("Kiran");
	 driver.findElementByCssSelector("input[placeholder='Email']").sendKeys("kiran1111@gamil.com");
	 driver.findElementByXPath("//input[@placeholder='Phone Number']").sendKeys("8106959659");
	 Thread.sleep(3000);
	 driver.findElementByClassName("reset-pwd-btn").click();
     System.out.println(driver.findElementByCssSelector(".infoMsg").getText());
     driver.findElementByClassName("go-to-login-btn").click();
     Thread.sleep(3000);
     driver.findElementByCssSelector("#inputUsername").sendKeys("Kittu");
     driver.findElementByCssSelector("input[type*='pass']").sendKeys("rahulshettyacademy");
     driver.findElementById("chkboxOne").click();
//     driver.findElementByXPath("//button[@class='submit signInBtn']").click();
     driver.findElementByXPath("//button[contains(@class,'submit')]").click();
//     driver.findElementByCssSelector(".submit").click();
     

 }
}
