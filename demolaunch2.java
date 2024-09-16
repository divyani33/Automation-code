package democode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demolaunch2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","/home/student/Desktop/Divyanijava/geckodriver");
		WebDriver wd=new FirefoxDriver();   //interface
		wd.get("https://www.saucedemo.com/");

	}

}
