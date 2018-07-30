package automatingBuyMe;

import io.appium.java_client.android.AndroidDriver;

public class SenderReceiver {
    public static void fromTo (AndroidDriver driver) {
        driver.findElement(Constants4Buyme.FOR_ֹWHOM).sendKeys("Chiborashka");
        driver.findElement(Constants4Buyme.GREETINGS).sendKeys("For your orange birthday!");
        driver.findElement(Constants4Buyme.SCROLL_DOWN).click();
        driver.findElement(Constants4Buyme.FROM).clear();
        driver.findElement(Constants4Buyme.FROM).sendKeys("Crocodile Genna");
        driver.findElement(Constants4Buyme.NEXT).click();

    }
}
