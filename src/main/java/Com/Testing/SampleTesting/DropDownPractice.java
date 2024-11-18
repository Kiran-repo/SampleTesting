package Com.Testing.SampleTesting;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		driver.manage().window().maximize();

		driver.findElementById("autosuggest").sendKeys("ar");
		Thread.sleep(3000);
		List<WebElement> options = driver.findElementsByXPath("//li[@class='ui-menu-item'] //a");

		for (WebElement option : options) {
			if (option.getText().equals("San Marino")) {
				option.click();
				
				break;
			}
			System.out.println(option.getText());
		}
		
		WebElement dropd =driver.findElementById("ctl00_mainContent_DropDownListCurrency");
		Select dropdown=new Select(dropd);
		dropdown.selectByIndex(1);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		dropdown.selectByValue("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("USD");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		
		
		driver.findElementById("divpaxinfo").click();
		Thread.sleep(3000);
		WebElement dropDwon=driver.findElementByXPath("//span[@id='hrefIncChd']");
		
		for(int i=1;i<=4;i++) {
			dropDwon.click();
		}
		
	}

}
