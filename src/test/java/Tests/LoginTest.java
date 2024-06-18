package Tests;

import Pages.LoginPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class LoginTest extends MainDriver{
    @Test
    public void testSuccessfulLogin() {
        LoginPage loginPage = new LoginPage(driver);
        //WebElement cookies = driver.findElement(By.className("_buttonAccept_o1n35_79"));


//        Alert alert = driver.switchTo().alert();
//        alert.accept();

        //loginPage.setEmailLogin("adminacc1@test.com");
        loginPage.setPassword("123456");

        loginPage.setClickLoginButton();

    }

}
