package Launchbrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class listcode {

	public static void main(String[] args) {
			System.setProperty("webdriver.gecko.driver","/home/student/Desktop/Divyanijava/geckodriver");
		WebDriver wd=new FirefoxDriver();   //interface
		wd.get("https://demo.opencart.com/");
		
		
		List<WebElement>menu=wd.findElements(By.className("nav-item"));
		Actions act=new Actions(wd);
		for (int i=0;i<menu.size();i++)
		{
			System.out.println(menu.get(i).getText());
			act.moveToElement(menu.get(i)).build().perform();		}
	}

}
