package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertions {

    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver (Ensure ChromeDriver is set up correctly)
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        // Assert that the checkbox is not selected initially
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

        // Select the checkbox
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

        // Print the checkbox selection status
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

        // Assert that the checkbox is now selected
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

        // Count the number of checkboxes
        System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']")).getSize());

        // Interact with the "paxinfo" element
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000L);
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        // Add 4 adults
        for (int i = 1; i < 5; i++) {
            driver.findElement(By.id("hrefIncAdt")).click();
        }

        // Close the paxinfo dialog
        driver.findElement(By.id("btnclosepaxoption")).click();

        // Assert the number of adults displayed is correct
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5Adult");

        // Print the paxinfo text
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        // Close the browser
        driver.quit();
    }
}
