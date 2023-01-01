package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class P01_register
{

    private static final By genderMale = By.id("gender-male");
    private static By firstname = By.id("FirstName");
    By lastname = By.id("LastName");
    By EmailFiled = By.id("Email");
    By PasswordFiled = By.id("Password");
    By ConfirmPasswordFiled = By.id("ConfirmPassword");
    By RegisterButton = By.id("register-button");
    By DayOfBerth = By.name("DateOfBirthDay");
    By MonthOfBerth = By.name("DateOfBirthMonth");
    By yearOfBerth = By.name("DateOfBirthYear");
    By SuccessMessage = By.cssSelector("div[class=\"result\"]");


    public static By getFirstname()
    {
        return firstname;
    }

    ///

    public void clickGenderMale ()
    {
        Hooks.driver.findElement(genderMale ) .click();
    }
    public void enterFirstName(String FirstName)
    {
        Hooks.driver.findElement(firstname ) .sendKeys(FirstName) ;
    }
    public void enterLastName(String LastName)
    {
        Hooks.driver.findElement(lastname  ) .sendKeys(LastName) ;
    }
    public void interEmail (String Email)
    {
        Hooks.driver.findElement(EmailFiled ) .sendKeys(Email ) ;
    }
    public void interPassword (String password)
    {
        Hooks.driver.findElement(PasswordFiled ) .sendKeys(password ) ;
    }
    public void interConfirmPassword (String ConfirmPassword)
    {
        Hooks.driver.findElement(ConfirmPasswordFiled  ) .sendKeys(ConfirmPassword ) ;
    }
    public void clickRegisterButton(){
        Hooks.driver.findElement(RegisterButton ).click();
    }
    public String  getSuccessMassage(){
        return  Hooks.driver.findElement(SuccessMessage ).getText();
    }
    public void selectDayOfBerth (int Day)
    {
       Select DayOfBerth1 = new Select(Hooks.driver.findElement(DayOfBerth));
       DayOfBerth1 .selectByIndex(Day);
    }
    public void selectMonthOfBerth (String  month)
    {
        Select DayOfBerth1 = new Select(Hooks.driver.findElement(MonthOfBerth ));
        DayOfBerth1 .selectByVisibleText(month) ;
    }
    public void selectYearOfBerth (String   year)
    {
        Select DayOfBerth1 = new Select(Hooks.driver.findElement(yearOfBerth ));
        DayOfBerth1 .selectByValue(year ) ;
    }
    public void userRegister (){

    }
}
