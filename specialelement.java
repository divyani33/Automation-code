package Launchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class specialelement {

	public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.gecko.driver","/home/student/Desktop/Divyanijava/geckodriver");
		WebDriver wd=new FirefoxDriver();   //interface
		wd.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
		wd.findElement(By.id("click")).clear();
		Thread.sleep(2000);
		wd.navigate().back();
		//WebElement dclk=wd.findElement(By.id("clickable"));
		WebElement drag=wd.findElement(By.id("draggable"));
		WebElement drop=wd.findElement(By.id("dropable"));
		Thread.sleep(2000);
		//new Actions(wd).doubleClick(dclk).perform();
		new Actions(wd).dragAndDrop(drag, drop).perform();
	}
}
