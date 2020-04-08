package test;

import base.BaseTest;
import com.thoughtworks.gauge.Step;
import page.LoginPage;

import static constant.Constants.*;

public class StepImplementation extends BaseTest {

    LoginPage loginPage;

    @Step("gittigidiyor a git")
    public void homepage() {
        loginPage = new LoginPage(getWebDriver());
    }
    @Step("Giriş yap paneline gel")
    public void loginPanel() {
        loginPage.hoverOn();
    }

    @Step("Giriş yap butonuna tıkla")
    public void loginClickHomepage() {
        loginPage.click(LOG_IN);
    }

    @Step("Email <email> girin")
    public void emailEnter(String email) {
        loginPage.sendEmail(email);
    }

    @Step("Şifre  <qwerty1> girin")
    public void passwordEnter(String password) {
        loginPage.sendPassword(password);
    }

    @Step("Giriş yapa tıkla")
    public void loginClick() {
        loginPage.click(LOG_IN_BUTTON);
    }
}
