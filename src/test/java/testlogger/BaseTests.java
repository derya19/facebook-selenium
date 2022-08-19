package testlogger;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTests {
    public ChromeDriver driver;

    @BeforeTest
    public void setUpTest(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");

    }
    @AfterTest
    public void tearDownTest(){
        driver.close();
    }


}
