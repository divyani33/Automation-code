package democode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class sauceloginpage {

	WebDriver wd;
	public sauceloginpage(WebDriver wd)
	{
		this.wd=wd;
	}
	//repository of element
	By uname=By.id("user-name");
	By pword=By.id("password");
	By login=By.id("login-button");
	By cartbutton=By.id("add-to-cart-sauce-labs-backpack");
	By cartclk= By.className("shopping_cart_link");
	By checkout = By.id("checkout");
	By firstname=By.id("first-name");
	By lastname=By.id("last-name");
	By postalcode=By.id("postal-code");
	By continuedetails=By.id("continue");
	By finishshop = By.id("finish");
	By backhome=By.id("back-to-products");
	By linesclk=By.id("react-burger-menu-btn");
	By logoutbutton=By.id("logout_sidebar_link");
	
	//repository of method
	public void url()
	{
		wd.get("https://www.saucedemo.com/");
	}
	
	public void loginpage()
	{
		wd.findElement(uname).sendKeys("standard_user");
	
		wd.findElement(pword).sendKeys("secret_sauce");

		wd.findElement(login).click();
	}
	
	public void addcartbagpack() {
		wd.findElement(cartbutton).click();
		wd.findElement(cartclk).click();
		wd.findElement(checkout).click();
	}
	public void infodetails() {
		wd.findElement(firstname).sendKeys("Divyani");
		wd.findElement(lastname).sendKeys("Aage");
		wd.findElement(postalcode).sendKeys("400605");
	}
	public void continueshop() {
		wd.findElement(continuedetails).click();
		wd.findElement(finishshop).click();
		wd.findElement(backhome).click();
	}
	public void logout() {
		wd.findElement(linesclk).click();
		wd.findElement(logoutbutton).click();
	}

}
