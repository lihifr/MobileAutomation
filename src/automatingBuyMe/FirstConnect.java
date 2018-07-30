package automatingBuyMe;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class FirstConnect {

    public static void login (AndroidDriver driver) {
        MobileElement connect = (MobileElement)driver.findElement(Constants4Buyme.FIRST_PAGE_LOGIN);
        connect.click();
    }
}