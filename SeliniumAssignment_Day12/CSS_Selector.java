package SeliniumAssignment_Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		// by using css selector id
		driver.findElement(By.cssSelector("#APjFqb")).sendKeys("Automation Testing");
		
		// by using css selector class
        driver.findElement(By.cssSelector(".u4Uk3c")).click();
	}

}
