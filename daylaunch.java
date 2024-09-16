package Launchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class daylaunch {

	public static void main(String[] args) throws Exception  {
		System.setProperty("webdriver.gecko.driver","/home/student/Desktop/Divyanijava/geckodriver");
	WebDriver wd=new FirefoxDriver();   //interface
	wd.get("https://www.saucedemo.com/");
	wd.findElement(By.name("user-name")).sendKeys("standard_user");
	wd.findElement(By.id("password")).sendKeys("secret_sauce");
	wd.findElement(By.id("login-button")).click();
	
	Thread.sleep(2000);
	// wd.findElement(By.id("")).click();
	//xpath
	//wd.findElement(By.id("react-burger-menu-btn")).click();
	//wd.findElement(By.linkText("Logout")).click();
	
	}

}