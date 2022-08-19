package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By Email_text_box = By.id("email");
    By pass_text_box = By.id("pass");
    By login_button=By.id("royal_login_button");

    By error_message= By.id("name");
    String actual_error_message;

    public void setTextIntoLoginTextBox(String text) {
        // driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS);
        driver.findElement(Email_text_box).sendKeys(text);
    }


    public void setTextIntoPassTextBox(String text){
        driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS);
        driver.findElement(pass_text_box).sendKeys(text);
    }
    public void clickLoginButton(){
        driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS);
        driver.findElement(login_button).click();
    }
    public String getActualErrorMessage() {
        driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS);
        actual_error_message= driver.findElement(error_message).getText();
       return actual_error_message;
    }


}