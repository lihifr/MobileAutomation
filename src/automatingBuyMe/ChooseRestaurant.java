package automatingBuyMe;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

public class ChooseRestaurant {

    public static void restaurant (AndroidDriver driver) {
        String scrollViewContainer_finder = "new UiSelector().resourceIdMatches(\"il.co.mintapp.buyme:id/recycleView\")";
        String neededElement_finder = "new UiSelector().text(\"מסעדת זכאים\")";

        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(" + scrollViewContainer_finder + ")" +
                ".scrollIntoView(" + neededElement_finder + ")")).click();
    }
}
