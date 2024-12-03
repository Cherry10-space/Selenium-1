package selinium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class introduction {

	public static void main(String[] args) {
		
		//ChromeDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Documents\\chromedriver.exe");	
		
		//1.Chrome driver
		WebDriver driver = new ChromeDriver();
		
		//2.Firefox Driver
		//WebDriver driver1 = new FirefoxDriver();
		
		//3.Edge Driver
		//WebDriver driver2 = new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select Dropdown = new Select(staticDropdown);
		Dropdown.selectByIndex(3);
		System.out.println(Dropdown.getFirstSelectedOption().getText());
		Dropdown.selectByVisibleText("AED");
		System.out.println(Dropdown.getFirstSelectedOption().getText());
		Dropdown.selectByValue("INR");
		System.out.println(Dropdown.getFirstSelectedOption().getText());
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close();
	}

}
