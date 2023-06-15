package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPageObjects {
	WebDriver driver;
	
	private By firstName=By.xpath("//input[@name='UserFirstName']");
	private By lastName=By.xpath("//input[@name='UserLastName']");
	private By workEmail=By.xpath("//input[@name='UserEmail']");
	private By jobTitleDropdown=By.xpath("//select[@name='UserTitle']");
	private By company=By.xpath("//input[@name='CompanyName']");
	private By employeesDropdown=By.xpath("//select[@name='CompanyEmployees']");
	private By phone=By.xpath("//input[@name='UserPhone']");
	private By country=By.xpath("//select[@name='CompanyCountry']");
	private By agreeCheckbox=By.xpath("//div[@class='msaCheckbox checkboxInput section']//div//div//div[@class='checkbox-ui']");

	public SignupPageObjects(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}
	public WebElement enterFirstName() {
		return driver.findElement(firstName);
	}
	public WebElement enterLastName() {
		return driver.findElement(lastName);
	}
	public WebElement enterWorkEmail() {
		return driver.findElement(workEmail);
	}
	public WebElement ClickOnJobTitle() {
		return driver.findElement(jobTitleDropdown);
	}
	public WebElement enterCompany() {
		return driver.findElement(company);
	}
	public WebElement ClickOnEmployees() {
		return driver.findElement(employeesDropdown);
	}
	public WebElement enterPhone() {
		return driver.findElement(phone);
	}
	public WebElement ClickOnCountry() {
		return driver.findElement(country);
	}
	public WebElement ClickOnAgreeCheckbox() {
		return driver.findElement(agreeCheckbox);
	}
	public String actualURL() {
		return driver.getCurrentUrl();
	}
}
