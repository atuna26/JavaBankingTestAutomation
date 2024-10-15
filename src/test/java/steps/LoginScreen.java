package steps;

import io.cucumber.java.en.*;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Driver;
import utils.ElementUtils;

public class LoginScreen {
    private AndroidDriver driver;
    private WebDriverWait wait;
    private Object WebElement;
    private Object pageUp;


    @Given("Ziraat Mobil banking app is opened")
    public void ziraatMobileBankingAppIsOpened() throws  Exception{
        Driver.initDriver();
        System.out.println("driver has started.");
    }

    @When("clicks \"Giriş Yap\" button")
    public void clicksGirisYapButton() throws  Exception{
        WebElement continueButton = ElementUtils.waitForElement(By.id("com.ziraat.ziraatmobil:id/continue_button"),15);
        continueButton.click();
    }

    @And("fills password input")
    public void fillsPasswordInput() throws  Exception
    {
        WebElement passwordInput = ElementUtils.waitForElement(By.id("com.ziraat.ziraatmobil:id/password_edit"),5);
        passwordInput.sendKeys("235689");
    }
    @Then("directs account summary screen")
    public  void directsAccountSummaryScreen() throws  Exception
    {
        WebElement dashboard = ElementUtils.waitForElement(By.id("com.ziraat.ziraatmobil:id/account_name_text"),5);
        assert dashboard.isDisplayed();
    }


}
