package rahulcode;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	        
	        ChromeDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	        try {
	            // Step 1: Load URL
	            driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");

	            // Switch to iframe
	            driver.switchTo().frame("iframeResult");

	            // Step 2: Click on "Try it" button
	            WebElement tryItButton = driver.findElementById("//button[text()='Try it']");
	            tryItButton.click();

	            // Step 3: Send "{your name}" in prompt alert
	            String name = "YourName";
	            org.openqa.selenium.Alert promptAlert = driver.switchTo().alert();
	            promptAlert.sendKeys(name);

	            // Step 4: Get alert text and print in console
	            System.out.println("Alert Text: " + promptAlert.getText());

	            // Step 5: Accept the alert
	            promptAlert.accept();

	            // Step 6: Verify name is printed in the application
	            WebElement outputText = driver.findElementById("demo");
	            if (outputText.getText().contains(name)) {
	                System.out.println("Name successfully printed in the application.");
	            } else {
	                System.out.println("Name not printed in the application.");
	            }

	            // Step 7: Refresh page and repeat steps 2, 3, 4
	            driver.navigate().refresh();
	            driver.switchTo().frame("iframeResult");
	            tryItButton = driver.findElementByXPath("//button[text()='Try it']");
	            tryItButton.click();
	            promptAlert = driver.switchTo().alert();
	            promptAlert.sendKeys(name);
	            System.out.println("Alert Text: " + promptAlert.getText());

	            // Step 8: Dismiss the alert
	            promptAlert.dismiss();

	            // Step 9: Verify name is not printed in the application
	            outputText = driver.findElementById("demo");
	            if (!outputText.getText().contains(name)) {
	                System.out.println("Name is not printed in the application as expected.");
	            } else {
	                System.out.println("Name is incorrectly printed in the application.");
	            }

	            // Step 10: Click on "Home" button
	            driver.switchTo().defaultContent();
	            WebElement homeButton = driver.findElementById("tryhome");
	            homeButton.click();

	        } finally {
	            // Close the browser
	            driver.quit();
	        }
	}

}
