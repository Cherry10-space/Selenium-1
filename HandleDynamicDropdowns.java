package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDynamicDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		////a[@value='MAA'] == Xpath for chennai in console [Chropath]
		
		////a[@value='BLR'] == == Xpath for Bnglr in console [Chropath
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();//From we gave bnglr it come 
		//Thread.sleep(2000);  ====>if we give thread sleep value [2]will give in xpath
		driver.findElement(By.xpath("//a[@value='MAA']")).click(); //from to it will come chennai
		//If the output is not cmg and it throws error in second To Xpath will make path as
		//driver.findElement(By.xpath("//a[@value='MAA']")[2]")).click(); -->by giving this command output will come
		
		}

}
