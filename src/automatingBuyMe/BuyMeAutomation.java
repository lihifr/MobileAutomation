package automatingBuyMe;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class BuyMeAutomation {

    public static AndroidDriver driver;


        @BeforeClass

        //Setting Appium server connection, opening "Buyme" mobile app
        public static void setUp() throws MalformedURLException {

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
            capabilities.setCapability("appPackage", "il.co.mintapp.buyme");
            capabilities.setCapability("appActivity", "il.co.mintapp.buyme.activities.common.SplashScreen");
            capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);
            capabilities.setCapability("unicodeKeyboard", true);
            capabilities.setCapability("resetKeyBoard", true);
            driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub/"), capabilities);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }

        @Test
        public void test1() {

        //This method enters the app for the first time
            FirstConnect.login(driver);
        }

        @Test
        public void test2() {

        //This method makes first registration through Google account
            Registration.googleRegistration(driver);
        }

        @Test
        public void test3() {

        //This method chooses the kind of gift card
            CardChoice.cardFor(driver);
        }

        @Test
        public void test4() {

        //This method chooses the specific place for the gift card
            ChooseRestaurant.restaurant(driver);
        }

        @Test
        public void test5() {

        //This method chooses the amount loaded gift card amount
            Amount.giftAmount(driver);
        }

        @Test
        public void test6() {

        //This method chooses the sender and receiver details
            SenderReceiver.fromTo(driver);
        }

        @Test
        public void test7() {
        //This method chooses the delivering way
            SendingGift.send(driver);
        }

        @AfterClass

            public static void last () {
            driver.quit();
        }
    }





