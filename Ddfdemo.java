package democode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ddfdemo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","/home/student/Desktop/Divyanijava/geckodriver");
		WebDriver wd=new FirefoxDriver(); //interface
		wd.get("https://www.saucedemo.com");
		//.xlsx==>XSSF
		FileInputStream fis = new FileInputStream("/home/student/Desktop/Divyanijava/Dataexcel.xlsx");
		XSSFWorkbook wk=new XSSFWorkbook(fis);
		XSSFSheet sh=wk.getSheet("DDF");
		
		for (int i=1;i<=sh.getLastRowNum();i++)
		{
			XSSFRow rw=sh.getRow(i);
			XSSFCell un=rw.getCell(0);
			XSSFCell pw=rw.getCell(1);
			XSSFCell res=rw.createCell(2);
			
			System.out.println("username="+un+"password="+pw);
			
			try {
				wd.findElement(By.name("user-name")).sendKeys(un.toString());
				
				wd.findElement(By.id("password")).sendKeys(pw.toString());
				wd.findElement(By.id("login-button")).click();
				
				Thread.sleep(2000);
				System.out.println("Valid");
				res.setCellValue("Valid");
			} 
			
			catch (Exception e) 
			{
				System.out.println("Invalid");
				res.setCellValue("Invalid");
			}
		}
		
		FileOutputStream fos = new FileOutputStream("/home/student/Desktop/Divyanijava/Dataexcel.xlsx");
		wk.write(fos);
		
	}

}
