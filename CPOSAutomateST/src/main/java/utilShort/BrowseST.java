package utilShort;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import stServices.BasePageST;

public class BrowseST extends BasePageST {
	public BrowseST() {}
//	public BrowseST(WebDriver driver) {
	//	super(driver);
		// TODO Auto-generated constructor stub
	//}
	public static void browsertoStartST() {
		System.out.println("BrowseST browsertoStartST");
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
    	driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://tandlelenovopc/ltcpos/utility/logon");
		driver.manage().window().maximize();
	    //return driver;
}
}
