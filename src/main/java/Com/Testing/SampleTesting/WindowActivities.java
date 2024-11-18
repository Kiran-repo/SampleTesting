package Com.Testing.SampleTesting;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

	public static void main(String arg[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://google.com");
		Thread.sleep(2000);
		driver.navigate().to("https://rahulshettyacademy.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
	}
}
