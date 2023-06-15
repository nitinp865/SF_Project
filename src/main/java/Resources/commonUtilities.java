package Resources;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class commonUtilities {
	public static WebDriver driver;
	public static void handleStaticDropdown(WebElement element, int index) {
		WebElement e=element;
		Select s=new Select(e);
		s.selectByIndex(index);
	}
	public static void handleAssertions(String expected, String actual) {
		SoftAssert sa=new SoftAssert();
		String expectedString=expected;
		String actualString=actual;
		sa.assertEquals(actualString, expectedString);
		sa.assertAll();
	}
	public static void handleExplicitWait(int duration, WebElement element) {
		WebDriverWait wb=new WebDriverWait(driver,Duration.ofSeconds(duration));
		wb.until(ExpectedConditions.visibilityOf(element));
	}
}
