import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import config.ConfigurationManager;
import org.junit.jupiter.api.Test;
import pages.BusinessPage;
import pages.LoyaltyPage;
import pages.MainPage;
import steps.ActionSteps;
import steps.InputSteps;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class AlfaBankTest {

    private final ActionSteps action = new ActionSteps();
    private final InputSteps inputSteps = new InputSteps();
    private static final ConfigurationManager config = ConfigurationManager.getInstance();

    @Test
    void callMeBack() {
        Configuration.browser = "chrome";
        Configuration.browserVersion = config.getSystemProperty("browserVersion");

//        System.out.println(config.getSystemProperty("browserVersion"));
        Configuration.browserSize = "1920x1080";
//        open("https://alfabank.ru/");
        open(config.getProperty("baseUrl"));

        action.verifyClick(page(MainPage.class).businessBtn, "Малому бизнесу и ИП");
//        $x("//a[@title='Малому бизнесу и ИП']").click();
//        $x("//a[@href='/sme/rko/loyalty/' and @data-widget-name='ButtonV2']").click();
        action.verifyClick(page(BusinessPage.class).moreLoyaltyInfoBtn, "Подробнее");

        action.verifyClick(page(LoyaltyPage.class).startBtn, "Начать");

        inputSteps.setPhone(page(LoyaltyPage.class).phoneInput, "9283778272");

        action.verifyClick(page(LoyaltyPage.class).callbackBtn, "Перезвонить мне");


//        $x("//a[@href='#Open-Account' and @data-widget-name='ButtonV2']").click();
//        $x("//input[@data-test-id='phoneInput']").setValue("9287738727");
//        $x("//button[@data-test-id='callbackRequest']").click();
    }

}
