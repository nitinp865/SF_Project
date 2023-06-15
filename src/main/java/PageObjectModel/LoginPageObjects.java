package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	WebDriver driver;
	
	private By username=By.xpath("//input[@id='username']");
	private By password=By.xpath("//input[@id='password']");
	private By logIn=By.xpath("//input[@id='Login']");
	private By tryForFree=By.xpath("//a[@id='signup_link']");
	private By actualErrorMessage=By.xpath("//div[@id='error']");
	
	public LoginPageObjects(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}
	public WebElement enterUsername() {
		return driver.findElement(username);
	}
	public WebElement enterPassword() {
		return driver.findElement(password);
	}
	public WebElement ClickOnLogin() {
		return driver.findElement(logIn);
	}
	public WebElement ClickOnTryForFree() {
		return driver.findElement(tryForFree);
	}
	public WebElement errorMessage() {
		return driver.findElement(actualErrorMessage);
	}
}
