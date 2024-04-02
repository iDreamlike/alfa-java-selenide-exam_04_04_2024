package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {

    @FindBy(xpath = "//a[@title='Малому бизнесу и ИП']")
    public SelenideElement businessBtn;

}
