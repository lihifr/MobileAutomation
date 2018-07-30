package automatingBuyMe;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

    public class Constants4Buyme {

// For FirstConnection class
        public static final By FIRST_PAGE_LOGIN = By.id("il.co.mintapp.buyme:id/skipButton");
// For Registration class
        public static final By GOOGLE_BUTTON = By.id("il.co.mintapp.buyme:id/googleButton");
        public static final By CHOOSE_ACCOUNT = MobileBy.className("android.widget.LinearLayout");
// For Amount class
        public static final By AMOUNT = By.id("il.co.mintapp.buyme:id/priceEditText");
        public static final By CHOOSE_AMOUNT = By.id("il.co.mintapp.buyme:id/purchaseButton");

// For SenderReceiver class
        public static final By FOR_ֹWHOM = By.id("il.co.mintapp.buyme:id/toEditText");
        public static final By GREETINGS = By.id("il.co.mintapp.buyme:id/blessEditText");
        public static final By SCROLL_DOWN = By.id("il.co.mintapp.buyme:id/scrollArrows");
        public static final By FROM = By.id("il.co.mintapp.buyme:id/userFrom");
        public static final By NEXT = By.id("il.co.mintapp.buyme:id/goNextButton");

        // For SendingGift class
        public static final By SEND_NOW = By.id("il.co.mintapp.buyme:id/nowRadioButton");
        public static final By HOWֹ_TO_SEND = By.id("il.co.mintapp.buyme:id/optionCheckBox");
        public static final By EMAIL = By.className("android.widget.EditText");
    }

