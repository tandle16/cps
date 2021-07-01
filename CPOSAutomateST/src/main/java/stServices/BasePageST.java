package stServices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePageST {
	protected static WebDriver driver;

	public BasePageST() {
	}

//	public BasePageST(WebDriver driver) {
//		System.out.println("setting driver");
//		this.driver = driver;
	// }

	public void WaitOnWebElement(By b) {
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(b));
	}
}
