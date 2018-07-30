package automatingBuyMe;

import io.appium.java_client.android.AndroidDriver;

public class Amount {

    public static void giftAmount (AndroidDriver driver) {
        driver.findElement(Constants4Buyme.AMOUNT).sendKeys("500");
        driver.findElement(Constants4Buyme.CHOOSE_AMOUNT).click();
    }
}
