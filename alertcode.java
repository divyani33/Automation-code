package Launchbrowser;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alertcode {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","/home/student/Desktop/Divyanijava/geckodriver");
		WebDriver wd=new FirefoxDriver();   //interface
		wd.get("https://vinothqaacademy.com/alert-and-popup/");
		wd.findElement(By.name("alertbox")).click();
		Alert alt=wd.switchTo().alert();
		
		Thread.sleep(2000);
		alt.accept();  //for ok 
		//alt.dismiss(); //for cancel
	}

}
