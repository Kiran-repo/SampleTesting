package Com.Testing.SampleTesting;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize();
		
		
		driver.findElementById("ctl00_mainContent_ddl_originStation1_CTXT").click();
		
		//driver.findElementByXPath("//a[@value='BLR']").click();
		driver.findElementByXPath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']").click();
		//Thread.sleep(2000);
		driver.findElementById("ctl00_mainContent_ddl_destinationStation1_CTXT").click();
		
		//driver.findElementByXPath("//a[@value='MAA'][1]").click();
		driver.findElementByXPath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']").click();
		
	}

}
