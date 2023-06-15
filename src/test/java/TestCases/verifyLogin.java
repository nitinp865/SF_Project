package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import Resources.baseClass;
import Resources.commonUtilities;
import Resources.constant;

public class verifyLogin extends baseClass {
	@Test
	public void Login() throws IOException {		
		LoginPageObjects LPO=new LoginPageObjects(driver);
		LPO.enterUsername().sendKeys(constant.username);
		LPO.enterPassword().sendKeys(constant.password);
		LPO.ClickOnLogin().click();
		
		commonUtilities.handleAssertions(constant.expectedString, LPO.errorMessage().getText());
	}
}
