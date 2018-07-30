package automatingBuyMe;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.util.List;

public class SendingGift {
    public static void send (AndroidDriver driver) {
        driver.findElement(Constants4Buyme.SEND_NOW).click();
        List<MobileElement> how2SendGift = driver.findElements(Constants4Buyme.HOWֹ_TO_SEND);
        how2SendGift.get(2).click();
        driver.findElement(Constants4Buyme.EMAIL).sendKeys("lihi.r@ilyon.net");
        MobileElement end = (MobileElement)(driver.findElementByAndroidUIAutomator("new UiSelector().text(\"המשך\")"));
        end.click();
    }
}
