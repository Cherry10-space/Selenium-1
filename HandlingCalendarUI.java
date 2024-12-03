package selinium;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;

public class HandlingCalendarUI {
public static void main(String[] args) throws InterruptedException {
	        // Setup WebDriver (Ensure ChromeDriver is set up correctly)
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
			driver.findElement(By.xpath("//a[@value='BLR']")).click();//From we gave bnglr it come 
			Thread.sleep(2000); // ====>if we give thread sleep value [2]will give in xpath
			driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
			driver.findElement(By.cssSelector("ui-state-default.ui-state-highlight.ui-state-active")).click();

	        
	}

}
