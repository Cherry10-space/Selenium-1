package selinium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();   //Passengers dropdown to select
		Thread.sleep(2000L);


		   /*int i=1;

		while(i<5)

		{

		driver.findElement(By.id("hrefIncAdt")).click();

		i++;

		}*/
		//System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); //After 5 adults done will check wht text we get so that y we use this cmd

		for(int i=1;i<5;i++)

		{

		driver.findElement(By.id("hrefIncAdt")).click(); //href means incrementing adults + symbol we used for span in div roe-right

		}


		driver.findElement(By.id("btnclosepaxoption")).click(); //button close means done

		//Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

		//System.out.println(driver.findElement(By.id("divpaxinfo")).getText(), //After 5 adults done will check wht text we get so that y we use this cmd

	}

}
