package Com.Testing.SampleTesting;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
//		driver.findElementById("autosuggest").sendKeys("IN");
//		Thread.sleep(3000);
//	List<WebElement> options =driver.findElementsByCssSelector("li[class='ui-menu-item'] a");
//	
//		for(WebElement option :options) {
//			if(option.getText().equals("India")) {
//				option.click();
//			}
//		}
	
		
		driver.findElementById("autosuggest").sendKeys("PA");
		Thread.sleep(3000);
		List<WebElement> options=driver.findElementsByCssSelector("li[class='ui-menu-item'] a");
		
		for(WebElement option:options) {
			if(option.getText().equals("Spain")) {
				option.click();
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	}

}
