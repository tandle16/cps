package cPosTestST;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

//import customerServices.LoginPage;
import stServices.LoginST;
import utilShort.BrowseST;

public class STcPos {
	public STcPos(WebDriver driver) {
	//super(driver);
		// TODO Auto-generated constructor stub
	}
	WebDriver driver;
	@Test
	public void Login() throws InterruptedException {
	 BrowseST.browsertoStartST();
	LoginST loginst = PageFactory.initElements(driver, LoginST.class);
	loginst.EnterLoginCredentials("Testid", "TestPW");
}}
