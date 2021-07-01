package stServices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginST extends BasePageST {
	public  LoginST(WebDriver driver) {
	//	super(driver);
		if(driver != null)
			System.out.println("LoginST Copy Contructor driver not null");
		else
			System.out.println("LoginST Copy Contructor driver null");
	}

	@FindBy(how = How.ID, using = "TssId")
	WebElement CONUSID;
	@FindBy(how = How.ID, using = "TssPW")
	WebElement CONUSPW;
	@FindBy(how = How.ID, using = "tblLoginOpts")
	WebElement LOGIN;
	@FindBy(how = How.XPATH, using = "//label[@for='filterSelectAll']")
	WebElement SelectALL;
	@FindBy(how = How.ID, using = "btnSelectFilter")
	WebElement SELECT;
	@FindBy(how = How.ID, using = "addRovContract")
	WebElement ADDSTCONTRACT;
	@FindBy(how = How.ID, using = "btnRovRegionOK")
	WebElement CONTRACTREGION;

	public void EnterLoginCredentials(String conid, String conPW) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(CONUSID));
		CONUSID.click();
		System.out.println(conid);
		System.out.println(conPW);
		CONUSID.sendKeys(conid);
		CONUSPW.sendKeys(conPW);
		LOGIN.click();
		wait.until(ExpectedConditions.visibilityOf(SelectALL));
		SelectALL.click();
		SELECT.click();
//		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOf(ADDSTCONTRACT));
		ADDSTCONTRACT.click();
		Thread.sleep(2000);
		CONTRACTREGION.click();

	}
}
