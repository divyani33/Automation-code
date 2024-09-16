package democode;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//This KDF code is used to check the workflow of steps of testing

public class KDFcode {

	public static void main(String[] args) throws Exception {System.setProperty("webdriver.gecko.driver","/home/student/Desktop/Divyanijava/geckodriver");
	WebDriver wd=new FirefoxDriver(); //interface
	//.xlsx==>XSSF
	FileInputStream fis = new FileInputStream("/home/student/Desktop/Divyanijava/Dataexcel.xlsx");
	XSSFWorkbook wk=new XSSFWorkbook(fis);
	XSSFSheet sh=wk.getSheet("KDF");
	
	for (int i=1; i<=sh.getLastRowNum();i++)
	{
	String key=sh.getRow(i).getCell(1).toString();


	switch(key)
	{
	case "url":
		wd.get("https://www.saucedemo.com");
		break;
		
	case "username":
		wd.findElement(By.name("user-name")).sendKeys("standard_user");
		break;
	case "password":
		wd.findElement(By.id("password")).sendKeys("secret_sauce");
		break;
	case "login":
		wd.findElement(By.id("login-button")).click();
		break;
	case "clklogout":
		wd.findElement(By.id("react-burger-menu-btn")).click();
		break;	
	case "logout":
		wd.findElement(By.linkText("Logout")).click();
		break;	
	}
System.out.println(key);
	}
	}
}
