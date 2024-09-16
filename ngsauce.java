package dayTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ngsauce {
	WebDriver wd;
	
	@Test
	 public void logout() {
		wd.findElement(By.id("react-burger-menu-btn")).click();
		wd.findElement(By.linkText("Logout")).click();
	}
	
  @BeforeClass
  public void launchbrowser() {
	  System.setProperty("webdriver.gecko.driver","/home/student/Desktop/Divyanijava/geckodriver");
		wd=new FirefoxDriver();   //interface
		wd.get("https://www.saucedemo.com/");
  }
  
  @BeforeMethod
  public void login(){
		wd.findElement(By.name("user-name")).sendKeys("standard_user");
		wd.findElement(By.id("password")).sendKeys("secret_sauce");
		wd.findElement(By.id("login-button")).click();
		
  }
}
