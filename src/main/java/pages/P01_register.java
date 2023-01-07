package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import testDataTypes.Customer;

public class P01_register {

    private final WebDriver driver;

    public P01_register(WebDriver driver) {
        this.driver = driver;
    }

    private static final By genderMale = By.id("gender-male");
    private static final By firstname = By.id("FirstName");
    private static final By lastname = By.id("LastName");
    private static final By emailFiled = By.id("Email");
    private static final By passwordFiled = By.id("Password");
    private static final By confirmPasswordFiled = By.id("ConfirmPassword");
    private static final By registerButton = By.id("register-button");
    private static final By dayOfBirth = By.name("DateOfBirthDay");
    private static final By monthOfBirth = By.name("DateOfBirthMonth");
    private static final By yearOfBirth = By.name("DateOfBirthYear");
    private static final By SuccessMessage = By.cssSelector("div[class=\"result\"]");


    public void clickGenderMale() {
        driver.findElement(genderMale).click();
    }

    public void enterFirstName(String FirstName) {
        driver.findElement(firstname).sendKeys(FirstName);
    }

    public void enterLastName(String LastName) {
        driver.findElement(lastname).sendKeys(LastName);
    }

    public void enterEmail(String Email) {
        driver.findElement(emailFiled).sendKeys(Email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordFiled).sendKeys(password);
    }

    public void enterConfirmPassword(String ConfirmPassword) {
        driver.findElement(confirmPasswordFiled).sendKeys(ConfirmPassword);
    }

    public void clickRegisterButton() {
        driver.findElement(registerButton).click();
    }

    public String getSuccessMassage() {
        return driver.findElement(SuccessMessage).getText();
    }

    public void selectDayOfBirth(int Day) {
        Select DayOfBerth1 = new Select(driver.findElement(dayOfBirth));
        DayOfBerth1.selectByIndex(Day);
    }

    public void selectMonthOfBirth(String month) {
        Select DayOfBerth1 = new Select(driver.findElement(monthOfBirth));
        DayOfBerth1.selectByVisibleText(month);
    }

    public void selectYearOfBirth(String year) {
        Select DayOfBerth1 = new Select(driver.findElement(yearOfBirth));
        DayOfBerth1.selectByValue(year);
    }

    public void fill_PersonalDetails(Customer customer) {
        clickGenderMale();
        enterFirstName(customer.firstName);
        enterLastName(customer.lastName);
        enterEmail(customer.emailAddress);
        enterPassword(customer.password);
        enterConfirmPassword(customer.confirmPassword);

    }
}
