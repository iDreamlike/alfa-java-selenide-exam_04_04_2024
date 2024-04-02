package steps;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;

public class ActionSteps {

    public void verifyClick(SelenideElement element, String expectedText) {
        element.shouldHave(text(expectedText));
        element.click();
    }
}
