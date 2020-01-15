package task;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class BookingFlight {

	private Webdriver driver;
	
	@Given("^an open browser with www\\.phptravels\\.net")
	public void anOpenBrowserWithWwwPhptravelsNet() {
	System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.phptravels.net");
	}
	
	@When("^user clicks on Flights tab")
	public void userClicksOnFlightsTab() {
	WebElement flightsTab = driver.findElement(By.xpath("//a[@href = '#flights']"));
	flightsTab.click();
	}
	
	@And("^user selects Round Trip")
	public void userSelectsRoundTrip()
	WebElement roundTrip = driver.findElement(By.xpath("//label[@for = 'flightSearchRadio-1']"));
	roundTrip.click();
	}
	
	@And("^user types \"([^\"]" in From input")
	public void userTypesCityInFromInput(String cityForm) throws InterruptedException {
		WebElement cityFromInput = driver.findElement(By.id("s2id_autogen5"));
		cityFromInput.clear();
		cityFromInput.sendKeys(cityTo);
		Thred.sleep(|: 2000);
		driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul/li[1]/div")).click();
	}
	
	@And("^user types \"([^\"]*)\" in Depart input")
	public void userTypesDepartDate(String depart_date) {
		List<WebElement> inputs = driver.findElement(By.tagName("input"));
		for (WebElement input : inputs) {
			((JavascriptExecutor) driver).executeScript( s: "arguments[0].removeAttribute('readonly','readonly')",input);
		}
		
		WebElement departDateInput = driver.findElement(By.id("FlightsDateStart"));
		departDateInput.sendKeys(depart_date);
	}
	
	@And("^user types \"([^\"]*)\" in Return input")
	public void userTypesReturnDate(String return_date) {
		WebElement departDateInput = driver.findElement(By.id("FlightsDateEnd"));
		departDateInput.sendKeys(return_date);
	}
	
	@And("^user clicks search button")
	public void userClicksSearchButton() {
		WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"flights\"]/div/div[2]/div[4]/button));
		searchBtn.click();
	}
	
	@And("^user clicks on buy button")
	public void userClicksBuyButton() {
		List<WebElement> buyButtons = driver.findElements(By.className("theme-search-results-item-book"));
		buyButtons.get(0).findElement(By.tagName("button")).click();
	}
	
	@And("^user types \"([^\"]*)\" in obligatory input)
	public void userTypesEmail(String email) {
		WebElement emailInput = driver.findElement(By.id("email"));
		emailInput.sendKeys(email);
	}
	
	@And("^user types \"([^\"]*)\" in password input)
	public void userTypesPassword(String password) {
		WebElement passwordInput = driver.findElement(By.id("password"));
		passwordInput.sendKeys(password);
	}
	
	@And("^user types \"([^\"]*)\" in name input)
	public void userTypesName(String name) {
		WebElement nameInput = driver.findElement(By.id("name"));
		nameInput.sendKeys(name);
	}
	
	@And("^user types \"([^\"]*)\" in surname input)
	public void userTypesSurname(String name) {
		WebElement surnameInput = driver.findElement(By.id("surname"));
		surnameInput.sendKeys(surname);
	}
	
	@And("^user types \"([^\"]*)\" in e-mail input)
	public void userTypesEmail(String email) {
		WebElement emailInput = driver.findElement(By.id("email"));
		emailInput.sendKeys(email);
	}
	
	@And("^user types \"([^\"]*)\" in phone input)
	public void userTypesPhone(String phone) {
		WebElement phoneInput = driver.findElement(By.id("phone"));
		phoneInput.sendKeys(phone);
	}
	
	@And("^user types \"([^\"]*)\" in birthday input)
	public void userTypesBirthday(String birthday) {
		WebElement birthdayInput = driver.findElement(By.id("birthday"));
		birthdayInput.sendKeys(birthday);
	}
	
	@And("^user types \"([^\"]*)\" in passport input)
	public void userTypesPassport(String passport) {
		WebElement passportInput = driver.findElement(By.id("passport"));
		passportInput.sendKeys(passport);
	}
	
	@And("^user types \"([^\"]*)\" in expiration date input)
	public void userTypesExpirationDate(String expiration_date) {
		WebElement expirationDateInput = driver.findElement(By.id("expiration-date"));
		expirationDateInput.sendKeys(expiration_date);
	}
	
	@And("^user types \"([^\"]*)\" in card type input)
	public void userTypesCardType(String card_type) {
		WebElement cardInput = driver.findElement(By.id("card-type"));
		cardInput.sendKeys(card_type);
	}
	
	@And("^user types \"([^\"]*)\" in card number input)
	public void userTypesCardNumber(String card_number) {
		WebElement cardNumberInput = driver.findElement(By.id("card-number"));
		cardNumberInput.sendKeys(card_number);
	}
	
	@And("^user selects \"([^\"]*)\" in expiry month dropdown)
	public void userSelectsExpiryMonth(String expiry_month) {
		WebElement expiryMonthSelector = driver.findElement(By.id("expiry-month"));
		select expiryMonthSelect = new Select(expiryMonthSelector);
		expiryMonthSelect.selectByVisibleText(expiry_month);
	}
	
	@And("^user selects \"([^\"]*)\" in expiry year dropdown)
	public void userSelectsExpiryYear(String expiry_year) {
		WebElement expiryYearSelector = driver.findElement(By.id("expiry-year"));
		select expiryYearSelect = new Select(expiryYearSelector);
		expiryYearSelect.selectByVisibleText(expiry_year);
	}
	
	@And("^user types \"([^\"]*)\" in cvv input)
	public void userTypesCvv(String cvv) {
		WebElement cvvInput = driver.findElement(By.id("security_code"));
		cvvInput.sendKeys(cvv);
	}
	
	@And ("^user selects checkbox")
	public void userSelectsCheckbox() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.id("acceptTerm"));
		jse.executeScript( s: "arguments[0].click();,element);
	}
	
	@And ("^user clicks on submit button")
	public void userClicksSubmitButton() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.id("confirmBooking"));
		jse.executeScript( s: "arguments[0].click();,element);
	}
	
	@Then ("^user goes to invoice page")
	public void userGoesToInvoicePage() {
	}
	
	@And ("^closing browser")
	public void closingBrowser() { driver.quit();}
	
}