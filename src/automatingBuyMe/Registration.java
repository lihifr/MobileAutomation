package automatingBuyMe;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import java.util.List;

public class Registration {

    public static void googleRegistration (AndroidDriver driver) {
        MobileElement googleButton = (MobileElement) driver.findElement(Constants4Buyme.GOOGLE_BUTTON);
        googleButton.click();

        List<MobileElement> accountChoice = driver.findElements(Constants4Buyme.CHOOSE_ACCOUNT);
        accountChoice.get(0).click();
    }
}