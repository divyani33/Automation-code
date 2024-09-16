package dayTestNg;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class seconddatapro {
	WebDriver wd;
  @Test(dataProvider = "dp")
  public void f(String un, String pw) {
	  try {
		  wd.findElement(By.name("user-name")).clear();
		  wd.findElement(By.id("password")).clear();

		  wd.findElement(By.name("user-name")).sendKeys(un);
		  wd.findElement(By.id("password")).sendKeys(pw);
		  wd.findElement(By.id("login-button")).click();
			wd.findElement(By.id("react-burger-menu-btn")).click();
			wd.findElement(By.id("logout_sidebar_link")).click();
			System.out.println("valid");
			
	} catch (Exception e) {
		System.out.println("invalid");
	}
	  
  }

  @BeforeTest
  public void browseropen(){
	  System.setProperty("webdriver.gecko.driver","/home/student/Desktop/Divyanijava/geckodriver");
		wd=new FirefoxDriver();   //interface
		wd.get("https://www.saucedemo.com/");
  }
  
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "standard_user", "secret_sauce" },
      new Object[] { "sfdsdf", "bfsdf" },
      new Object[] { "standard_user", "secret_sauce" },

    };
  }
}
