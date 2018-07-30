package automatingBuyMe;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CardChoice {

    public static void cardFor (AndroidDriver driver) {
        MobileElement giftChoice = (MobileElement)(driver.findElementByAndroidUIAutomator("new UiSelector().text(\"גיפט קארד למסעדות שף\")"));
        giftChoice.click();
    }
}
