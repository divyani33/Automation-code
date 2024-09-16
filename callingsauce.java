package democode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class callingsauce {

	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.gecko.driver","/home/student/Desktop/Divyanijava/geckodriver");
	WebDriver wd=new FirefoxDriver();   //interface
	sauceloginpage lp=new sauceloginpage(wd);
	lp.url();
	lp.loginpage();
	lp.addcartbagpack();
	lp.infodetails();
	lp.continueshop();
	lp.logout();
	}
}
