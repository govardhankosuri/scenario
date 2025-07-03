package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown {
	
	WebDriver driver;
  @Test
  public void f() {
	  
	  driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  WebElement dd = driver.findElement(By.id("country"));
	  
	  Select sc = new Select(dd);
	  
//	  sc.selectByIndex(6);
//	  sc.selectByValue("uk");
	  sc.selectByVisibleText("India");
	  
	  
	  
	  
  }
}
