package democode;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HDFdemo {

	public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.gecko.driver","/home/student/Desktop/Divyanijava/geckodriver");
			WebDriver wd=new FirefoxDriver(); //interface
			wd.get("https://www.saucedemo.com");
			//.xlsx==>XSSF
			FileInputStream fis = new FileInputStream("/home/student/Desktop/Divyanijava/Dataexcel.xlsx");
			XSSFWorkbook wk=new XSSFWorkbook(fis);
			XSSFSheet dsh=wk.getSheet("DDF"); //for ddf sheet
			XSSFSheet ksh=wk.getSheet("KDF"); //for kdf sheet
			
			//taken from ddf code
			for (int i=1;i<=dsh.getLastRowNum();i++)
			{
				XSSFRow rw=dsh.getRow(i);
				XSSFCell un=rw.getCell(0);
				XSSFCell pw=rw.getCell(1);
				XSSFCell res=rw.createCell(2);
			
			
			//taken from kdf code
			for (int j=1; j<=ksh.getLastRowNum();j++)
			{
			String key=ksh.getRow(j).getCell(1).toString();


			switch(key)
			{
			case "url":
				wd.get("https://www.saucedemo.com");
				break;
				
			case "username":
				wd.findElement(By.name("user-name")).sendKeys(un.toString());
				break;
			case "password":
				wd.findElement(By.id("password")).sendKeys(pw.toString());
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

}
