package steps;

import com.codeborne.selenide.SelenideElement;

public class InputSteps {

    public void setPhone(SelenideElement element, String phone) {
        element.setValue(phone);
    }
}
