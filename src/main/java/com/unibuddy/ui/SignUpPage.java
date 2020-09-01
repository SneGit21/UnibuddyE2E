package com.unibuddy.ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
 
public class SignUpPage {
 
WebDriver driver;
WebDriverWait wait = new WebDriverWait(driver,30);
public SignUpPage(WebDriver driver){
this.driver=driver;
}
@FindBy(how=How.LINK_TEXT,using="Sign up")
@CacheLookup
WebElement signup;
@FindBy(how=How.XPATH,using="//h1[@class='text-center']")
@CacheLookup
WebElement validateSignUp;

 
public void signUp() {
try {
signup.click();
wait.until(ExpectedConditions.visibilityOf(validateSignUp));
String SignUpPageHeader = validateSignUp.getText();
Assert.assertEquals(SignUpPageHeader, "Create your account");
} catch (Exception e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
 
}
