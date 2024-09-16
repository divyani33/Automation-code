package democode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class callblaze {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","/home/student/Desktop/Divyanijava/geckodriver");
		WebDriver wd=new FirefoxDriver();   //interface
		//demoblaze bl=new demoblaze(wd);
		demoblaze bl=new demoblaze(wd);
		Thread.sleep(2000);
		bl.urlblaze();
		//bl.fromblaze();
		//bl.toblaze();
		//bl.findflight();
	}

}
