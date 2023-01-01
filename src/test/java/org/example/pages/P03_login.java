package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;


public class P03_login {

    By Email = By.id("Email");
    By Password = By.id("Password");
    By LoginButton= By.cssSelector("button[class=\"button-1 login-button\"]");

    public void  setEmail(String E)
    {
         Hooks.driver.findElement(Email).sendKeys(E) ;
    }
    public void  setPassword(String P){
         Hooks.driver.findElement(Password ).sendKeys(P) ;
    }
    public void  clickLoginButton(){
     Hooks.driver.findElement(LoginButton).click() ;
    }

}
