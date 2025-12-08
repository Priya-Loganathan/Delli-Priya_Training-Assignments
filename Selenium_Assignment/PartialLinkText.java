package Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://money.rediff.com/index.html");
        
        // to get link text
        String text = driver.findElement(By.partialLinkText("Mutual")).getText();
        if(text.equals("Mutual Funds"))
        {
        	System.out.println("Valid");
        }
        else
        {
        	System.out.println("Invalid!"); 
        }

	}

}
