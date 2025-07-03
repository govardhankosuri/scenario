package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinition {
	WebDriver driver;
	
	@Given("user launch browser")
	public void user_launch_browser() {
		
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
	   
	}
	@Then("user enters URL as {string}")
	public void user_enters_url_as(String url) {
	   
		  driver.get(url);
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Then("user enters username as {string} and password as {string} and click login btn")
	public void user_enters_username_as_and_password_as_and_click_login_btn(String username, String password) {
	    
		  driver.findElement(By.name("username")).sendKeys(username);
		  driver.findElement(By.name("password")).sendKeys(password);
		  
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		 
		
	}
	@Then("go to skills page")
	public void go_to_skills_page() {
	    
		
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a") ).click();
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span")).click();
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]")).click();
	}
	@Then("enters skillname as {string} and skill description as {string} and click save btn")
	public void enters_skillname_as_and_skill_description_as_and_click_save_btn(String skillname, String skilldescription) {
	    
		
	   	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(skillname);
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys(skilldescription);
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
	}
	@Then("logout")
	public void logout() {
	   
	}
	@Then("close the browser")
	public void close_the_browser() {
	    
	}

}
