package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import PageObjectModel.SignupPageObjects;
import Resources.baseClass;
import Resources.commonUtilities;
import Resources.constant;

public class verifySignup extends baseClass {
	@Test
	public void SignUp() throws IOException, InterruptedException {
		LoginPageObjects LPO=new LoginPageObjects(driver);
		LPO.ClickOnTryForFree().click();
		
		SignupPageObjects SPO=new SignupPageObjects(driver);
		//Explicit wait is not working
		commonUtilities.handleExplicitWait(10, SPO.enterFirstName());
		SPO.enterFirstName().sendKeys(constant.firstName);
		SPO.enterLastName().sendKeys(constant.lastName);
		SPO.enterWorkEmail().sendKeys(constant.workEmail);
		
		//Job Title
		commonUtilities.handleStaticDropdown(SPO.ClickOnJobTitle(), 5);
		
		SPO.enterCompany().sendKeys(constant.company);
		
		//Employees
		commonUtilities.handleStaticDropdown(SPO.ClickOnEmployees(), 3);
		
		SPO.enterPhone().sendKeys(constant.phone);
		
		//Country
		commonUtilities.handleExplicitWait(10, SPO.ClickOnCountry());
		commonUtilities.handleStaticDropdown(SPO.ClickOnCountry(), 2);
		
		SPO.ClickOnAgreeCheckbox().click();
		
		commonUtilities.handleAssertions(constant.expectedURL, SPO.actualURL());
	}
}