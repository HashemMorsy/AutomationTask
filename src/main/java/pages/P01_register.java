package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class P01_register {
    
    private WebDriver driver;
    
    public P01_register(WebDriver driver)
    {
        this.driver = driver;
    }

    private static final By genderMale = By.id("gender-male");
    private static final By firstname = By.id("FirstName");
    private static final By lastname = By.id("LastName");
    private static final By EmailFiled = By.id("Email");
    private static final By PasswordFiled = By.id("Password");
    private static final By ConfirmPasswordFiled = By.id("ConfirmPassword");
    private static final By RegisterButton = By.id("register-button");
    private static final By DayOfBerth = By.name("DateOfBirthDay");
    private static final By MonthOfBerth = By.name("DateOfBirthMonth");
    private static final By yearOfBerth = By.name("DateOfBirthYear");
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

    public void interEmail(String Email) {
        driver.findElement(EmailFiled).sendKeys(Email);
    }

    public void interPassword(String password) {
        driver.findElement(PasswordFiled).sendKeys(password);
    }

    public void interConfirmPassword(String ConfirmPassword) {
        driver.findElement(ConfirmPasswordFiled).sendKeys(ConfirmPassword);
    }

    public void clickRegisterButton() {
        driver.findElement(RegisterButton).click();
    }

    public String getSuccessMassage() {
        return driver.findElement(SuccessMessage).getText();
    }

    public void selectDayOfBerth(int Day) {
        Select DayOfBerth1 = new Select(driver.findElement(DayOfBerth));
        DayOfBerth1.selectByIndex(Day);
    }

    public void selectMonthOfBerth(String month) {
        Select DayOfBerth1 = new Select(driver.findElement(MonthOfBerth));
        DayOfBerth1.selectByVisibleText(month);
    }

    public void selectYearOfBerth(String year) {
        Select DayOfBerth1 = new Select(driver.findElement(yearOfBerth));
        DayOfBerth1.selectByValue(year);
    }
}
