package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class LoyaltyPage {

    @FindBy(xpath = "//a[@href='#Open-Account' and @data-widget-name='ButtonV2']")
    public SelenideElement startBtn;

    @FindBy(xpath = "//input[@data-test-id='phoneInput']")
    public SelenideElement phoneInput;

    @FindBy(xpath = "//button[@data-test-id='callbackRequest']")
    public SelenideElement callbackBtn;
}
