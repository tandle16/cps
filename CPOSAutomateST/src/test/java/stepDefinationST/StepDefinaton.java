package stepDefinationST;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import stServices.ContractInformationST;
import stServices.LoginST;
import utilShort.BrowseST;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class StepDefinaton extends BrowseST {
	public StepDefinaton() {
	}

	public StepDefinaton(WebDriver driver) {
		// super(driver);
		System.out.println("StepDefination Copy Contructor");
	}

	@Given("^Initialize the browser with chrome$")
	public static void initialize_the_browser_with_chrome() throws Throwable {
		// System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		browsertoStartST();
		Thread.sleep(2000);
	}

//	@Given("^Navigate to \"([^\"]*)\" site$")
//	public void navigate_to_site(String arg1) throws Throwable {
//		driver.get(arg1);
//	}

	@When("^Vendor Enters LoginDetails \"([^\"]*)\" and \"([^\"]*)\" logsin$")
	public void Vendor_Enters_LoginDetails(String arg1, String arg2) throws Throwable {
		if (driver == null)
			System.out.println("StepDefination driver is null");

		System.out.println("inside vendor credentials");
		LoginST lg = PageFactory.initElements(driver, LoginST.class);
		lg.EnterLoginCredentials(arg1, arg2);

	}

	@Then("^Verify that user sucessfully logged$")
	public void verify_that_user_sucessfully_logged() throws Throwable {

	}

	@Then("^contract listing page to display$")
	public void contract_listing_page_to_display() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^Able to click addshortTerm$")
	public void able_to_click_addshortTerm() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Given("^verify Vendor on contractpageInformation$")
	public void verify_Vendor_on_contractpageInformation() throws Throwable {

	}

	@When("^VendorenterContractInformtion \"([^\"]*)\" and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"$")
	public void vendorentercontractinformtion_and_and_and(String arg1, String arg2, String arg3, String arg4)
			throws Throwable {
		ContractInformationST cist = PageFactory.initElements(driver, ContractInformationST.class);
		cist.ContractSTinformation(arg1, arg2, arg3, arg4);
	}

	@When("^entersConcessionownerdetails \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"and\"([^\"]*)\"$")
	public void entersconcessionownerdetails_and_and_and(String arg1, String arg2, String arg3, String arg4)
			throws Throwable {
		ContractInformationST cist = PageFactory.initElements(driver, ContractInformationST.class);
		cist.concessOwner(arg1, arg2, arg3, arg4);
	}

	@When("^entersFaciltynumber \"([^\"]*)\" and select businessmodel \"([^\"]*)\" and click on AddEvent$")
	public void entersfaciltynumber_and_select_businessmodel_and_click_on_AddEvent(String arg1,String arg2)
			throws Throwable {
	   	ContractInformationST cist = PageFactory.initElements(driver, ContractInformationST.class);
		cist.facilityST(arg1,arg2);
	}
	@When("^enterFirstEventLocationdetails \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and feetype \"([^\"]*)\"$")
	public void enterfirsteventlocationdetails_and_and_and_and_and_feetype(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
	 	ContractInformationST cist = PageFactory.initElements(driver, ContractInformationST.class);
	   cist.EventLocationST(arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@Then("^DepartmentCategoryabletoaddone \"([^\"]*)\" and \"([^\"]*)\" and  \"([^\"]*)\" apply and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void departmentcategoryabletoaddone_and_and_apply_and_and_and(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
		ContractInformationST cist = PageFactory.initElements(driver, ContractInformationST.class);
		cist.DepartmentCategory(arg1, arg2, arg3);
	    
	}

	@Then("^EventAssociatesone clickon CopyOwnerDetailsone and click on AddEventsecond\\.$")
	public void eventassociatesone_clickon_CopyOwnerDetailsone_and_click_on_AddEventsecond() throws Throwable {
		ContractInformationST cist = PageFactory.initElements(driver, ContractInformationST.class);
		cist.eventAssosiate();
	}

	@When("^enterSecondEventLocationdetails \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and feetype \"([^\"]*)\"$")
	public void entersecondeventlocationdetails_and_and_and_feetype(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		ContractInformationST cist = PageFactory.initElements(driver, ContractInformationST.class);
	   cist.secondEventST(arg1, arg2, arg3, arg4);
	}


	

	@Then("^DepartmentCategoryabletoaddsecond \"([^\"]*)\" and \"([^\"]*)\" and  \"([^\"]*)\" apply and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void departmentcategoryabletoaddsecond_and_and_apply_and_and_and(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
		ContractInformationST cist = PageFactory.initElements(driver,ContractInformationST.class);
		cist.dptcategorysecnd();
	  
	}

	@Then("^EventAssociatessecond clickon CopyOwnerDetailssecond and click on AddEventsthird\\.$")
	public void eventassociatessecond_clickon_CopyOwnerDetailssecond_and_click_on_AddEventsthird() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^enterThirdEventLocationdetails \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and feetype \"([^\"]*)\"$")
	public void enterthirdeventlocationdetails_and_and_and_and_and_feetype(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@Then("^DepartmentCategoryabletoaddThird \"([^\"]*)\" and \"([^\"]*)\" and  \"([^\"]*)\" apply and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void departmentcategoryabletoaddthird_and_and_apply_and_and_and(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^EventAssociatesthird clickon CopyOwnerDetailsthird and click on Save\\.$")
	public void eventassociatesthird_clickon_CopyOwnerDetailsthird_and_click_on_Save() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}



}
