package Launchbrowser;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Demoscreenshtcode {

	public static void main(String[] args) throws Exception, IOException {
		System.setProperty("webdriver.gecko.driver","/home/student/Desktop/Divyanijava/geckodriver");
		WebDriver wd=new FirefoxDriver();   //interface
		wd.get("https://demo.opencart.com/");
		TakesScreenshot ts=(TakesScreenshot) wd;
		FileHandler.copy(ts.getScreenshotAs(OutputType.FILE),new File("./screenshot.png"));

	}

}
