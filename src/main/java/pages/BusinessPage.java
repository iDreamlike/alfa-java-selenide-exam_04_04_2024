package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class BusinessPage {

    @FindBy(xpath = "//a[@href='/sme/rko/loyalty/' and @data-widget-name='ButtonV2']")
    public SelenideElement moreLoyaltyInfoBtn;
}
