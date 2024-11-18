package Com.Testing.SampleTesting;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize();
		
		driver.findElementById("divpaxinfo").click();
		Thread.sleep(3000);
		//int i=1;
//		while (i<5) {
//			driver.findElementById("hrefIncAdt").click();	
//			i++;	
//		}
		
		for(int i=1;i<5;i++) {
			driver.findElementById("hrefIncAdt").click();
		}
		driver.findElementById("btnclosepaxoption").click();
		
		Assert.assertEquals(driver.findElementById("divpaxinfo").getText(), "5 Adult");
		
		Assert.assertFalse(driver.findElementByCssSelector("input[id*='IndArm']").isSelected());
	//	System.out.println(driver.findElementByCssSelector("input[id*='IndArm']").isSelected());
		driver.findElementByCssSelector("input[id*='IndArm']").click();
		//System.out.println(driver.findElementByCssSelector("input[id*='IndArm']").isSelected());
Assert.assertTrue(driver.findElementByCssSelector("input[id*='IndArm']").isSelected());
		//count of all the checkboxes in the webpage.
		
		
		System.out.println(driver.findElementsByCssSelector("input[type='checkbox']").size());
		
		driver.close();
		
	}

}
