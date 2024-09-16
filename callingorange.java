package democode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class callingorange {

	public static void main(String[] args) throws Exception  {
		System.setProperty("webdriver.gecko.driver","/home/student/Desktop/Divyanijava/geckodriver");
		WebDriver wd=new FirefoxDriver();   //interface
		
		orangehrmloginpage olp= new orangehrmloginpage(wd);
		
		Thread.sleep(2000);
		olp.urlorange();
		Thread.sleep(2000);
		olp.usernameorg();
		olp.passwordorg();
		olp.clickloginorg();

	}

}
