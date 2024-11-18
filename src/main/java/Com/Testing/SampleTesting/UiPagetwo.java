package Com.Testing.SampleTesting;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UiPagetwo {
	public static void main(String[] args) throws InterruptedException {

		String name = "Kiran Reddy";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		String password=getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		
		driver.findElementByCssSelector("#inputUsername").sendKeys(name);
		driver.findElementByCssSelector("input[type*='pass']").sendKeys(password);
		
		driver.findElementById("chkboxOne").click();
//     driver.findElementByXPath("//button[@class='submit signInBtn']").click();
		driver.findElementByXPath("//button[contains(@class,'submit')]").click();
		Thread.sleep(3000);
		System.out.println(driver.findElementByTagName("p").getText());
		Assert.assertEquals(driver.findElementByTagName("p").getText(), "You are successfully logged in.");
		System.out.println(driver.findElementByCssSelector("div[class='login-container'] h2").getText());
		Assert.assertEquals(driver.findElementByCssSelector("div[class='login-container'] h2").getText(),
				"Hello " + name + ",");

		driver.findElementByXPath("//*[text()='Log Out']").click();
		driver.close();
	}

	public static String getPassword(ChromeDriver driver) throws InterruptedException {

		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElementByLinkText("Forgot your password?").click();
		Thread.sleep(3000);
		driver.findElementByClassName("reset-pwd-btn").click();
		String passWordText = driver.findElementByCssSelector(".infoMsg").getText();

		// Please use temporary password 'rahulshettyacademy' to Login.
		String[] passwordAarry = passWordText.split("'");
//		String[] passwordAarry2 = passwordAarry[1].split("'");
//		System.out.println(passwordAarry2[0]);
		String password = passwordAarry[1].split("'")[0];
		
		return password;
	}
}
