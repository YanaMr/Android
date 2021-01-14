import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;

public class Samsung {

    public AndroidDriver<MobileElement> driver;
    public WebDriverWait wait;

    @Test
    public void basicTest() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Galaxy S10+");
        caps.setCapability("udid", "R58M624ZASB"); //DeviceId from "adb devices" command
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "10");
        caps.setCapability("skipUnlock", "true");
        caps.setCapability("appPackage", "com.gamgee_testing");
        caps.setCapability("appActivity", "com.gamgee_testing.MainActivity");
        caps.setCapability("noReset", "false");
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        wait = new WebDriverWait(driver, 10);


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("colorPreview"))).click();
        driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"colorPreview\"]"));
        driver.getKeyboard().sendKeys("Blue");

//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.permissioncontroller:id/permission_allow_button"))).click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.samsung.android.app.notes:id/fab"))).click();
//        tapByCoordinates(180, 630);
//        driver.getKeyboard().sendKeys("Jopa");
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.samsung.android.app.notes:id/action_save"))).click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"))).click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.samsung.android.app.notes:id/container"))).click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.samsung.android.app.notes:id/action_more"))).click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView"))).click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.samsung.android.app.notes:id/button1"))).click();
//        Assert.assertEquals(wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.samsung.android.app.notes:id/nonote"))).getText(), "No notes");
//
//        driver.quit();
    }

//    public void tapByCoordinates(int x, int y) {
//        new TouchAction(driver)
//                .tap(point(x, y))
//                .waitAction(waitOptions(Duration.ofMillis(250))).perform();
//    }
}