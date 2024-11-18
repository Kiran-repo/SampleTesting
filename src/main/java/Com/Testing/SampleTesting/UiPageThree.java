package Com.Testing.SampleTesting;

import org.openqa.selenium.chrome.ChromeDriver;

public class UiPageThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.manage().window().maximize();
		//driver.findElementByXPath("//header/div/button[1]/ following-sibling::button[1]").getText();
	System.out.println(driver.findElementByXPath("//header/div/button[1]/ following-sibling::button[1]").getText());
	System.out.println(driver.findElementByXPath("//header/div/button[1]/parent::div/button[2]").getText());
	}

}
