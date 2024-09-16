package democode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowncode {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","/home/student/Desktop/Divyanijava/geckodriver");
	WebDriver wd=new FirefoxDriver(); 
    wd.get("https://blazedemo.com/");
		
		Select from=new Select(wd.findElement(By.name("fromPort")));
		//from.selectByIndex(2);
		
		from.selectByValue("paris");
		
	}

}
