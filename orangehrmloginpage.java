package democode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class orangehrmloginpage {
	
	WebDriver wd;
	public orangehrmloginpage(WebDriver wd)
	{
		this.wd=wd;	
	}
	
	// repository of element
	By uname2 = By.name("username");
	By pword2= By.name("password");
	By login2=By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
	
	//repository of method
	 public void urlorange()
	 {
		 wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	 }
	
	 public void usernameorg()
	 {
		 wd.findElement(uname2).sendKeys("Admin");
	 }
	 

	 public void passwordorg()
	 {
		 wd.findElement(pword2).sendKeys("admin123");
	 }

	 public void clickloginorg()
	 {
		 wd.findElement(login2).click();
	 }

}
