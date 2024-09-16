package Launchbrowser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Democheckbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","/home/student/Desktop/Divyanijava/geckodriver");
		WebDriver wd=new FirefoxDriver();   //interface
		wd.get("https://demoqa.com/checkbox");
		//wd.findElement(By.id("remember")).click();   //for click method
		
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));  //wait in selenium
		
		WebElement checkbox=wd.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/ol/li/span/label/span[1]/svg"));
		boolean isselect=checkbox.isSelected();
		
		if (isselect==false)
		{
			checkbox.click();
		}
	}

}
