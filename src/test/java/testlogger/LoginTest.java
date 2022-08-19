package testlogger;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTests{
    /**
     * positive case
     */
    @Test
    public void simpleLoginTest(){
        LoginPage loginPage=new LoginPage(driver);
        loginPage.setTextIntoLoginTextBox("deryausta764@gmail.com");
        loginPage.setTextIntoPassTextBox("0536713968.");
        loginPage.clickLoginButton();
    }
    /**
     * negative case
     */
    @Test
    public void simpleInvalidLoginTest(){
        LoginPage loginPage=new LoginPage(driver);
        loginPage.setTextIntoLoginTextBox("deryausta764@gmail.com");
        loginPage.setTextIntoPassTextBox("0536713.");
        loginPage.clickLoginButton();
        Assert.assertNotEquals(loginPage.getActualErrorMessage(),  "derya");
    Assert.assertEquals(loginPage.getActualErrorMessage(), "Girdiğin şifre yanlış. Şifreni mi Unuttun?");
    }
    /**
     * negative case
     */
    @Test
    public void simpleInvalid2LoginTest(){
        LoginPage loginPage=new LoginPage(driver);
        loginPage.setTextIntoLoginTextBox("ddjta@gmail.com");
        loginPage.setTextIntoPassTextBox("0536713968.");
        loginPage.clickLoginButton();
        Assert.assertNotEquals(loginPage.getActualErrorMessage(),  "derya");
        Assert.assertEquals(loginPage.getActualErrorMessage(), "Girdiğin eposta bir hesaba bağli değil?");
    }
}
