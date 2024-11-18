package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GooglePageTest {
	
	WebDriver driver;
  @Test
  public void searchJavaTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  driver=new ChromeDriver();
	  
	  driver.get("https:google.com/");
	  
  }
  
}
