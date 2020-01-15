package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CodersGuruAccountCreation {

    private WebDriver driver;

    @Given("I have an open webbrowser")

    public void iHaveAnOpenWebbrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Wojciech\\IdeaProjects\\KursSelenium\\src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @When("I open website {string}")
    public void iOpenWebsite(String arg0) {
        driver.get("https://men-men-s-01.codersguru.pl/");
    }

    @And("I click on create account button on the main page")
    public void iClickOnCreateAccountButtonOnTheMainPage() {
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }

    @And("I click on the option private on the registration page")
    public void iClickOnTheOptionPrivateOnTheRegistrationPage() {
        driver.findElement(By.id("person")).click();
    }

    @And("I put in the field E-mail an e-mail address")
    public void iPutInTheFieldEMailAnEMailAddress() {
        RandomStringUtils.randomNumeric(1,30);
        String email = "wojciech.adamowicz@onet.pl";
        driver.findElement(By.id("fos_user_registration_form_email")).sendKeys(RandomStringUtils.randomNumeric(1,30)+email);
    }

    @And("I put in the field name  user name")
    public void iPutInTheFieldNameUserName() {
        driver.findElement(By.id("fos_user_registration_form_name")).sendKeys("Wojciech");
    }

    @And("I put in the field last name user lastname")
    public void iPutInTheFieldLastNameUserLastname() {
        driver.findElement(By.id("fos_user_registration_form_lastname")).sendKeys("Adamowicz");
    }

    @And("I put in the field password user password")
    public void iPutInTheFieldPasswordUserPassword() {
        driver.findElement(By.id("fos_user_registration_form_plainPassword_first")).sendKeys("Pass123");
    }

    @And("I put in the field repeat password exact same password")
    public void iPutInTheFieldRepeatPasswordExactSamePassword() {
        driver.findElement(By.id("fos_user_registration_form_plainPassword_second")).sendKeys("Pass123");
    }

    @And("I put in the field city user city")
    public void iPutInTheFieldCityUserCity() {
        driver.findElement(By.id("form_city")).sendKeys("Wrocław");
    }

    @And("I put in the field postal code user postal code")
    public void iPutInTheFieldPostalCodeUserPostalCode() {
        driver.findElement(By.id("form_postal_code")).sendKeys("50-001");
    }

    @And("I put in the field street user street")
    public void iPutInTheFieldStreetUserStreet() {
        driver.findElement(By.id("form_street")).sendKeys("Rabarbarowa");
    }

    @And("I put in the field local number user local number")
    public void iPutInTheFieldLocalNumberUserLocalNumber() {
        driver.findElement(By.xpath("//input[@id='form_number']")).sendKeys("12");
    }

    @And("I check the box Familiar with regulations")
    public void iCheckTheBoxFamiliarWithRegulations() {
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
    }

    @And("I click on the button Register")
    public void iClickOnTheButtonRegister() {
        driver.findElement(By.cssSelector(".register__success-button")).click();
    }

    @Then("I have created a new private user account and I check after name if logged user is the same as by the account creation")
    public void iHaveCreatedANewPrivateUserAccountAndICheckAfterNameIfLoggedUserIsTheSameAsByTheAccountCreation() {
    WebElement element = driver.findElement(By.id("user-name"));
    System.out.println(element.getText());
    Assert.assertEquals("Wojciech", element);
    System.out.println(element);
}
}