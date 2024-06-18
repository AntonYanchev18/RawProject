package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[1]/div/form[2]/div[1]/input")
    private WebElement emailLogin;


    @FindBy(name = "password")
    private WebElement passwordLogin;

    @FindBy(className = "_simpleButtonDark_1i0iv_44")
    private WebElement clickLoginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void setEmailLogin (String email) {
        emailLogin.sendKeys(email);
    }

    public void setPassword (String password) {
        passwordLogin.sendKeys(password);
    }

    public LoginPage setClickLoginButton () {
        clickLoginButton.click();
        return new LoginPage(driver);
    }

}

