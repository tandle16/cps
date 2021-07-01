package stServices;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContractInformationST extends BasePageST {
	public ContractInformationST(WebDriver driver) {

	}

	@FindBy(how = How.ID, using = "ccVendorNumberRov")
	WebElement VENDORSHORT;
	@FindBy(how = How.ID, using = "ccContractStartRov")
	WebElement StartContract;
	@FindBy(how = How.CSS, using = " td.ui-datepicker-days-cell-over.ui-datepicker-today")
	WebElement startDate;
	@FindBy(how = How.ID, using = "ccContractEndRov")
	WebElement EndContract;
	@FindBy(how = How.ID, using = "ccContractEndRov")
	WebElement EndContractdate;
	@FindBy(how = How.ID, using = "ccContractNumberRov")
	WebElement ContarctNUM;
	@FindBy(how = How.CSS, using = "div.collapse-rov-conc-owner")
	WebElement ConcOwner;
	@FindBy(how = How.CSS, using = "input.rov-conc-owner.rov-conc-owner-first-name")
	WebElement CFirstName;
	@FindBy(how = How.CSS, using = "input.rov-conc-owner.rov-conc-owner-last-name")
	WebElement cLastName;
	@FindBy(how = How.CSS, using = "input.rov-conc-owner.rov-conc-owner-email-address")
	WebElement eAddress;
	@FindBy(how = How.CSS, using = "input#rovownerphnumber")
	WebElement PhoneNum;
	@FindBy(how = How.CSS, using = "div.collapse-facility")
	WebElement FacilityST;
	@FindBy(how = How.CSS, using = "input.rov-contract-facility.rov-contract-facility-number")
	WebElement FacNum;
	@FindBy(how = How.CSS, using = "a.rov-contract-facility.rov-business-function")
	WebElement SeleBusinMod;
	@FindBy(how = How.LINK_TEXT, using = "Short Term - Commodity Cash and Carry")
	WebElement CashnCarryST;
	@FindBy(how = How.LINK_TEXT, using = "Long Term Roving - Commodity Cash and Carry")
	WebElement LTcashnCarry;
	@FindBy(how = How.LINK_TEXT, using = "Long Term Roving - Other than Cash and Carry (With Deposit")
	WebElement LTother;
	@FindBy(how = How.LINK_TEXT, using = "Long Term Roving - Photography")
	WebElement Photo;
	@FindBy(how = How.LINK_TEXT, using = "Limited Time Events")
	WebElement Events;
	@FindBy(how = How.LINK_TEXT, using = "Short Term Food Agreements")
	WebElement FoodAgmnt;
	@FindBy(how = How.LINK_TEXT, using = "Long Term Roving Food")
	WebElement LTfood;
	@FindBy(how = How.ID, using = "ccAddEvent")
	WebElement ADDEVENT;
	@FindBy(how = How.CSS, using = "input.rov-contract-event.rov-event-name")
	WebElement EventLocation;
	@FindBy(how = How.CSS, using = "input.rov-contract-event.rov-event-suite-nbr")
	WebElement SuitNum;
	@FindBy(how = How.CSS, using = "input.rov-contract-event.rov-event-terminal")
	WebElement Terminalid;
	@FindBy(how = How.CSS, using = "input.rov-dp.rov-contract-event.rov-event-start")
	WebElement calenderstart;
	@FindBy(how = How.CSS, using = "td.ui-datepicker-days-cell-over.ui-datepicker-today")
	WebElement calstartdate;
	@FindBy(how = How.CSS, using = "input.rov-contract-event.rov-event-end.ui-input-text.ui-body-a.hasDatepicker")
	WebElement calenderEnd;
	@FindBy(how = How.CSS, using = "span.ui-icon.ui-icon-circle-triangle-e")
	WebElement calendcliknxt;
	@FindBy(how = How.XPATH, using = "//div[@id='ui-datepicker-div']/descendant::a[contains(text(),'26')]")
	WebElement calEnddate;
	@FindBy(how = How.XPATH, using = "//div[@id='ui-datepicker-div']/descendant::a[contains(text(),'16')]")
	WebElement secndevntstrtdate;
	@FindBy(how = How.XPATH, using = "//div[@id='ui-datepicker-div']/descendant::a[contains(text(),'23')]")
	WebElement secndevntenddate;
	@FindBy(how = How.ID, using = "feeTypeRov")
	WebElement FeeType;
	@FindBy(how = How.ID, using = "lstRfeetype_F")
	WebElement Flat;
	@FindBy(how = How.ID, using = "lstRfeetype_C")
	WebElement Percent;
	@FindBy(how = How.CSS, using = "input.rov-commission-fee-amount.rov-flat")
	WebElement FeeAmount;
	@FindBy(how = How.ID, using = "dept")
	WebElement DeptType;
	@FindBy(how = How.LINK_TEXT, using = "Apparel - Childrens")
	WebElement kidsclothing;
	@FindBy(how = How.LINK_TEXT, using = "Apparel - Mens")
	WebElement MenClothing;
	@FindBy(how = How.LINK_TEXT, using = "Apparel - Womens")
	WebElement womenclothing;
	@FindBy(how = How.LINK_TEXT, using = "Art/Pictures/Posters/Prints")
	WebElement Art;
	@FindBy(how = How.LINK_TEXT, using = "Arts and Crafts")
	WebElement Artncrafts;
	@FindBy(how = How.LINK_TEXT, using = "Automotive - Retail/Accessories")
	WebElement Automotive;
	@FindBy(how = How.LINK_TEXT, using = "Backpacks/Luggage")
	WebElement Baggage;
	@FindBy(how = How.LINK_TEXT, using = "Beauty Supplies")
	WebElement BeautySupplies;
	@FindBy(how = How.LINK_TEXT, using = "Beauty/Cosmetics/Personal Care")
	WebElement cosmetic;
	@FindBy(how = How.LINK_TEXT, using = "Bed and Bath")
	WebElement BedBath;
	@FindBy(how = How.LINK_TEXT, using = "Books/Comics/Magazines")
	WebElement Books;
	@FindBy(how = How.LINK_TEXT, using = "Candy/Food/Nuts")
	WebElement candy;
	@FindBy(how = How.LINK_TEXT, using = "Cell Phone Accessories")
	WebElement cellAccessor;
	@FindBy(how = How.LINK_TEXT, using = "Electronics")
	WebElement electronic;
	@FindBy(how = How.LINK_TEXT, using = "Fashion Accessories")
	WebElement FashionAccess;
	@FindBy(how = How.LINK_TEXT, using = "Fitness & Sporting Goods")
	WebElement Sports;
	@FindBy(how = How.LINK_TEXT, using = "Furniture")
	WebElement Furnitre;
	@FindBy(how = How.LINK_TEXT, using = "Games/Toys")
	WebElement Games;
	@FindBy(how = How.LINK_TEXT, using = "Gifts/Souvenirs")
	WebElement Souvenirs;
	@FindBy(how = How.LINK_TEXT, using = "Handbags")
	WebElement Bags;
	@FindBy(how = How.LINK_TEXT, using = "Home Decor")
	WebElement HomeDec;
	@FindBy(how = How.LINK_TEXT, using = "Jewelry - Fashion")
	WebElement Jewelry;
	@FindBy(how = How.LINK_TEXT, using = "Jewelry - Fine")
	WebElement FineJewel;
	@FindBy(how = How.LINK_TEXT, using = "Kitchenware")
	WebElement Kitchenitem;
	@FindBy(how = How.LINK_TEXT, using = "Misc. Retail")
	WebElement Retail;
	@FindBy(how = How.LINK_TEXT, using = "Pet Supplies")
	WebElement PETS;
	@FindBy(how = How.LINK_TEXT, using = "Shoes")
	WebElement SHOES;
	@FindBy(how = How.LINK_TEXT, using = "Sunglasses")
	WebElement Eanak;
	@FindBy(how = How.LINK_TEXT, using = "Tactical")
	WebElement Tackt;
	@FindBy(how = How.LINK_TEXT, using = "Tools, Lawn and Garden")
	WebElement Gardentools;
	@FindBy(how = How.LINK_TEXT, using = "Watches")
	WebElement WATCH;
	@FindBy(how = How.CSS, using = "a.rov_department_apply")
	WebElement applydepartmn;
	@FindBy(how = How.CSS, using = "a.rov-copy-owner-details")
	WebElement CopyOwnerData;
	@FindBy(how = How.CSS, using = "input.rov-event-individual.rov-individual-first-name")
	WebElement EAFristName;
	@FindBy(how = How.CSS, using = "input.rov-event-individual.rov-individual-last-name")
	WebElement EALastName;
	@FindBy(how = How.CSS, using = "input.rov-event-individual.rov-individual-email-address")
	WebElement EAemail;
	@FindBy(how = How.CSS, using = "input.rov-event-individual.rov-individual-phone-number")
	WebElement EAPhone;

	public void ContractSTinformation(String vendorshort, String startdate, String endDate, String cnumber) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(VENDORSHORT));
		VENDORSHORT.sendKeys(String.valueOf(vendorshort));
		StartContract.click();
		By ST = By.cssSelector("td.ui-datepicker-days-cell-over.ui-datepicker-today");
		WebElement StartDate = driver.findElement(ST);
		// wait.until(ExpectedConditions.elementToBeClickable(ST));
		StartDate.click();
		EndContract.click();
		By ED = By.cssSelector("td.ui-datepicker-days-cell-over");
		WebElement EndDate = driver.findElement(ED);
		EndDate.click();
		// EndContractdate.sendKeys(String.valueOf(endDate));
		ContarctNUM.sendKeys(String.valueOf(cnumber));
	}

	public void concessOwner(String cfirstname, String clastname, String email, String number) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(ConcOwner));
		ConcOwner.click();
		CFirstName.sendKeys(String.valueOf(cfirstname));
		cLastName.sendKeys(String.valueOf(clastname));
		eAddress.sendKeys(String.valueOf(email));
		PhoneNum.sendKeys(String.valueOf(number));
	}

	public void facilityST(String facilitynum, String STbusinessModel) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", FacilityST);
		FacilityST.click();
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(FacNum));
		FacNum.sendKeys(String.valueOf(facilitynum));
		SeleBusinMod.click();

		if (STbusinessModel.equalsIgnoreCase("cashncarryST")) {
			js.executeScript("arguments[0].scrollIntoView();", CashnCarryST);
			CashnCarryST.click();
		} else if (STbusinessModel.equalsIgnoreCase("ltcashnCarry")) {
			LTcashnCarry.click();
		} else if (STbusinessModel.equalsIgnoreCase("ltother")) {
			LTother.click();
		} else if (STbusinessModel.equalsIgnoreCase("photo")) {
			Photo.click();
		} else if (STbusinessModel.equalsIgnoreCase("foodagmnt")) {
			FoodAgmnt.click();
		} else if (STbusinessModel.equalsIgnoreCase(" ltfood")) {
			LTfood.click();
		}
	}

	public void EventLocationST(String eventlocation, String numsuite, String terminal, String caldatestart,
			String calenddate, String amount) throws InterruptedException {
		ADDEVENT.click();
		EventLocation.sendKeys(String.valueOf(eventlocation));
		SuitNum.sendKeys(String.valueOf(numsuite));
		Terminalid.sendKeys(String.valueOf(terminal));
		calenderstart.click();
//		DateFormat dateFormat2 = new SimpleDateFormat("dd");
//		Date date2 = new Date();
//
//		String today = dateFormat2.format(date2);
//
//		// find the calendar
//		WebElement dateWidget = driver.findElement(By.id("ui-datepicker-div"));
//		List<WebElement> columns = dateWidget.findElements(By.cssSelector("a.ui-state-default.ui-state-highlight"));
//
//		// comparing the text of cell with today's date and clicking it.
//		for (WebElement cell : columns) {
//			if (cell.getText().equals(today)) {
//				cell.click();
//				break;
//			}

		// calstartdate.sendKeys(String.valueOf(caldatestart));
		// JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		// jse2.executeScript("document.getElement(By.CSS("td.ui-datepicker-days-cell-over.ui-datepicker-today\").value='"
		// + caldatestart + "'");
		// caldatestart.click();
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(calstartdate));
		Actions action = new Actions(driver);
		action.moveToElement(calstartdate).build().perform();
		calstartdate.click();
		calenderEnd.click();
		calendcliknxt.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(calEnddate));
		action.moveToElement(calEnddate).build().perform();
		calEnddate.click();
		// calEnddate.sendKeys(String.valueOf(calenddate));
		wait.until(ExpectedConditions.elementToBeClickable(FeeType));
		FeeType.click();
		Flat.click();
		Thread.sleep(2000);
		FeeAmount.sendKeys(String.valueOf(amount));
		// DeptType.click();
	}

	public void DepartmentCategory(String artposter, String game, String finejewel) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(DeptType));
		DeptType.click();
		wait.until(ExpectedConditions.elementToBeClickable(Art));
		Art.click();
		wait.until(ExpectedConditions.elementToBeClickable(Games));
		Games.click();
		FineJewel.click();
		Thread.sleep(2000);
		applydepartmn.click();

	}

	public void eventAssosiate() {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(CopyOwnerData));
		CopyOwnerData.click();
		// ADDEVENT.click();
	}

	public void secondEventST(String locationevntnametwo, String suitenumtw, String terminidtw, String feepercntw)
			throws InterruptedException {
		ADDEVENT.click();

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("665,53");
		By evntwo = By.cssSelector("input.rov-contract-event.rov-event-name");
		List<WebElement> lst = driver.findElements(evntwo);
		WebElement weev2 = null;
		for (WebElement elem : lst) {
			if (elem.isDisplayed()) {
				weev2 = elem;
				break;
			}
		}
		By suitewo = By.cssSelector("input.rov-contract-event.rov-event-suite-nbr");
		List<WebElement> lstsuit = driver.findElements(suitewo);
		WebElement suit2 = null;
		for (WebElement elm : lstsuit) {
			if (elm.isDisplayed()) {
				suit2 = elm;
				break;
			}
		}

		By tid2 = By.cssSelector("input.rov-contract-event.rov-event-terminal");
		List<WebElement> tdlst = driver.findElements(tid2);
		WebElement terid = null;
		for (WebElement elmt : tdlst) {
			if (elmt.isDisplayed()) {
				terid = elmt;
				break;
			}
		}

		By cast = By.cssSelector("input.rov-dp.rov-contract-event.rov-event-start");
		List<WebElement> stlst = driver.findElements(cast);
		WebElement calst = null;
		for (WebElement evst : stlst) {
			if (evst.isDisplayed()) {
				calst = evst;
				break;
			}
		}
		weev2.sendKeys(String.valueOf(locationevntnametwo));
		suit2.sendKeys(String.valueOf(suitenumtw));
		terid.sendKeys(String.valueOf(terminidtw));
		Thread.sleep(2000);
		calst.click();
		Thread.sleep(2000);
		// By.xpath("//div[@id='ui-datepicker-div']/descendant::a[contains(text(),'17')]");
		By dtst = By.cssSelector("td.ui-datepicker-today");
		List<WebElement> dtstlst = driver.findElements(dtst);
		WebElement stdt = null;
		for (WebElement evsdt : dtstlst) {
			if (evsdt.isDisplayed()) {
				stdt = evsdt;
				break;
			}
		}

		Thread.sleep(2000);
//		
//		DateFormat dateFormat2 = new SimpleDateFormat("mm/dd/yyyy");
//
//		Date date2 = new Date();
//		Calendar cl = Calendar.getInstance();
//		cl.setTime(date2);
//		date2=cl.getTime();
//		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(dtst));
		Actions a = new Actions(driver);
		a.moveToElement(stdt).build().perform();
		Thread.sleep(2000);
		stdt.click();
		// calendt.click();

		By calen = By.cssSelector("input.rov-contract-event.rov-event-end.ui-input-text.ui-body-a.hasDatepicker");
		List<WebElement> calenlst = driver.findElements(calen);
		WebElement calendt = null;
		for (WebElement endclk : calenlst) {
			if (endclk.isDisplayed()) {
				calendt = endclk;
				break;
			}
		}
		calendt.click();
		By cnx = By.cssSelector("a.ui-datepicker-next");
		List<WebElement> cnxlst = driver.findElements(cnx);
		WebElement cnt = null;
		for (WebElement ntc : cnxlst) {
			if (ntc.isDisplayed()) {
				cnt = ntc;
				break;
			}
		}
		cnt.click();
		Thread.sleep(2000);
		By cendte = By.xpath("//div[@id='ui-datepicker-div']/descendant::a[contains(text(),'26')]");
		List<WebElement> cendtlst = driver.findElements(cendte);
		WebElement calend = null;
		for (WebElement clen : cendtlst) {
			if (clen.isDisplayed()) {
				calend = clen;
				break;
			}
		}
		wait.until(ExpectedConditions.elementToBeClickable(calend));
		a.moveToElement(calend).build().perform();
		calend.click();
		Thread.sleep(2000);
		By fs = By.id("feeTypeRov");
		List<WebElement> fslst = driver.findElements(fs);
		WebElement sefe = null;
		for (WebElement sltfee : fslst) {
			if (sltfee.isDisplayed()) {
				sefe = sltfee;
				break;
			}
		}
//		sefe.click();
//		By flt = By.id("lstRfeetype_F");
//		List<WebElement> fltlst =  driver.findElements(flt);
//		WebElement flat =null;
//		for(WebElement ft : fltlst ) {
//			if(ft.isDisplayed()) {
//				flat  = ft;
//				break;
//			}
//		}
		sefe.click();
		Thread.sleep(2000);
		By pt = By.id("lstRfeetype_C");
		List<WebElement> ptlst = driver.findElements(pt);
		WebElement percnt = null;
		for (WebElement p : ptlst) {
			if (p.isDisplayed()) {
				percnt = p;
				break;
			}
		}
		wait.until(ExpectedConditions.visibilityOf(percnt));
		percnt.click();

	}

	public void dptcategorysecnd() throws InterruptedException {
		Thread.sleep(2000);
		By dt = By.id("dept");
		List<WebElement> dptlst = driver.findElements(dt);
		WebElement dpt = null;
		for (WebElement d : dptlst) {
			if (d.isDisplayed()) {
				dpt = d;
				break;
			}
		}
		// WaitOnWebElement(dt);
		dpt.click();
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		By bl = By.linkText("Backpacks/Luggage");
		List<WebElement> baglst = driver.findElements(bl);
		WebElement bagg = null;
		for (WebElement baglag : baglst) {
			if (baglag.isDisplayed()) {
				bagg = baglag;
				break;
			}
		}
		bagg.click();
		Thread.sleep(2000);
		By bs = By.linkText("Beauty Supplies");
		List<WebElement> beulst = driver.findElements(bs);
		WebElement betysup = null;
		for (WebElement bts : beulst) {
			if (bts.isDisplayed()) {
				betysup = bts;
				break;
			}
		}
		betysup.click();
		Thread.sleep(2000);
		By fa = By.linkText("Fashion Accessories");
		List<WebElement> falst = driver.findElements(fa);
		WebElement fassori = null;
		for (WebElement fj : falst) {
			if (fj.isDisplayed()) {
				fassori = fj;
				break;
			}
		}
		fassori.click();
		Thread.sleep(2000);
		By apdep = By.cssSelector("a.rov_department_apply");
		List<WebElement> applst = driver.findElements(apdep);
		WebElement aply = null;
		for (WebElement A : applst) {
			if (A.isDisplayed()) {
				aply = A;
				break;
			}
		}
		aply.click();
		Thread.sleep(2000);

	}

	public void evntsecndAssociate() {

	}

}