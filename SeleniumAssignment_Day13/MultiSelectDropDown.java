package SeleniumAssignment_Day13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultiSelectDropDown
{
  @Test
  public void MultipleSelectDropDown() throws InterruptedException 
  {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.get("https://demo.mobiscroll.com/select/multiple-select");
    
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.findElement(By.xpath("//*[@id=\"multiple-select-context\"]/label/span[2]/span[1]")).click();
    Thread.sleep(2000);

    driver.findElement(By.xpath("//*[@id=\"multiple-select-context\"]/div/div[3]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div[41]")).click();
    Thread.sleep(1000);

    driver.findElement(By.xpath("//*[@id=\"multiple-select-context\"]/div/div[3]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div[42]")).click();
    Thread.sleep(1000);

    driver.findElement(By.xpath("//*[@id=\"multiple-select-context\"]/div/div[3]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div[43]")).click();
    
  }
}