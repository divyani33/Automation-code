package democode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class demoblaze {

	WebDriver wd;
	public demoblaze(WebDriver wd)
	{
		this.wd=wd;
	}
	
	By fromloc=By.name("fromPort");
	By toloc= By.name("toPort");
	By search=By.className("btn btn-primary");

	
	//repository of method
	public void urlblaze()
	{
		wd.get("https://blazedemo.com/");
	}
	
//	public void fromblaze()
//	{
//		Select from= new Select( wd.findElement(fromloc));
//		from.selectByIndex(3);
//		
//	}
//	public void toblaze()
//	{
//		Select from= new Select(wd.findElement(to));
//		from.selectByIndex(2);
//	}
//	public void findflight()
//	{
//		wd.findElement(search).click();
	//}
	
}
