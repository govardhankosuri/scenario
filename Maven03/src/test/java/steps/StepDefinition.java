package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinition { 
	WebDriver driver;
	@Given("User lunch browser")
	public void user_lunch_browser() {
		 driver = new ChromeDriver();
		  driver.manage().window().maximize();
	    
	}
	@Then("user enter url - {string}")
	public void user_enter_url(String url) {
  driver.get(url);
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	}
	@Then("user enters username as {string} and password as {string} and click login button")
	public void user_enters_username_as_and_password_as_and_click_login_button(String username, String password) {
		
		driver.findElement(By.name("username")).sendKeys(username);
		  driver.findElement(By.name("password")).sendKeys(password);
		  
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	    
	}
	@Then("go to admin option")
	public void go_to_admin_option() {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a") ).click();
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span")).click();
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span")).click();
	  
	}
	@Then("go to jobs and click that one")
	public void go_to_jobs_and_click_that_one() {
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[1]")).click();
	}
	@Then("then go to job titles and")
	public void then_go_to_job_titles_and() {
	   
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
	}
	@Then("click ADD button and enter the details")
	public void click_add_button_and_enter_the_details() {

	    
	}
	@Then("close the browser")
	public void close_the_browser() {
	   
	}
	

}
